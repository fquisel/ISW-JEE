package cl.ulagos.modelo;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "servicio")
public class Servicio extends Bien implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int restriccion;
	private Date tiempo;


	public Servicio() {
	}

	public Servicio(int restriccion,Date tiempo) {
		super();
		this.restriccion = restriccion;
		this.tiempo = tiempo;

	}

	public int getRestriccion() {
		return restriccion;
	}

	public void setRestriccion(int restriccion) {
		this.restriccion = restriccion;
	}

	public Date getTiempo() {
		return tiempo;
	}

	public void setTiempo(Date tiempo) {
		this.tiempo = tiempo;
	}

}
