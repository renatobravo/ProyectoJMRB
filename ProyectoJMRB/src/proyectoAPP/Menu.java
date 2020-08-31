//Juan Moreno - Renato Bravo -- Laboratorio de programación

package proyectoAPP;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import proyectoModel.entities.Postulante;
import proyectoModel.services.PostulantesService;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JDesktopPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTable tablaPostulantes;
	private JButton ingresarBtn;
	private JButton actualizarBtn;
	private JButton verBtn;
	private JButton eliminarBtn;
	private JLabel lblNewLabel;
	private JButton conyugeBtn;
	private JButton ahorroBtn;
	private JButton acreditacionesBtn;
	private JButton viviendaBtn;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblMenPostulantes;
	private JLabel lblMenSistemas;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void cargarTabla() {
		PostulantesService service = new PostulantesService();
		List<Postulante> listPost = service.obtenerTodos();
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Identificador");
		model.addColumn("Nombres");
		model.addColumn("Apellido Paterno");
		model.addColumn("Apellido Materno");
		model.addColumn("Fecha Nacimiento");
		model.addColumn("RUT");
		for(Postulante p: listPost) {
			Object[] fila = new Object[6];
			fila[0] = p.getIdPostulante();
			fila[1] = p.getNombres();
			fila[2] = p.getPrimerApellido();
			fila[3] = p.getSegundoApellido();
			fila[4] = p.getFechaNacimiento();
			fila[5] = p.getNumCedulaIdentidad();
			model.addRow(fila);
		}
		tablaPostulantes.setModel(model);	
	}
	
	public Menu() {
		setTitle("https://fpp.minvu.gob.cl");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY));
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(10, 296, 714, 254);
		contentPane.add(scrollPane);
		
		tablaPostulantes = new JTable();
		scrollPane.setViewportView(tablaPostulantes);
		
		ingresarBtn = new JButton("Ingresar Postulante");
		ingresarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IngresarPostulanteFrame ingre = new IngresarPostulanteFrame();
				ingre.setVisible(true);
			}
		});
		ingresarBtn.setBounds(35, 115, 171, 29);
		contentPane.add(ingresarBtn);
		
		actualizarBtn = new JButton("Actualizar Postulante");
		actualizarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ActualizarPostulanteFrame actualizar = new ActualizarPostulanteFrame();
				actualizar.setVisible(true);
			}
		});
		actualizarBtn.setBounds(35, 155, 171, 29);
		contentPane.add(actualizarBtn);
		
		verBtn = new JButton("Refrescar Lista de Postulantes (Listar)");
		verBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//VerCargosFrame ver = new VerCargosFrame();
				//ver.setVisible(true);
				cargarTabla();
			}
		});
		verBtn.setBounds(116, 262, 314, 29);
		contentPane.add(verBtn);
		
		eliminarBtn = new JButton("Eliminar Postulantes");
		eliminarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EliminarPostulanteFrame eliminar = new EliminarPostulanteFrame();
				eliminar.setVisible(true);
			}
		});
		eliminarBtn.setBounds(35, 196, 171, 29);
		contentPane.add(eliminarBtn);
		
		lblNewLabel = new JLabel("Listado de Postulantes");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(515, 263, 209, 22);
		contentPane.add(lblNewLabel);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(78, 160, 1, 1);
		contentPane.add(desktopPane);
		
		JLabel lblFormularioDePostulacin = new JLabel("Formulario de Postulaci\u00F3n Personas");
		lblFormularioDePostulacin.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormularioDePostulacin.setFont(new Font("Arial", Font.BOLD, 18));
		lblFormularioDePostulacin.setBounds(10, 11, 714, 22);
		contentPane.add(lblFormularioDePostulacin);
		
		JLabel lblSistemaIntegradoSubsidio = new JLabel("Sistema Integrado Subsidio Habitacional");
		lblSistemaIntegradoSubsidio.setHorizontalAlignment(SwingConstants.CENTER);
		lblSistemaIntegradoSubsidio.setFont(new Font("Arial", Font.BOLD, 12));
		lblSistemaIntegradoSubsidio.setBounds(10, 31, 714, 22);
		contentPane.add(lblSistemaIntegradoSubsidio);
		
		JButton mantenerBtn = new JButton("Mantenedores");
		mantenerBtn.setEnabled(false);
		mantenerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mantenerBtn.setBounds(515, 115, 171, 29);
		contentPane.add(mantenerBtn);
		
		JButton reporteBtn = new JButton("Reportes");
		reporteBtn.setEnabled(false);
		reporteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		reporteBtn.setBounds(515, 155, 171, 29);
		contentPane.add(reporteBtn);
		
		conyugeBtn = new JButton("C\u00F3nyuge");
		conyugeBtn.setEnabled(false);
		conyugeBtn.setBounds(234, 216, 171, 29);
		contentPane.add(conyugeBtn);
		
		ahorroBtn = new JButton("Ahorros");
		ahorroBtn.setEnabled(false);
		ahorroBtn.setBounds(234, 176, 171, 29);
		contentPane.add(ahorroBtn);
		
		acreditacionesBtn = new JButton("Acreditaciones");
		acreditacionesBtn.setEnabled(false);
		acreditacionesBtn.setBounds(234, 136, 171, 29);
		contentPane.add(acreditacionesBtn);
		
		viviendaBtn = new JButton("Vivienda");
		viviendaBtn.setEnabled(false);
		viviendaBtn.setBounds(234, 96, 171, 29);
		contentPane.add(viviendaBtn);
		
		lblMenPostulantes = new JLabel("Men\u00FA Postulantes");
		lblMenPostulantes.setFont(new Font("Arial", Font.BOLD, 14));
		lblMenPostulantes.setBounds(39, 82, 209, 22);
		contentPane.add(lblMenPostulantes);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lblNewLabel_1.setBounds(10, 72, 420, 183);
		contentPane.add(lblNewLabel_1);
		
		lblMenSistemas = new JLabel("Men\u00FA Sistema");
		lblMenSistemas.setHorizontalAlignment(SwingConstants.LEFT);
		lblMenSistemas.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMenSistemas.setFont(new Font("Arial", Font.BOLD, 14));
		lblMenSistemas.setBounds(515, 82, 171, 22);
		contentPane.add(lblMenSistemas);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lblNewLabel_2.setBounds(478, 72, 246, 169);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Proximamente");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(245, 71, 141, 22);
		contentPane.add(lblNewLabel_3);
		
		/*lblCargos = new JLabel("Cargos");
		lblCargos.setFont(new Font("Arial", Font.BOLD, 18));
		lblCargos.setBounds(47, 0, 83, 47);
		contentPane.add(lblCargos);
		
		lblRegiones = new JLabel("Regiones");
		lblRegiones.setFont(new Font("Arial", Font.BOLD, 18));
		lblRegiones.setBounds(264, 0, 83, 47);
		contentPane.add(lblRegiones);*/
		cargarTabla();
	}
}
