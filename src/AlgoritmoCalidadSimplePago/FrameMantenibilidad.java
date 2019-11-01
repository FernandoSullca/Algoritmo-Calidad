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
public class FrameMantenibilidad extends JFrame {

	private JPanel contentPane;
	protected int resulCapAnali;
	protected int resulCapCambi;
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameMantenibilidad frame = new FrameMantenibilidad();
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
	public FrameMantenibilidad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 378);
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
		btnNewButtonSiguiente.setBounds(490, 305, 110, 45);
		contentPane.add(btnNewButtonSiguiente);
		
		JLabel lblFuncionabilidad = new JLabel("Mantenibilidad");
		lblFuncionabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblFuncionabilidad.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblFuncionabilidad.setBounds(21, 0, 579, 45);
		contentPane.add(lblFuncionabilidad);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 45, 565, 11);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 175, 565, 11);
		contentPane.add(separator_1);
		
		JComboBox analizadoBox = new JComboBox();
		analizadoBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(analizadoBox.getSelectedIndex()) {
	            case 0: {
	            	resulCapAnali = 0;
	                break;
	            }
	            case 1: {
	            	resulCapAnali = 1;
	                break;
	            }
	            case 2: {
	            	resulCapAnali = 2;
	                break;
	            }
	        }
			}
		});
		analizadoBox.setModel(new DefaultComboBoxModel(new String[] {"10% o menos", "Entre 11 y 25% ", "26% o m\u00E1s"}));
		analizadoBox.setToolTipText("Evaluaci\u00F3n\r\nNo cumple con ninguna caracter\u00EDstica. \u2192 0 puntos\r\nCumple con 1 caracter\u00EDstica. \u2192 1 punto\r\nCumple con 2 caracter\u00EDsticas. \u2192 2 puntos\r\n");
		analizadoBox.setBounds(36, 151, 367, 20);
		contentPane.add(analizadoBox);
		
		JComboBox cambiadoBox = new JComboBox();
		cambiadoBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 switch(cambiadoBox.getSelectedIndex()) {
		            case 0: {
		            	resulCapCambi = 0;
		                break;
		            }
		            case 1: {
		            	resulCapCambi = 1;
		                break;
		            }
		            case 2: {
		            	resulCapCambi = 2;
		                break;
		            }
		        }
			}
		});
		
		cambiadoBox.setModel(new DefaultComboBoxModel(new String[] {"mayor o igual a 21", "entre 11 y 20", "menor o igual a 10"}));
		cambiadoBox.setToolTipText("Evaluaci\u00F3n\r\nNo cumple con ninguna caracter\u00EDstica. \u2192 0 puntos\r\nCumple con 1 caracter\u00EDstica. \u2192 1 punto\r\nCumple con 2 caracter\u00EDsticas. \u2192 2 puntos\r\n");
		cambiadoBox.setBounds(36, 317, 367, 33);
		contentPane.add(cambiadoBox);
		
		JLabel lblAnalisisDeCodigo = new JLabel("Analisis de Codigo");
		lblAnalisisDeCodigo.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblAnalisisDeCodigo.setBounds(31, 57, 173, 25);
		contentPane.add(lblAnalisisDeCodigo);
		
		JLabel lblDe = new JLabel("* % de codigo comentado");
		lblDe.setBounds(120, 105, 265, 25);
		contentPane.add(lblDe);
		
		JLabel lblAdaptabilidadAlCambio = new JLabel("Adaptabilidad al Cambio");
		lblAdaptabilidadAlCambio.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblAdaptabilidadAlCambio.setBounds(31, 198, 333, 33);
		contentPane.add(lblAdaptabilidadAlCambio);
		
		JLabel lblComplejidadCiclomatica = new JLabel("* Complejidad ciclomatica");
		lblComplejidadCiclomatica.setBounds(120, 271, 265, 20);
		contentPane.add(lblComplejidadCiclomatica);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FrameMantenibilidad.class.getResource("/recursos/bg.jpg")));
		lblNewLabel.setBounds(0, 0, 606, 356);
		contentPane.add(lblNewLabel);
	}

	private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botonSiguienteActionPerformed

		PrintWriter out = null;
		try {// Guardar Resultados de la ventana
			out = new PrintWriter(new BufferedWriter(new FileWriter("Repuesta De Usuario.in", true)));
			out.println(resulCapAnali);
			out.println(resulCapCambi);
		} catch (IOException e) {
			System.err.println(e);
		}
		out.close();
		/** Llamado a la siguiente ventana */
		new FrameUsabilidad().setVisible(true);
		this.setVisible(false);
		this.setLocationRelativeTo(null);
	}// GEN-LAST:event_botonSiguienteActionPerformed

}
