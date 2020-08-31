package proyectoModel.entities;

import java.util.Date;

public class Postulante {

	private int idPostulante;
	private String estadoInscrito;
	private String numCedulaIdentidad;
	private String primerApellido;
	private Date fechaNacimiento;
	private String segundoApellido;
	private String nombres;
	private String nacionalidad;
	private char estadoCivil;
	private char certificadoPermanencia;
	private Date fechaCertificadoPermanencia;
	private char esSeparadoDeHecho;
	private String titulo;
	
	public Postulante() {
		// TODO Auto-generated constructor stub
	}
	
	public Postulante(int idPostulante, String estadoInscrito, String numCedulaIdentidad, String primerApellido,
			Date fechaNacimiento, String segundoApellido, String nombres, String nacionalidad, char estadoCivil,
			char certificadoPermanencia, Date fechaCertificadoPermanencia, char esSeparadoDeHecho, String titulo ) {
		this.idPostulante = idPostulante;
		this.estadoInscrito = estadoInscrito;
		this.numCedulaIdentidad = numCedulaIdentidad;
		this.primerApellido = primerApellido;
		this.fechaNacimiento = fechaNacimiento;
		this.segundoApellido = segundoApellido;
		this.nombres = nombres;
		this.nacionalidad = nacionalidad;
		this.estadoCivil = estadoCivil;
		this.certificadoPermanencia = certificadoPermanencia;
		this.fechaCertificadoPermanencia = fechaCertificadoPermanencia;
		this.esSeparadoDeHecho = esSeparadoDeHecho;
		this.titulo = titulo;
	}

	public int getIdPostulante() {
		return idPostulante;
	}

	public void setIdPostulante(int idPostulante) {
		this.idPostulante = idPostulante;
	}

	public String getEstadoInscrito() {
		return estadoInscrito;
	}

	public void setEstadoInscrito(String estadoInscrito) {
		this.estadoInscrito = estadoInscrito;
	}

	public String getNumCedulaIdentidad() {
		return numCedulaIdentidad;
	}

	public void setNumCedulaIdentidad(String numCedulaIdentidad) {
		this.numCedulaIdentidad = numCedulaIdentidad;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public char getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(char estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public char getCertificadoPermanencia() {
		return certificadoPermanencia;
	}

	public void setCertificadoPermanencia(char certificadoPermanencia) {
		this.certificadoPermanencia = certificadoPermanencia;
	}

	public Date getFechaCertificadoPermanencia() {
		return fechaCertificadoPermanencia;
	}

	public void setFechaCertificadoPermanencia(Date fechaCertificadoPermanencia) {
		this.fechaCertificadoPermanencia = fechaCertificadoPermanencia;
	}

	public char getEsSeparadoDeHecho() {
		return esSeparadoDeHecho;
	}

	public void setEsSeparadoDeHecho(char esSeparadoDeHecho) {
		this.esSeparadoDeHecho = esSeparadoDeHecho;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return numCedulaIdentidad+ " " +primerApellido+ " " +segundoApellido+  " " +nombres;
	}

	
	

}
