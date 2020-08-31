package proyectoAPP;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import proyectoModel.entities.Postulante;
import proyectoModel.services.PostulantesService;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import com.toedter.calendar.JDateChooser;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.ComponentOrientation;
import javax.swing.DefaultComboBoxModel;

public class ActualizarPostulanteFrame extends JFrame {

	private JPanel contentPane;
	private JTextField postulanteIdTxt;
	private JTextField postulanteRutTxt;
	private JTextField postulanteNombreTxt;
	private JComboBox<Postulante> postulantesCbx;
	private JTextField postulanteNacTxt;
	private JTextField postulanteApePatTxt;
	private JTextField postulanteApeMatTxt;
	private JComboBox<Postulante> postulanteInscripTxt;
	JDateChooser postulanteFnacTxt;


	public ActualizarPostulanteFrame() {setTitle("Actualizar Postulantes");
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setBounds(100, 100, 700, 400);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	postulanteIdTxt = new JTextField();
	postulanteIdTxt.setEnabled(false);
	postulanteIdTxt.setColumns(10);
	postulanteIdTxt.setBounds(543, 28, 120, 20);
	contentPane.add(postulanteIdTxt);
	
	postulanteRutTxt = new JTextField();
	postulanteRutTxt.setEnabled(false);
	postulanteRutTxt.setColumns(10);
	postulanteRutTxt.setBounds(160, 78, 120, 20);
	contentPane.add(postulanteRutTxt);
	
	postulanteNombreTxt = new JTextField();
	postulanteNombreTxt.setColumns(10);
	postulanteNombreTxt.setBounds(133, 109, 147, 20);
	contentPane.add(postulanteNombreTxt);
	
	
	
	//Actualizar
	JButton actualizarBtn = new JButton("Actualizar");
	
	
	postulantesCbx = new JComboBox<Postulante>();
	postulantesCbx.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			Postulante postulante = (Postulante)postulantesCbx.getSelectedItem();
			if(postulante != null) {
				//Cargar el formulario
				postulanteIdTxt.setText((String.valueOf(postulante.getIdPostulante())));
				postulanteRutTxt.setText(postulante.getNumCedulaIdentidad());
				postulanteNombreTxt.setText(postulante.getNombres());
				postulanteApePatTxt.setText(postulante.getPrimerApellido());
				postulanteApeMatTxt.setText(postulante.getSegundoApellido());
				postulanteNacTxt.setText(postulante.getNacionalidad());							
				actualizarBtn.setEnabled(true);
				
			}else {
				actualizarBtn.setEnabled(false);
			}
		}
	});
	postulantesCbx.setBounds(163, 28, 230, 20);
	contentPane.add(postulantesCbx);
	
	JLabel lblNewLabel_4 = new JLabel("Seleccione un postulante:");
	lblNewLabel_4.setBounds(21, 28, 168, 20);
	contentPane.add(lblNewLabel_4);
	
	JLabel lblEstadoInscripcin = new JLabel("Estado Inscripci\u00F3n");
	lblEstadoInscripcin.setBounds(337, 75, 102, 27);
	contentPane.add(lblEstadoInscripcin);
	
	JLabel lblNewLabel_1_1_1 = new JLabel("ID Postulante");
	lblNewLabel_1_1_1.setBounds(446, 28, 87, 20);
	contentPane.add(lblNewLabel_1_1_1);
	
	JLabel lblNewLabel_1_1 = new JLabel("");
	lblNewLabel_1_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
	lblNewLabel_1_1.setBackground(Color.LIGHT_GRAY);
	lblNewLabel_1_1.setBounds(10, 11, 664, 50);
	contentPane.add(lblNewLabel_1_1);
	
	postulanteNacTxt = new JTextField();
	postulanteNacTxt.setColumns(10);
	postulanteNacTxt.setBounds(160, 173, 120, 20);
	contentPane.add(postulanteNacTxt);
	
	postulanteApePatTxt = new JTextField();
	postulanteApePatTxt.setColumns(10);
	postulanteApePatTxt.setBounds(160, 141, 120, 20);
	contentPane.add(postulanteApePatTxt);
	
	postulanteApeMatTxt = new JTextField();
	postulanteApeMatTxt.setColumns(10);
	postulanteApeMatTxt.setBounds(495, 141, 120, 20);
	contentPane.add(postulanteApeMatTxt);
	
	JDateChooser postulanteFnacTxt = new JDateChooser();
	postulanteFnacTxt.setBounds(495, 109, 120, 20);
	contentPane.add(postulanteFnacTxt);
	
	JComboBox postulanteEstadoTxt = new JComboBox();
	postulanteEstadoTxt.setName("");
	postulanteEstadoTxt.setModel(new DefaultComboBoxModel(new String[] {"Soltero", "Casado", "Union Civ\u00EDl", "Divorciado", "Viudo"}));
	postulanteEstadoTxt.setBounds(495, 173, 120, 20);
	contentPane.add(postulanteEstadoTxt);
	
	JDateChooser postulanteFechPerTxt = new JDateChooser();
	postulanteFechPerTxt.setBounds(495, 227, 120, 20);
	contentPane.add(postulanteFechPerTxt);
	
	JComboBox postulanteCertPerTxt = new JComboBox();
	postulanteCertPerTxt.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
	postulanteCertPerTxt.setBounds(230, 204, 50, 20);
	contentPane.add(postulanteCertPerTxt);
	
	JComboBox postulanteSepaTxt = new JComboBox();
	postulanteSepaTxt.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
	postulanteSepaTxt.setBounds(337, 238, 50, 20);
	contentPane.add(postulanteSepaTxt);
	
	JLabel lblseEncuentraSeparado = new JLabel("\u00BFSe encuentra separado de hecho y presenta  acreditaci\u00F3n ");
	lblseEncuentraSeparado.setVerticalAlignment(SwingConstants.TOP);
	lblseEncuentraSeparado.setHorizontalAlignment(SwingConstants.LEFT);
	lblseEncuentraSeparado.setBounds(21, 238, 306, 20);
	contentPane.add(lblseEncuentraSeparado);
	
	JLabel lbltieneCertificadoDe = new JLabel("\u00BFTiene certificado de permanencia?");
	lbltieneCertificadoDe.setVerticalAlignment(SwingConstants.TOP);
	lbltieneCertificadoDe.setHorizontalAlignment(SwingConstants.LEFT);
	lbltieneCertificadoDe.setBounds(21, 204, 231, 20);
	contentPane.add(lbltieneCertificadoDe);
	
	JComboBox postulanteInscripTxt = new JComboBox();
	postulanteInscripTxt.setModel(new DefaultComboBoxModel(new String[] {"Incompleto", "Completo"}));
	postulanteInscripTxt.setBounds(495, 78, 168, 20);
	contentPane.add(postulanteInscripTxt);
	
	JLabel lblNewLabel = new JLabel("C\u00E9dula de Identidad:");
	lblNewLabel.setBounds(19, 78, 131, 20);
	contentPane.add(lblNewLabel);
	
	JLabel lblApellidoPaterno = new JLabel("Apellido Paterno:");
	lblApellidoPaterno.setBounds(21, 140, 102, 20);
	contentPane.add(lblApellidoPaterno);
	
	JLabel lblNombreCompleto = new JLabel("Nombre Completo:");
	lblNombreCompleto.setBounds(21, 109, 140, 20);
	contentPane.add(lblNombreCompleto);
	
	JLabel lblNacionalidad = new JLabel("Nacionalidad:");
	lblNacionalidad.setBounds(21, 172, 102, 20);
	contentPane.add(lblNacionalidad);
	
	JLabel lblFe = new JLabel("Fecha de certificado de \r\npermanencia definitiva:");
	lblFe.setHorizontalTextPosition(SwingConstants.CENTER);
	lblFe.setHorizontalAlignment(SwingConstants.LEFT);
	lblFe.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	lblFe.setBounds(337, 204, 306, 23);
	contentPane.add(lblFe);
	
	JLabel lblNewLabel_4_1 = new JLabel("Estado Civ\u00EDl:");
	lblNewLabel_4_1.setBounds(337, 172, 102, 23);
	contentPane.add(lblNewLabel_4_1);
	
	JLabel lblApellidoMaterno = new JLabel("Apellido Materno:");
	lblApellidoMaterno.setBounds(337, 140, 102, 23);
	contentPane.add(lblApellidoMaterno);
	
	JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
	lblFechaNacimiento.setBounds(337, 108, 131, 23);
	contentPane.add(lblFechaNacimiento);
	
	JLabel lblNewLabel_1 = new JLabel("de inicio tr\u00E1mite de divorcio?");
	lblNewLabel_1.setBounds(21, 252, 219, 14);
	contentPane.add(lblNewLabel_1);
	
	actualizarBtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//TODO: Validar
			List<String> errores = new ArrayList<String>();
			Postulante postulante = new Postulante();

			if(postulanteFnacTxt.getDate() == null) {
				errores.add("Debe ingresar una Fecha de Nacimiento valida");
			}
			if(postulanteApePatTxt.getText().trim().isEmpty()) {
				errores.add("Debe ingresar un Apellido Paterno");
			}
			if(postulanteApeMatTxt.getText().trim().isEmpty()) {
				errores.add("Debe ingresar un Apellido Materno");
			}
			if(postulanteNombreTxt.getText().trim().isEmpty()) {
				errores.add("Debe ingresar un Nombre");
			}
			if(postulanteNacTxt.getText().trim().isEmpty()) {
				errores.add("Debe ingresar una Nacionalidad");
			}
			
			if (errores.isEmpty()) {
				
				postulante.setIdPostulante(Integer.parseInt(postulanteIdTxt.getText().trim()));
				postulante.setNumCedulaIdentidad(postulanteRutTxt.getText().trim());
				postulante.setEstadoInscrito(postulanteInscripTxt.getSelectedItem().toString());
				postulante.setFechaNacimiento(postulanteFnacTxt.getDate());
				postulante.setNombres(postulanteNombreTxt.getText().trim());
				postulante.setPrimerApellido(postulanteApePatTxt.getText().trim());
				postulante.setSegundoApellido(postulanteApeMatTxt.getText().trim());
				postulante.setEstadoCivil(postulanteEstadoTxt.getSelectedItem().toString().charAt(0));
				postulante.setNacionalidad(postulanteNacTxt.getText().trim());
				postulante.setCertificadoPermanencia(postulanteCertPerTxt.getSelectedItem().toString().charAt(0));
				postulante.setFechaCertificadoPermanencia(postulanteFechPerTxt.getDate());
				
				
				if(postulanteFechPerTxt.getDate() == null) {
					String fechadefault = "01/01/1100";
					DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
					Date fechafinal;
					try {
						fechafinal = dateFormat.parse(fechadefault);
						postulante.setFechaCertificadoPermanencia(fechafinal);
					} catch (ParseException ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					}
					
				}
				else {
					postulante.setFechaCertificadoPermanencia(postulanteFechPerTxt.getDate());
				}
				
				postulante.setEsSeparadoDeHecho(postulanteSepaTxt.getSelectedItem().toString().charAt(0));
				
			PostulantesService postulanteService = new PostulantesService();
			if(postulanteService.actualizarPorId(postulante)) {
				Postulante seleccionado = (Postulante)postulantesCbx.getSelectedItem();
				
				cargarCombo();
				
				JOptionPane.showMessageDialog(null, "Postulante actualizado");
			} else {
				JOptionPane.showMessageDialog(null, "Error al actualizar el Postulante");
			}
			} else 
			{
			 String mensaje = String.join("\n", errores);
			 JOptionPane.showMessageDialog(null, mensaje);

			}	
		}
	});
	actualizarBtn.setBounds(546, 321, 117, 29);
	contentPane.add(actualizarBtn);
	
	cargarCombo();
}

public void cargarCombo() {
	PostulantesService postulanteService = new PostulantesService();
	List<Postulante> postulantes = postulanteService.obtenerTodos();
	postulantesCbx.removeAllItems();
	for(Postulante p: postulantes) {
		postulantesCbx.addItem(p);
	}
}

}
