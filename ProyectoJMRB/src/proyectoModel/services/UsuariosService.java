package proyectoModel.services;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;

import proyectoModel.entities.Usuario;
import proyectoModel.utils.Conexion;

public class UsuariosService {
	
private Conexion con = new Conexion();
	
	public Usuario iniciarSesion(String correo, String password) {
		Usuario usuario = null;
		con.conectar();
		try {
			String sql = "SELECT CORREO, PASS, NOMBRE FROM USUARIOS WHERE CORREO=? AND PASS=?";
			PreparedStatement st = con.getCon().prepareStatement(sql);
			st.setString(1,correo);
			st.setString(2,password);
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				usuario = new Usuario();
				usuario.setCorreo(rs.getString(1));
				usuario.setClave(rs.getString(2));
				usuario.setNombre(rs.getString(3));
			}
			
		}catch(Exception ex) {
			System.out.println(ex);
		}finally {
			con.desconectar();
		}
		return usuario;
	}
//Lista temporal para probar control de acceso
	//	private List<Usuario> usuarios = Arrays.asList(new Usuario("seba@unab.cl"
//			, "7c4a8d09ca3762af61e59520943dc26494f8941b"));
//Para probar control de acceso
//	public Usuario iniciarSesion(String correo, String password) {
//		
//		for(Usuario usuario : usuarios) {
//			if(usuario.getCorreo().equals(correo) && usuario.getClave().equals(password)) {
//				return usuario;
//			}
//		}
//		return null;
//	}

}
