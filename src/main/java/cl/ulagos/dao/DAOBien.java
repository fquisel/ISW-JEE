package cl.ulagos.dao;

import java.util.List;

import cl.ulagos.modelo.Bien;

public interface DAOBien {
	public void eliminar(Bien bien) throws Exception;
	public void modificar(Bien bien) throws Exception;
	public Bien buscar(Bien bien) throws Exception;
	public List<Bien> listar() throws Exception;
}
