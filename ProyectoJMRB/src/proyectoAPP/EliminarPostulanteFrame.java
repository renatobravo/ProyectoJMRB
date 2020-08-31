package proyectoAPP;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import proyectoModel.entities.Postulante;
import proyectoModel.services.PostulantesService;

public class EliminarPostulanteFrame extends JFrame {

	private JPanel contentPane;
	private JComboBox<Postulante> postulantesCbx;
	private JLabel lblNewLabel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminarPostulanteFrame frame = new EliminarPostulanteFrame();
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
	public EliminarPostulanteFrame() {
		setTitle("Eliminar Postulantes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		postulantesCbx = new JComboBox<>();
		postulantesCbx.setBounds(100, 87, 233, 29);
		contentPane.add(postulantesCbx);
		
		JButton eliminarBtn = new JButton("Eliminar");
		eliminarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Postulante postulante = (Postulante)postulantesCbx.getSelectedItem();
				PostulantesService postulanteService = new PostulantesService();
				//TODO: Preguntar si esta seguro?
				if(postulanteService.eliminarPorId(postulante)) {
					cargarCombo();
					JOptionPane.showMessageDialog(null, "Postulante Eliminado");
				} else {
					JOptionPane.showMessageDialog(null, " Error al eliminar el postulante");
				}
				
			}
		});
		eliminarBtn.setBounds(153, 182, 140, 29);
		contentPane.add(eliminarBtn);
		
		lblNewLabel = new JLabel("Seleccione un postulante:");
		lblNewLabel.setBounds(153, 30, 168, 20);
		contentPane.add(lblNewLabel);
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
