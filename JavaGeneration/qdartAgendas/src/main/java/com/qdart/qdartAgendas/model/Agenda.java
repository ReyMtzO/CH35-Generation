package com.qdart.qdartAgendas.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 * En la clase donde se establece la lógica del negocio (model) voy a hacer que coincida con mi DB.
 * Es decir, la clase se convierte en una Entity, con la anotación @Entity 
 * Para establecer la tabla de la DB a la que corresponde esta entidad, utilizamos la anotación @Table(name="table") y el nombre de la tabla
 * Indicarle a JPA mi punto de entrada (PK), usando la anotación @Id
 * Como queremos que el Id sea autoincrementable usamos la anotación @GeneratedValue(strategy = GenerationType.IDENTITY
 * Y si queremos, podemos establecer la columna a la que corresponde cada atributo con la anotación @Column(name="name"), pero SI TENEMOS QUE DEFINIR el nombre de la primera columna sobre el atributo id 
 */


@Entity
@Table(name="agendas")	//nombre de la tabla de la DB
public class Agenda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_agendas")
	private Long id;
	@Column(name="nombreCliente")
	private String nombreCliente;
	@Column(name="telefono")
	private String telefono;
	@Column(name="direccionEvento")
	private String direccionEvento;
	@Column(name="fechaEvento")
	private LocalDate fechaEvento;
	@Column(name="horarioEventoInicial")
	private LocalTime horarioEventoInicial;
	@Column(name="horarioEventoFinal")
	private LocalTime horarioEventoFinal;
	@Column(name="comentarioServicio")
	private String comentarioServicio;

	//JPA necesita un método que le permita construir cualquier objeto sin tomar en cuenta sus atributos. Este método se conoce como constructor vacío
		public Agenda() {	
		}

	public Agenda(Long id, String nombreCliente, String telefono, String direccionEvento, LocalDate fechaEvento, LocalTime horarioEventoInicial,
			LocalTime horarioEventoFinal, String comentarioServicio) {
		this.id = id;
		this.nombreCliente = nombreCliente;
		this.telefono = telefono;
		this.direccionEvento = direccionEvento;
		this.fechaEvento = fechaEvento;
		this.horarioEventoInicial = horarioEventoInicial;
		this.horarioEventoFinal = horarioEventoFinal;
		this.comentarioServicio = comentarioServicio;
	}


	//Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccionEvento() {
		return direccionEvento;
	}

	public void setDireccionEvento(String direccionEvento) {
		this.direccionEvento = direccionEvento;
	}

	public LocalDate getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(LocalDate fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public LocalTime getHorarioEventoInicial() {
		return horarioEventoInicial;
	}

	public void setHorarioEventoInicial(LocalTime horarioEventoInicial) {
		this.horarioEventoInicial = horarioEventoInicial;
	}

	public LocalTime getHorarioEventoFinal() {
		return horarioEventoFinal;
	}

	public void setHorarioEventoFinal(LocalTime horarioEventoFinal) {
		this.horarioEventoFinal = horarioEventoFinal;
	}

	public String getComentarioServicio() {
		return comentarioServicio;
	}

	public void setComentarioServicio(String comentarioServicio) {
		this.comentarioServicio = comentarioServicio;
	}

	
	//toString
	@Override
	public String toString() {
		return "Agenda [id=" + id + ", nombreCliente=" + nombreCliente + ", telefono=" + telefono + ", direccionEvento="
				+ direccionEvento + ", fechaEvento=" + fechaEvento + ", horarioEventoInicial=" + horarioEventoInicial
				+ ", horarioEventoFinal=" + horarioEventoFinal + ", comentarioServicio=" + comentarioServicio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(comentarioServicio, direccionEvento, fechaEvento, horarioEventoFinal, horarioEventoInicial,
				id, nombreCliente, telefono);
	}

	
	//Tenemos que generar dos métodos adicionales: hashCode() y equals(). Se generan de la misma manera que generamos los demás métodos: Click derecho > Source > hashCode() and equals()...
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		return Objects.equals(comentarioServicio, other.comentarioServicio)
				&& Objects.equals(direccionEvento, other.direccionEvento)
				&& Objects.equals(fechaEvento, other.fechaEvento)
				&& Objects.equals(horarioEventoFinal, other.horarioEventoFinal)
				&& Objects.equals(horarioEventoInicial, other.horarioEventoInicial) && Objects.equals(id, other.id)
				&& Objects.equals(nombreCliente, other.nombreCliente) && Objects.equals(telefono, other.telefono);
	}
		
}