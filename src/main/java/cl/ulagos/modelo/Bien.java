package cl.ulagos.modelo;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity

@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="bien")
public abstract class Bien implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String categoria;
	private Double precioNeto;
	private int oferta;
	private Date tiempoOferta;
	

	public Bien() {
	}
	
	public Bien(int id, String nombre, String categoria, Double precioNeto, int oferta, Date tiempoOferta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precioNeto = precioNeto;
		this.oferta = oferta;
		this.tiempoOferta = tiempoOferta;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Double getPrecioNeto() {
		return precioNeto;
	}
	public void setPrecioNeto(Double precioNeto) {
		this.precioNeto = precioNeto;
	}
	public int getOferta() {
		return oferta;
	}
	public void setOferta(int oferta) {
		this.oferta = oferta;
	}
	public Date getTiempoOferta() {
		return tiempoOferta;
	}
	public void setTiempoOferta(Date tiempoOferta) {
		this.tiempoOferta = tiempoOferta;
	}

}
