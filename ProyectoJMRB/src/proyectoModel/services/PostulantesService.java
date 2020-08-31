package proyectoModel.services;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import proyectoModel.entities.Postulante;
import proyectoModel.utils.Conexion;


public class PostulantesService {

private Conexion conexion = new Conexion();
	

	public Postulante buscarPorRut(String rut) {
		this.conexion.conectar();
		Postulante postulante = null;
		try {
			String sql = "SELECT ID_POSTULANTE, ESTADO_INSCRITO, NUM_CEDULA_IDENTIDAD, FECHA_DE_NACIMIENTO, PRIMER_APELLIDO, SEGUNDO_APELLIDO, NOMBRES, NACIONALIDAD"
					+ "ESTADO_CIVIL, CERTIFICADO_PERMANENCIA, FECHA_CERTIFICADO_PERMANENCIA, ES_SEPARADO_DE_HECHO, TITULO FROM POSTULANTES"
					+" WHERE NUM_CEDULA_IDENTIDAD=? ";
			PreparedStatement st = this.conexion.getCon().prepareStatement(sql);
			st.setString(3, rut);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				
				postulante = new Postulante();
				postulante.setIdPostulante(rs.getInt(1));
				postulante.setEstadoInscrito(rs.getString(2));
				postulante.setFechaNacimiento(rs.getDate(4));
				postulante.setPrimerApellido(rs.getString(5));
				postulante.setSegundoApellido(rs.getString(6));
				postulante.setNombres(rs.getString(7));
				postulante.setNacionalidad(rs.getString(8));
				postulante.setEstadoCivil(rs.getString(9).charAt(0));
				postulante.setCertificadoPermanencia(rs.getString(10).charAt(0));
				postulante.setFechaCertificadoPermanencia(rs.getDate(11));
				postulante.setEsSeparadoDeHecho(rs.getString(12).charAt(0));
				postulante.setTitulo(rs.getString(13));
				
			}
			rs.close();
			return postulante;
		}catch(Exception ex) {
			return null;
		}finally {
			this.conexion.desconectar();
		}
	}
	
	public boolean crear(Postulante p) {
		this.conexion.conectar();
		try {
			String sql = "INSERT INTO POSTULANTES (ESTADO_INSCRITO,NUM_CEDULA_IDENTIDAD,FECHA_DE_NACIMIENTO,"
					+ "PRIMER_APELLIDO,SEGUNDO_APELLIDO,NOMBRES,NACIONALIDAD,ESTADO_CIVIL,CERTIFICADO_PERMANENCIA,FECHA_CERTIFICADO_PERMANENCIA,"
					+ "ES_SEPARADO_DE_HECHO,TITULO)"
					+" VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement st = this.conexion.getCon().prepareStatement(sql);
			
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
			
			st.setString(1, p.getEstadoInscrito());
			st.setString(2, p.getNumCedulaIdentidad());
			st.setString(3, dateFormat.format(p.getFechaNacimiento()));
			st.setString(4, p.getPrimerApellido());
			st.setString(5, p.getSegundoApellido());
			st.setString(6, p.getNombres());
			st.setString(7, p.getNacionalidad());
			st.setString(8, String.valueOf(p.getEstadoCivil()));
			st.setString(9, String.valueOf(p.getCertificadoPermanencia()));
			st.setString(10, dateFormat.format(p.getFechaCertificadoPermanencia()));
			st.setString(11, String.valueOf(p.getEsSeparadoDeHecho()));
			st.setString(12, p.getTitulo());			
			
			st.executeUpdate();
			
			return true;
			
		}catch(SQLException ex) {
			return false;
		}finally {
			this.conexion.desconectar();
		}
	}
	
	public List<Postulante> obtenerTodos(){
		this.conexion.conectar();
		List<Postulante> postulantes = new ArrayList<Postulante>();
		try {		
			
			String sql = "SELECT ID_POSTULANTE, ESTADO_INSCRITO, NUM_CEDULA_IDENTIDAD, FECHA_DE_NACIMIENTO, PRIMER_APELLIDO, SEGUNDO_APELLIDO, NOMBRES, NACIONALIDAD,"
					+ " ESTADO_CIVIL, CERTIFICADO_PERMANENCIA, FECHA_CERTIFICADO_PERMANENCIA, ES_SEPARADO_DE_HECHO, TITULO FROM POSTULANTES ORDER BY NOMBRES";
			PreparedStatement st = this.conexion.getCon().prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				
				Postulante postulante = new Postulante();
				postulante.setIdPostulante(rs.getInt(1));
				postulante.setEstadoInscrito(rs.getString(2));
				postulante.setNumCedulaIdentidad(rs.getString(3));
				postulante.setFechaNacimiento(rs.getDate(4));
				postulante.setPrimerApellido(rs.getString(5));
				postulante.setSegundoApellido(rs.getString(6));
				postulante.setNombres(rs.getString(7));
				postulante.setNacionalidad(rs.getString(8));
				postulante.setEstadoCivil(rs.getString(9).charAt(0));
				postulante.setCertificadoPermanencia(rs.getString(10).charAt(0));
				postulante.setFechaCertificadoPermanencia(rs.getDate(11));
				postulante.setEsSeparadoDeHecho(rs.getString(12).charAt(0));
				postulante.setTitulo(rs.getString(13));
				postulantes.add(postulante);
			}
			rs.close();
			return postulantes;
		}catch(Exception ex) {
			return null;
		}finally {
			this.conexion.desconectar();
		}
	}
	
