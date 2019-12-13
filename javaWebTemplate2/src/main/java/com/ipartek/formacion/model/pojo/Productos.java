package com.ipartek.formacion.model.pojo;

public class Productos {
	
	private int id;
	private String nombre;
	private String precio;
	private String descripcion;
	private String descuento;
	private String foto;
	
		
	public Productos() {
		super();
		this.id = 0;
		this.nombre = "";
		this.precio = "";
		this.descripcion = "";
		this.descuento = "";
		this.foto = "https://s03.s3c.es/imag/_v0/640x450/2/8/5/490x_Oliver-Cromwell-ginebra.jpg";
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


	public String getPrecio() {
		return precio;
	}


	public void setPrecio(String precio) {
		this.precio = precio;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getDescuento() {
		return descuento;
	}


	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return "Productos [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion
				+ ", descuento=" + descuento + ", foto=" + foto + "]";
	}
	
	
	

}
