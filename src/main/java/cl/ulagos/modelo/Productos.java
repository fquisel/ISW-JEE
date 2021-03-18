package cl.ulagos.modelo;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "productos")
public class Productos extends Bien implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String tamano;
	private String peso;
	private String color;
	private String material;

	public Productos() {
	}

	public Productos(String tamano, String peso, String color, String material) {
		super();
		this.tamano = tamano;
		this.peso = peso;
		this.color = color;
		this.material = material;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