public boolean actualizarPorId(Postulante postulante) {
		
		this.conexion.conectar();
		try {
			String sql = "UPDATE POSTULANTES SET ESTADO_INSCRITO=?,"
					+ "FECHA_DE_NACIMIENTO=?,"
					+ "PRIMER_APELLIDO=?,"
					+ "SEGUNDO_APELLIDO=?,"
					+ "NOMBRES=?,"
					+ "NACIONALIDAD=?,"
					+ "ESTADO_CIVIL=?,"
					+ "CERTIFICADO_PERMANENCIA=?,"
					+ "FECHA_CERTIFICADO_PERMANENCIA=?,"
					+ "ES_SEPARADO_DE_HECHO=?"
					+ " WHERE ID_POSTULANTE=?";

			PreparedStatement st = this.conexion.getCon().prepareStatement(sql);
			
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
			
			
			
			st.setString(1, postulante.getEstadoInscrito());
			st.setString(2, dateFormat.format(postulante.getFechaNacimiento()));		
			st.setString(3, postulante.getPrimerApellido());
			st.setString(4, postulante.getSegundoApellido());
			st.setString(5, postulante.getNombres());
			st.setString(6, postulante.getNacionalidad());
			st.setString(7, String.valueOf(postulante.getEstadoCivil()));
			st.setString(8, String.valueOf(postulante.getCertificadoPermanencia()));
			st.setString(9, dateFormat.format(postulante.getFechaCertificadoPermanencia()));
			st.setString(10, String.valueOf(postulante.getEsSeparadoDeHecho()));
			st.setInt(11, postulante.getIdPostulante());
			
			st.executeUpdate();
			
			return true;
		}catch(Exception ex) {
			return false;
		}finally {
			this.conexion.desconectar();
		}
	}
	
	public boolean eliminarPorId(Postulante p) {
		this.conexion.conectar();
		try {
			
			String sql = "DELETE FROM POSTULANTES WHERE ID_POSTULANTE=?";
			PreparedStatement st = this.conexion.getCon().prepareStatement(sql);
			st.setInt(1, p.getIdPostulante());
			
			st.executeUpdate();
			
			return true;
		}catch(Exception ex) {
			return false;
		}finally {
			this.conexion.desconectar();
		}
	
	}

}
