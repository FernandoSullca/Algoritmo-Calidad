package AlgoritmoCalidadSimplePago;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

@SuppressWarnings({"rawtypes", "unchecked"})
public class FrameUsabilidad extends JFrame {

	private JPanel contentPane;
	private int resulEnt;
	private int resulAtract;
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameUsabilidad frame = new FrameUsabilidad();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameUsabilidad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Algoritmo de Calidad Simple - Pago");
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JButton btnNewButtonSiguiente = new JButton("Siguiente");
		btnNewButtonSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonSiguienteActionPerformed(e);
			}
		});
		btnNewButtonSiguiente.setBounds(470, 310, 110, 45);
		contentPane.add(btnNewButtonSiguiente);
		
		JLabel lblFuncionabilidad = new JLabel("Usabilidad");
		lblFuncionabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblFuncionabilidad.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblFuncionabilidad.setBounds(6, 2, 594, 45);
		contentPane.add(lblFuncionabilidad);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 45, 565, 14);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 204, 565, 14);
		contentPane.add(separator_1);
		
		JComboBox EntendidoBox = new JComboBox();
		EntendidoBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(EntendidoBox.getSelectedIndex()) {
	            case 0: {
	            	resulEnt = 0;
	                break;
	            }
	            case 1: {
	            	resulEnt = 1;
	                break;
	            }
	            case 2: {
	            	resulEnt = 2;
	                break;
	            }
	        }	
			}
		});
		EntendidoBox.setModel(new DefaultComboBoxModel(new String[] {"No cumple con ninguna caracter\u00EDstica.", "Cumple con 1 caracter\u00EDstica.", "Cumple con 2 caracter\u00EDsticas."}));
		EntendidoBox.setToolTipText("Evaluaci\u00F3n\r\nNo cumple con ninguna caracter\u00EDstica. \u2192 0 puntos\r\nCumple con 1 caracter\u00EDstica. \u2192 1 punto\r\nCumple con 2 caracter\u00EDsticas. \u2192 2 puntos\r\n");
		EntendidoBox.setBounds(32, 172, 360, 20);
		contentPane.add(EntendidoBox);
		
		JComboBox AtractivoBox = new JComboBox();
		AtractivoBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(AtractivoBox.getSelectedIndex()) {
	            case 0: {
	            	resulAtract = 0;
	                break;
	            }
	            case 1: {
	            	resulAtract = 1;
	                break;
	            }
	            case 2: {
	            	resulAtract = 2;
	                break;
	            }
	        }	
			}
		});
		AtractivoBox.setModel(new DefaultComboBoxModel(new String[] {"[0-4]", "[4-7]", "[8-10]"}));
		AtractivoBox.setToolTipText("Evaluaci\u00F3n\r\nNo cumple con ninguna caracter\u00EDstica. \u2192 0 puntos\r\nCumple con 1 caracter\u00EDstica. \u2192 1 punto\r\nCumple con 2 caracter\u00EDsticas. \u2192 2 puntos\r\n");
		AtractivoBox.setBounds(32, 305, 360, 20);
		contentPane.add(AtractivoBox);
		
		JLabel lblCapacidadDeSer = new JLabel("Capacidad de ser entendido");
		lblCapacidadDeSer.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblCapacidadDeSer.setBounds(37, 65, 285, 20);
		contentPane.add(lblCapacidadDeSer);
		
		JLabel lblPosee = new JLabel("* ¿ Posee ayuda contextual y botonces de accion ?");
		lblPosee.setBounds(121, 97, 393, 20);
		contentPane.add(lblPosee);
		
		JLabel lblContiene = new JLabel("* ¿ Contiene manual de usuario ?");
		lblContiene.setBounds(121, 129, 333, 20);
		contentPane.add(lblContiene);
		
		JLabel lblCapacidadDeAtraccion = new JLabel("Capacidad de atraccion");
		lblCapacidadDeAtraccion.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblCapacidadDeAtraccion.setBounds(41, 239, 292, 27);
		contentPane.add(lblCapacidadDeAtraccion);
		
		JLabel lblAtractivoDel = new JLabel("* Atractivo del Software");
		lblAtractivoDel.setBounds(121, 278, 264, 27);
		contentPane.add(lblAtractivoDel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FrameUsabilidad.class.getResource("/recursos/bg.jpg")));
		lblNewLabel.setBounds(0, 0, 606, 361);
		contentPane.add(lblNewLabel);
	}
		
	private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botonSiguienteActionPerformed

		PrintWriter out = null;
		try {// Guardar Resultados de la ventana
			out = new PrintWriter(new BufferedWriter(new FileWriter("Repuesta De Usuario.in", true)));
			out.println(resulEnt);
			out.println(resulAtract);
		} catch (IOException e) {
			System.err.println(e);
		}
		out.close();
		/** Llamado a la siguiente ventana */
		new FramePortabilidad().setVisible(true);
		this.setVisible(false);
		this.setLocationRelativeTo(null);
	}// GEN-LAST:event_botonSiguienteActionPerformed
}
