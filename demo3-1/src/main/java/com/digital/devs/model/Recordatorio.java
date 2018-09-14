package com.digital.devs.model;

public class Recordatorio {


	private String id;
	private Boolean estado;
	private String descripcion;
	private String horario;
	private String tipo;
	
	public Recordatorio() {
		
	}
	
	
	public Recordatorio(String id, Boolean estado, String descripcion, String horario, String tipo) {
		super();
		this.id = id;
		this.estado = estado;
		this.descripcion = descripcion;
		this.horario = horario;
		this.tipo = tipo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
