package proyectoAPP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.commons.codec.digest.DigestUtils;

import proyectoModel.entities.Usuario;
import proyectoModel.services.UsuariosService;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField correoTxt;
	private JPasswordField passwordTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setTitle("https://fpp.minvu.gob.cl");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(69, 221, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Clave");
		lblNewLabel_1.setBounds(69, 275, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		correoTxt = new JTextField();
		correoTxt.setBounds(156, 216, 183, 26);
		contentPane.add(correoTxt);
		correoTxt.setColumns(10);
		
		passwordTxt = new JPasswordField();
		passwordTxt.setBounds(156, 275, 183, 26);
		contentPane.add(passwordTxt);
		
		JButton loguearBtn = new JButton("Iniciar");
		loguearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String correo = correoTxt.getText().trim();
				String password = String.copyValueOf(passwordTxt.getPassword());
				String sha1 = DigestUtils.sha1Hex(password);
				//Muestra sha1 por consola para que se pueda copiar y definir en bd
				//System.out.println(sha1);
				
				UsuariosService servicio = new UsuariosService();
				
				Usuario usuario = servicio.iniciarSesion(correo, sha1);
				if(usuario != null) {
					//Bien! encontramos el usuario, puede iniciar
					//1. Abrir el frame del start
					Menu.usuario = usuario;
					Menu start = new Menu();
					start.setVisible(true);
					dispose();
					//2. Cerrarme
				}else {
					//Mal, error de inicio
					JOptionPane.showMessageDialog(null
							, "Credenciales incorrectas", "Error de Inicio"
							,JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		loguearBtn.setBounds(156, 335, 183, 28);
		contentPane.add(loguearBtn);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2.setBounds(10, 166, 414, 234);
		contentPane.add(lblNewLabel_2);
		
		JTextPane txtpnSistemaIntegradoDe = new JTextPane();
		txtpnSistemaIntegradoDe.setForeground(Color.WHITE);
		txtpnSistemaIntegradoDe.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtpnSistemaIntegradoDe.setDisabledTextColor(Color.WHITE);
		txtpnSistemaIntegradoDe.setCaretColor(Color.WHITE);
		txtpnSistemaIntegradoDe.setBackground(Color.GRAY);
		txtpnSistemaIntegradoDe.setSelectedTextColor(Color.GRAY);
		txtpnSistemaIntegradoDe.setText("Sistema Integrado de \r\nSubsidio Habitacional");
		txtpnSistemaIntegradoDe.setBounds(116, 54, 205, 55);
		contentPane.add(txtpnSistemaIntegradoDe);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(Color.GRAY);
		lblNewLabel_3.setBounds(10, 11, 414, 144);
		contentPane.add(lblNewLabel_3);
	}
}
