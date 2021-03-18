package cl.ulagos.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import cl.ulagos.modelo.Bien;

@Stateless
@LocalBean
public class DAOBienImpl implements DAOBien {

	@PersistenceContext
	protected EntityManager em;
	
	
	
	public List<Bien> listar() throws Exception {
		// TODO Auto-generated method stub
		TypedQuery<Bien> query= em.createQuery("From Bien", Bien.class); 
		List<Bien> listaBien = query.getResultList();
		return listaBien;
	}

	public Bien buscar(Bien bien) throws Exception {
		// TODO Auto-generated method stub
		Bien buscaBien = em.find(Bien.class, bien.getId());
		return buscaBien;
		
	}

	public void modificar(Bien bien) throws Exception {
		// TODO Auto-generated method stub
		em.merge(bien);
	}

	public void eliminar(Bien bien) throws Exception {
		// TODO Auto-generated method stub
		Bien p = em.merge(bien);
		em.remove(p);
	}

}