package proyectoModel.entities;

import java.util.Date;

public class Usuario {
	
	private String correo;
	private String clave;
	private String nombre;
	
	
	public Usuario(String correo, String clave) {
		this.correo = correo;
		this.clave = clave;
	}
	public Usuario() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}

}
