package cl.ulagos.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import cl.ulagos.modelo.Servicio;

@Stateless
@LocalBean
public class DAOServicioImpl implements DAOServicio {

	@PersistenceContext
	protected EntityManager em;
	
	public List<Servicio> listar() throws Exception {
		// TODO Auto-generated method stub
		TypedQuery<Servicio> query= em.createQuery("From Servicio", Servicio.class); 
		List<Servicio> listaServicio = query.getResultList();
		return listaServicio;
	}

	public Servicio buscar(Servicio servicio) throws Exception {
		// TODO Auto-generated method stub
		Servicio buscaServicio = em.find(Servicio.class, servicio.getId());
		return buscaServicio;
		
	}

	public void modificar(Servicio servicio) throws Exception {
		// TODO Auto-generated method stub
		em.merge(servicio);
	}

	public void eliminar(Servicio servicio) throws Exception {
		// TODO Auto-generated method stub
		Servicio p = em.merge(servicio);
		em.remove(p);
	}
}