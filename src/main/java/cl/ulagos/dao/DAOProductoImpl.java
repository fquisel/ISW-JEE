package cl.ulagos.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import cl.ulagos.modelo.Productos;

@Stateless
@LocalBean
public class DAOProductoImpl implements DAOProducto {

	@PersistenceContext
	protected EntityManager em;
	
	
	
	public List<Productos> listar() throws Exception {
		// TODO Auto-generated method stub
		TypedQuery<Productos> query= em.createQuery("From Productos", Productos.class); 
		List<Productos> listaProducto = query.getResultList();
		return listaProducto;
	}

	public Productos buscar(Productos producto) throws Exception {
		// TODO Auto-generated method stub
		Productos buscaProducto = em.find(Productos.class, producto.getId());
		return buscaProducto;
		
	}

	public void modificar(Productos producto) throws Exception {
		// TODO Auto-generated method stub
		em.merge(producto);
	}

	public void eliminar(Productos producto) throws Exception {
		// TODO Auto-generated method stub
		Productos p = em.merge(producto);
		em.remove(p);
	}
}