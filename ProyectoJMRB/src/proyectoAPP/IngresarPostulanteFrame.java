package proyectoAPP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;


import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;

import proyectoModel.entities.Postulante;
import proyectoModel.services.PostulantesService;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import java.awt.Font;
import java.awt.Component;
import java.awt.ComponentOrientation;
import javax.swing.border.LineBorder;

public class IngresarPostulanteFrame extends JFrame {

	private JPanel contentPane;
	private JTextField postulanteRunTxt;
	private JTextField postulanteApePaTxt;
	private JTextField postulanteNomTxt;
	private JTextField postulanteApMaTxt;
	private JTextField postulanteNacioTxt;
	private JTextField postulanteTeleTrabTxt;
	private JTextField postulanteTeleMovTxt;
	private JTextField postulanteEmailTxt;
	private JTextField postulanteCodPosTxt;
	private JTextField postulanteTeleDomTxt;
	private JTextField postulanteCalleTxt;
	private JTextField postulanteBlockTxt;
	private JTextField postulanteManzanaTxt;
	private JTextField postulanteLocalidadTxt;
	private JTextField postulanteNumTxt;
	private JTextField postulanteDeptoTxt;
	private JTextField postulanteSitioTxt;
	private JTextField postulantePoblaTxt;
	private JTextField postulanteIDTxt;
	private JTextField postulanteFolioTxt;
	private JTextField postulanteComTxt;

