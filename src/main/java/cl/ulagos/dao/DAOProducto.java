package cl.ulagos.dao;

import java.util.List;

import cl.ulagos.modelo.Productos;

public interface DAOProducto {
	public void eliminar(Productos producto) throws Exception;
	public void modificar(Productos producto) throws Exception;
	public Productos buscar(Productos producto) throws Exception;
	public List<Productos> listar() throws Exception;
}
