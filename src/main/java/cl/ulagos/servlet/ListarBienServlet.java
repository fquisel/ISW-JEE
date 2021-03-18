package cl.ulagos.servlet;

import java.io.PrintWriter;
import java.util.List;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import cl.ulagos.dao.DAOBien;
import cl.ulagos.modelo.Bien;

@WebServlet(name = "ListarBien", urlPatterns = {"/controlador/ListarBien"})
public class ListarBienServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;
	
	private DAOBien daoBien = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException{
		try{
			InitialContext ctx = new InitialContext();
			daoBien = (DAOBien) ctx.lookup("java:app/sanmateo/DAOBienImpl");
		}catch (Exception e) {
			System.out.println("Problema:"+ e);
		}
		
		try {

			PrintWriter out = response.getWriter();
			response.setContentType("application/json");

			List<Bien> bien = daoBien.listar();
			JsonArray datos = new JsonArray();

			for (Bien b: bien)
			{
				JsonArray fila = new JsonArray();
				fila.add(b.getId());
				fila.add(b.getNombre());
				fila.add(b.getCategoria());
				datos.add(fila);
			}

			JsonObject miembros = new JsonObject();
			miembros.addProperty("echo","1"); //important case-sensitive
			miembros.addProperty("recordsTotal", bien.size());
			miembros.addProperty("recordsFiltered", bien.size());

			miembros.add("data", datos);
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			String json2 = gson.toJson(miembros);
			out.print(json2);
		

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

		
}
