package cl.ulagos.dao;

import java.util.List;

import cl.ulagos.modelo.Servicio;

public interface DAOServicio {
	public void eliminar(Servicio producto) throws Exception;
	public void modificar(Servicio producto) throws Exception;
	public Servicio buscar(Servicio producto) throws Exception;
	public List<Servicio> listar() throws Exception;
}