	public IngresarPostulanteFrame() {
		setTitle("Identificaci\u00F3n del Postulante");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00E9dula de Identidad:");
		lblNewLabel.setBounds(23, 61, 131, 20);
		contentPane.add(lblNewLabel);
		
		postulanteRunTxt = new JTextField();
		postulanteRunTxt.setBounds(184, 61, 120, 20);
		contentPane.add(postulanteRunTxt);
		postulanteRunTxt.setColumns(10);
		
		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno:");
		lblApellidoPaterno.setBounds(23, 92, 102, 20);
		contentPane.add(lblApellidoPaterno);
		
		postulanteApePaTxt = new JTextField();
		postulanteApePaTxt.setColumns(10);
		postulanteApePaTxt.setBounds(184, 90, 120, 20);
		contentPane.add(postulanteApePaTxt);
		
		JLabel lblNombreCompleto = new JLabel("Nombre Completo:");
		lblNombreCompleto.setBounds(23, 120, 140, 20);
		contentPane.add(lblNombreCompleto);
		
		postulanteNomTxt = new JTextField();
		postulanteNomTxt.setColumns(10);
		postulanteNomTxt.setBounds(164, 120, 140, 20);
		contentPane.add(postulanteNomTxt);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
		lblFechaNacimiento.setBounds(368, 60, 131, 23);
		contentPane.add(lblFechaNacimiento);
		
		JLabel lblApellidoMaterno = new JLabel("Apellido Materno:");
		lblApellidoMaterno.setBounds(368, 91, 102, 23);
		contentPane.add(lblApellidoMaterno);
		
		postulanteApMaTxt = new JTextField();
		postulanteApMaTxt.setColumns(10);
		postulanteApMaTxt.setBounds(503, 90, 120, 20);
		contentPane.add(postulanteApMaTxt);
		
		JLabel lblNewLabel_4_1 = new JLabel("Estado Civ\u00EDl:");
		lblNewLabel_4_1.setBounds(368, 119, 102, 23);
		contentPane.add(lblNewLabel_4_1);
		
		JComboBox postulanteEstadoTxt = new JComboBox();
		postulanteEstadoTxt.setName("");
		postulanteEstadoTxt.setModel(new DefaultComboBoxModel(new String[] {"Soltero", "Casado", "Union Civ\u00EDl", "Divorciado", "Viudo"}));
		postulanteEstadoTxt.setBounds(503, 120, 120, 20);
		contentPane.add(postulanteEstadoTxt);
		
		JDateChooser postulanteFnacTxt = new JDateChooser();
		postulanteFnacTxt.setBounds(503, 61, 120, 20);
		contentPane.add(postulanteFnacTxt);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad:");
		lblNacionalidad.setBounds(23, 152, 102, 20);
		contentPane.add(lblNacionalidad);
		
		postulanteNacioTxt = new JTextField();
		postulanteNacioTxt.setColumns(10);
		postulanteNacioTxt.setBounds(184, 152, 120, 20);
		contentPane.add(postulanteNacioTxt);
		
		JLabel lblseEncuentraSeparado = new JLabel("\u00BFSe encuentra separado de hecho y presenta acreditaci\u00F3n de inicio tr\u00E1mite de divorcio?");
		lblseEncuentraSeparado.setHorizontalAlignment(SwingConstants.LEFT);
		lblseEncuentraSeparado.setVerticalAlignment(SwingConstants.TOP);
		lblseEncuentraSeparado.setBounds(23, 217, 510, 20);
		contentPane.add(lblseEncuentraSeparado);
		
		JComboBox postulanteSepaTxt = new JComboBox();
		postulanteSepaTxt.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
		postulanteSepaTxt.setBounds(573, 214, 50, 20);
		contentPane.add(postulanteSepaTxt);
		
		JLabel lbltieneCertificadoDe = new JLabel("\u00BFTiene certificado de permanencia?");
		lbltieneCertificadoDe.setVerticalAlignment(SwingConstants.TOP);
		lbltieneCertificadoDe.setHorizontalAlignment(SwingConstants.LEFT);
		lbltieneCertificadoDe.setBounds(23, 186, 231, 20);
		contentPane.add(lbltieneCertificadoDe);
		
		JComboBox postulanteCertPerTxt = new JComboBox();
		postulanteCertPerTxt.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
		postulanteCertPerTxt.setBounds(254, 183, 50, 20);
		contentPane.add(postulanteCertPerTxt);
		
		JLabel lblFe = new JLabel("Fecha de certificado de \r\npermanencia definitiva:");
		lblFe.setHorizontalTextPosition(SwingConstants.CENTER);
		lblFe.setHorizontalAlignment(SwingConstants.LEFT);
		lblFe.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblFe.setBounds(368, 151, 306, 23);
		contentPane.add(lblFe);
		
		JDateChooser postulanteFechPerTxt = new JDateChooser();
		postulanteFechPerTxt.setBounds(503, 183, 120, 20);
		contentPane.add(postulanteFechPerTxt);
		
		JLabel lblcuandoLaNacionalidad = new JLabel("(cuando la nacionalidad no sea Chilena)");
		lblcuandoLaNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblcuandoLaNacionalidad.setVerticalAlignment(SwingConstants.TOP);
		lblcuandoLaNacionalidad.setHorizontalAlignment(SwingConstants.LEFT);
		lblcuandoLaNacionalidad.setBounds(23, 200, 162, 11);
		contentPane.add(lblcuandoLaNacionalidad);
		
		
		JLabel lblEstadoInscripcin = new JLabel("Estado Inscripci\u00F3n");
		lblEstadoInscripcin.setBounds(420, 13, 131, 35);
		contentPane.add(lblEstadoInscripcin);
		
		JLabel lblNewLabel_1_1 = new JLabel("Folio N\u00B0 FFP");
		lblNewLabel_1_1.setBounds(696, 20, 66, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JComboBox postulanteInscripTxt = new JComboBox();
		postulanteInscripTxt.setModel(new DefaultComboBoxModel(new String[] {"Incompleto", "Completo"}));
		postulanteInscripTxt.setBounds(536, 21, 120, 20);
		contentPane.add(postulanteInscripTxt);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ID Postulante");
		lblNewLabel_1_1_1.setBounds(23, 20, 102, 20);
		contentPane.add(lblNewLabel_1_1_1);
		
		
		//Ingresar
		JButton ingresarBtn = new JButton("Ingresar");
		ingresarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			List<String> errores = new ArrayList<String>();
			Postulante postulante = new Postulante();

			if(postulanteRunTxt.getText().trim().isEmpty()) {
				errores.add("Debe ingresar un Rut para la Cedula");
			}
			if(postulanteFnacTxt.getDate() == null) {
				errores.add("Debe ingresar una Fecha de Nacimiento valida");
			}
			if(postulanteApePaTxt.getText().trim().isEmpty()) {
				errores.add("Debe ingresar un Apellido Paterno");
			}
			if(postulanteApMaTxt.getText().trim().isEmpty()) {
				errores.add("Debe ingresar un Apellido Materno");
			}
			if(postulanteNomTxt.getText().trim().isEmpty()) {
				errores.add("Debe ingresar un Nombre");
			}
			if(postulanteNacioTxt.getText().trim().isEmpty()) {
				errores.add("Debe ingresar una Nacionalidad");
			}
			
			if (errores.isEmpty()) {
				
				postulante.setEstadoInscrito(postulanteInscripTxt.getSelectedItem().toString());
				postulante.setNumCedulaIdentidad(postulanteRunTxt.getText().trim());
				postulante.setFechaNacimiento(postulanteFnacTxt.getDate());
				postulante.setNombres(postulanteNomTxt.getText().trim());
				postulante.setPrimerApellido(postulanteApePaTxt.getText().trim());
				postulante.setSegundoApellido(postulanteApMaTxt.getText().trim());
				postulante.setEstadoCivil(postulanteEstadoTxt.getSelectedItem().toString().charAt(0));
				postulante.setNacionalidad(postulanteNacioTxt.getText().trim());
				postulante.setCertificadoPermanencia(postulanteCertPerTxt.getSelectedItem().toString().charAt(0));
				postulante.setFechaCertificadoPermanencia(postulanteFechPerTxt.getDate());
				
				
				if(postulanteFechPerTxt.getDate() == null) {
					String fechadefault = "01/01/1100";
					DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
					Date fechafinal;
					try {
						fechafinal = dateFormat.parse(fechadefault);
						postulante.setFechaCertificadoPermanencia(fechafinal);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				else {
					postulante.setFechaCertificadoPermanencia(postulanteFechPerTxt.getDate());
				}
				
				postulante.setEsSeparadoDeHecho(postulanteSepaTxt.getSelectedItem().toString().charAt(0));
				PostulantesService postulanteService = new PostulantesService();
				
				if(postulanteService.crear(postulante)) 
				{
					JOptionPane.showMessageDialog(null, "Postulante registrado");
					dispose();
					}else {
					JOptionPane.showMessageDialog(null, "Error al ingresar Postulante");
				}
				} else 
				{
				 String mensaje = String.join("\n", errores);
				 JOptionPane.showMessageDialog(null, mensaje);

				}							
				
			}
		});
		ingresarBtn.setBounds(534, 571, 140, 29);
		contentPane.add(ingresarBtn);
		
		
		//Limpiar
		JButton limpiarBtn = new JButton("Limpiar");
		limpiarBtn.setBounds(384, 571, 140, 29);
		contentPane.add(limpiarBtn);
		
		JButton viviendaBtn = new JButton("Vivienda");
		viviendaBtn.setEnabled(false);
		viviendaBtn.setBounds(729, 86, 120, 88);
		contentPane.add(viviendaBtn);
		
		JButton acreditacionesBtn = new JButton("Acreditaciones");
		acreditacionesBtn.setEnabled(false);
		acreditacionesBtn.setBounds(729, 217, 120, 88);
		contentPane.add(acreditacionesBtn);
		
		JButton ahorroBtn = new JButton("Ahorros");
		ahorroBtn.setEnabled(false);
		ahorroBtn.setBounds(729, 344, 120, 88);
		contentPane.add(ahorroBtn);
		
		JButton conyugeBtn = new JButton("C\u00F3nyuge");
		conyugeBtn.setEnabled(false);
		conyugeBtn.setBounds(729, 472, 120, 88);
		contentPane.add(conyugeBtn);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Datos de Contacto");
		lblNewLabel_1_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_2.setBounds(23, 232, 476, 39);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tel\u00E9fono Trabajo:");
		lblNewLabel_3.setBounds(30, 282, 131, 20);
		contentPane.add(lblNewLabel_3);
		
		postulanteTeleTrabTxt = new JTextField();
		postulanteTeleTrabTxt.setEnabled(false);
		postulanteTeleTrabTxt.setColumns(10);
		postulanteTeleTrabTxt.setBounds(191, 282, 120, 20);
		contentPane.add(postulanteTeleTrabTxt);
		
		JLabel lblApellidoPaterno_1 = new JLabel("Tel\u00E9fono M\u00F3vil:");
		lblApellidoPaterno_1.setBounds(30, 313, 102, 20);
		contentPane.add(lblApellidoPaterno_1);
		
		postulanteTeleMovTxt = new JTextField();
		postulanteTeleMovTxt.setEnabled(false);
		postulanteTeleMovTxt.setColumns(10);
		postulanteTeleMovTxt.setBounds(191, 313, 120, 20);
		contentPane.add(postulanteTeleMovTxt);
		
		JLabel lblNombreCompleto_1 = new JLabel("E-mail:");
		lblNombreCompleto_1.setBounds(30, 344, 102, 20);
		contentPane.add(lblNombreCompleto_1);
		
		postulanteEmailTxt = new JTextField();
		postulanteEmailTxt.setEnabled(false);
		postulanteEmailTxt.setColumns(10);
		postulanteEmailTxt.setBounds(164, 344, 147, 20);
		contentPane.add(postulanteEmailTxt);
		
		JLabel lblNewLabel_3_1 = new JLabel("Tel\u00E9fono Domicilio:");
		lblNewLabel_3_1.setBounds(368, 282, 131, 20);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblApellidoPaterno_1_1 = new JLabel("C\u00F3digo Postal:");
		lblApellidoPaterno_1_1.setBounds(368, 313, 148, 20);
		contentPane.add(lblApellidoPaterno_1_1);
		
		postulanteCodPosTxt = new JTextField();
		postulanteCodPosTxt.setEnabled(false);
		postulanteCodPosTxt.setColumns(10);
		postulanteCodPosTxt.setBounds(503, 313, 120, 20);
		contentPane.add(postulanteCodPosTxt);
		
		postulanteTeleDomTxt = new JTextField();
		postulanteTeleDomTxt.setEnabled(false);
		postulanteTeleDomTxt.setColumns(10);
		postulanteTeleDomTxt.setBounds(503, 282, 120, 20);
		contentPane.add(postulanteTeleDomTxt);
		
		JLabel lblNewLabel_3_2 = new JLabel("Calle:");
		lblNewLabel_3_2.setBounds(30, 401, 124, 20);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblApellidoPaterno_1_2 = new JLabel("Block:");
		lblApellidoPaterno_1_2.setBounds(30, 432, 124, 20);
		contentPane.add(lblApellidoPaterno_1_2);
		
		JLabel lblNombreCompleto_1_1 = new JLabel("Manzana:");
		lblNombreCompleto_1_1.setBounds(30, 463, 124, 20);
		contentPane.add(lblNombreCompleto_1_1);
		
		postulanteCalleTxt = new JTextField();
		postulanteCalleTxt.setEnabled(false);
		postulanteCalleTxt.setColumns(10);
		postulanteCalleTxt.setBounds(164, 401, 147, 20);
		contentPane.add(postulanteCalleTxt);
		
		postulanteBlockTxt = new JTextField();
		postulanteBlockTxt.setEnabled(false);
		postulanteBlockTxt.setColumns(10);
		postulanteBlockTxt.setBounds(164, 432, 75, 20);
		contentPane.add(postulanteBlockTxt);
		
		postulanteManzanaTxt = new JTextField();
		postulanteManzanaTxt.setEnabled(false);
		postulanteManzanaTxt.setColumns(10);
		postulanteManzanaTxt.setBounds(164, 463, 75, 20);
		contentPane.add(postulanteManzanaTxt);
		
		JLabel lblNombreCompleto_1_1_1 = new JLabel("Localidad:");
		lblNombreCompleto_1_1_1.setBounds(30, 494, 124, 20);
		contentPane.add(lblNombreCompleto_1_1_1);
		
		postulanteLocalidadTxt = new JTextField();
		postulanteLocalidadTxt.setEnabled(false);
		postulanteLocalidadTxt.setColumns(10);
		postulanteLocalidadTxt.setBounds(164, 492, 147, 20);
		contentPane.add(postulanteLocalidadTxt);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Regi\u00F3n:");
		lblNewLabel_4_1_1.setBounds(30, 524, 124, 23);
		contentPane.add(lblNewLabel_4_1_1);
		
		JComboBox postulanteRegionTxt = new JComboBox();
		postulanteRegionTxt.setEnabled(false);
		postulanteRegionTxt.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar..", "Regi\u00F3n de Arica y Parinacota", "Regi\u00F3n de Tarapac\u00E1", "Regi\u00F3n de Antofagasta", "Regi\u00F3n de Atacama", "Regi\u00F3n de Coquimbo", "Regi\u00F3n de Valpara\u00EDso", "Regi\u00F3n Metropolitana de Santiago", "Regi\u00F3n del Libertador General Bernardo O\u2019Higgins", "Regi\u00F3n del Maule", "Regi\u00F3n del \u00D1uble", "Regi\u00F3n del Biob\u00EDo", "Regi\u00F3n de La Araucan\u00EDa", "Regi\u00F3n de Los R\u00EDos", "Regi\u00F3n de Los Lagos", "Regi\u00F3n de Ays\u00E9n del General Carlos Ib\u00E1\u00F1ez del Campo", "Regi\u00F3n de Magallanes y la Ant\u00E1rtica Chilena"}));
		postulanteRegionTxt.setBounds(164, 523, 186, 20);
		contentPane.add(postulanteRegionTxt);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("N\u00FAmero:");
		lblNewLabel_3_2_1.setBounds(368, 401, 124, 20);
		contentPane.add(lblNewLabel_3_2_1);
		
		postulanteNumTxt = new JTextField();
		postulanteNumTxt.setEnabled(false);
		postulanteNumTxt.setColumns(10);
		postulanteNumTxt.setBounds(502, 401, 147, 20);
		contentPane.add(postulanteNumTxt);
		
		postulanteDeptoTxt = new JTextField();
		postulanteDeptoTxt.setEnabled(false);
		postulanteDeptoTxt.setColumns(10);
		postulanteDeptoTxt.setBounds(502, 432, 75, 20);
		contentPane.add(postulanteDeptoTxt);
		
		JLabel lblApellidoPaterno_1_2_1 = new JLabel("Departamento:");
		lblApellidoPaterno_1_2_1.setBounds(368, 432, 124, 20);
		contentPane.add(lblApellidoPaterno_1_2_1);
		
		JLabel lblNombreCompleto_1_1_2 = new JLabel("Sitio:");
		lblNombreCompleto_1_1_2.setBounds(368, 463, 124, 20);
		contentPane.add(lblNombreCompleto_1_1_2);
		
		postulanteSitioTxt = new JTextField();
		postulanteSitioTxt.setEnabled(false);
		postulanteSitioTxt.setColumns(10);
		postulanteSitioTxt.setBounds(502, 463, 75, 20);
		contentPane.add(postulanteSitioTxt);
		
		postulantePoblaTxt = new JTextField();
		postulantePoblaTxt.setEnabled(false);
		postulantePoblaTxt.setColumns(10);
		postulantePoblaTxt.setBounds(502, 492, 147, 20);
		contentPane.add(postulantePoblaTxt);
		
		JLabel lblNombreCompleto_1_1_1_1 = new JLabel("Poblaci\u00F3n / Villa:");
		lblNombreCompleto_1_1_1_1.setBounds(368, 494, 124, 20);
		contentPane.add(lblNombreCompleto_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Comuna:");
		lblNewLabel_4_1_1_1.setBounds(368, 524, 124, 23);
		contentPane.add(lblNewLabel_4_1_1_1);
		
		postulanteIDTxt = new JTextField();
		postulanteIDTxt.setEnabled(false);
		postulanteIDTxt.setBorder(null);
		postulanteIDTxt.setBackground(Color.LIGHT_GRAY);
		postulanteIDTxt.setSelectedTextColor(Color.WHITE);
		postulanteIDTxt.setColumns(10);
		postulanteIDTxt.setBounds(109, 20, 76, 20);
		contentPane.add(postulanteIDTxt);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(10, 11, 664, 39);
		contentPane.add(lblNewLabel_1);
		
		postulanteFolioTxt = new JTextField();
		postulanteFolioTxt.setEnabled(false);
		postulanteFolioTxt.setBorder(null);
		postulanteFolioTxt.setSelectedTextColor(Color.WHITE);
		postulanteFolioTxt.setColumns(10);
		postulanteFolioTxt.setBackground(Color.WHITE);
		postulanteFolioTxt.setBounds(765, 20, 102, 20);
		contentPane.add(postulanteFolioTxt);
		
		postulanteComTxt = new JTextField();
		postulanteComTxt.setEnabled(false);
		postulanteComTxt.setColumns(10);
		postulanteComTxt.setBounds(503, 525, 147, 20);
		contentPane.add(postulanteComTxt);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lblNewLabel_2_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2_1.setBounds(10, 387, 664, 173);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setOpaque(true);
		lblNewLabel_1_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1_2.setBounds(684, 11, 200, 589);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lblNewLabel_2.setBackground(Color.DARK_GRAY);
		lblNewLabel_2.setBounds(10, 271, 664, 105);
		contentPane.add(lblNewLabel_2);
		
		
	}
}
