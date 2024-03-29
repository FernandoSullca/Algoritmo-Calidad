package AlgoritmoCalidadSimplePago;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FrameFiabilidad extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	protected int resultadoTole;
	protected int resultadoCapacidad;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameFiabilidad frame = new FrameFiabilidad();
					frame.setLocationRelativeTo(null);
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public FrameFiabilidad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Algoritmo de Calidad Simple p�go");
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		
		JLabel lblFuncionabilidad = new JLabel("Fiabilidad");
		lblFuncionabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblFuncionabilidad.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblFuncionabilidad.setBounds(21, 0, 519, 20);
		contentPane.add(lblFuncionabilidad);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 20, 565, 2);
		contentPane.add(separator);
		
		JTextPane txtpnDescripcinEsLa = new JTextPane();
		txtpnDescripcinEsLa.setText("\u25CF  Subcaracter\u00EDstica: Tolerancia a fallos\r\nDescripci\u00F3n:\r\nEs la capacidad del producto software de mantener la integridad de los datos cuando se producen fallas del sistema.\r\nCaracter\u00EDsticas a medir\r\n\u2022 Cuando sucede un error se protegen los datos procesados.\r\n\u2022 Se realiza un log de actividades que el sistema estaba haciendo.");
		txtpnDescripcinEsLa.setEditable(false);
		txtpnDescripcinEsLa.setBackground(new Color(255, 255, 224));
		txtpnDescripcinEsLa.setBounds(15, 31, 300, 161);
		contentPane.add(txtpnDescripcinEsLa);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 203, 565, 2);
		contentPane.add(separator_1);
		
		JTextPane txtpnDescripcin = new JTextPane();
		txtpnDescripcin.setText("\u25CF  Subcaracter\u00EDstica: Capacidad de recuperaci\u00F3n de errores\r\nDescripci\u00F3n:\r\nEs la capacidad del sistema de reanudar sus actividades cuando se producen errores cr\u00EDticos.\r\n\r\nCaracter\u00EDsticas a medir\r\n\u2022 El sistema reanuda las actividades si se produce una falla cr\u00EDtica.\r\n\u2022 Reanuda sus actividades y vuelve al estado en que estaba.");
		txtpnDescripcin.setEditable(false);
		txtpnDescripcin.setBackground(new Color(255, 255, 224));
		txtpnDescripcin.setBounds(15, 212, 300, 165);
		contentPane.add(txtpnDescripcin);
		
		/******ComboBoxs******/
		
		JLabel label = new JLabel("Evaluacion");
		label.setBounds(325, 33, 237, 14);
		contentPane.add(label);
		
		JComboBox ToleranciaBox = new JComboBox();
		ToleranciaBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  switch(ToleranciaBox.getSelectedIndex()) {
		            case 0: {
		            	resultadoTole = 0;
		                break;
		            }
		            case 1: {
		            	resultadoTole = 1;
		                break;
		            }
		            case 2: {
		            	resultadoTole = 2;
		                break;
		            }
		        }
			}
		});
		ToleranciaBox.setModel(new DefaultComboBoxModel(new String[] {"No cumple con alguna caracter\u00EDstica", "Cumple con 1 caracter\u00EDstica", "Cumple con 2 caracter\u00EDsticas"}));
		ToleranciaBox.setToolTipText("Evaluaci\u00F3n\r\nNo cumple con ninguna caracter\u00EDstica. \u2192 0 puntos\r\nCumple con 1 caracter\u00EDstica. \u2192 1 punto\r\nCumple con 2 caracter\u00EDsticas. \u2192 2 puntos\r\n");
		ToleranciaBox.setBounds(325, 58, 215, 20);
		contentPane.add(ToleranciaBox);
	
		JLabel label_1 = new JLabel("Evaluacion");
		label_1.setBounds(325, 214, 237, 14);
		contentPane.add(label_1);
		
		JComboBox CapacidadBox = new JComboBox();
		CapacidadBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  switch(CapacidadBox.getSelectedIndex()) {
		            case 0: {
		            	resultadoCapacidad = 0;
		                break;
		            }
		            case 1: {
		            	resultadoCapacidad = 1;
		                break;
		            }
		            case 2: {
		            	resultadoCapacidad = 2;
		                break;
		            }
		        }
			}
		});
		CapacidadBox.setModel(new DefaultComboBoxModel(new String[] {"No cumple con ninguna caracter\u00EDstica", "Cumple con 1 caracter\u00EDstica", "Cumple con 2 caracter\u00EDsticas"}));
		CapacidadBox.setToolTipText("");
		CapacidadBox.setBounds(325, 239, 215, 20);
		contentPane.add(CapacidadBox);
		
		/*****Boton Siguiente****/
		
		JButton btnNewButtonSiguiente = new JButton("Siguiente");
		btnNewButtonSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 botonSiguienteActionPerformed(e);
			}
		});
		btnNewButtonSiguiente.setBounds(483, 371, 97, 23);
		contentPane.add(btnNewButtonSiguiente);
		
		/******Fondo de Pantalla********/
		JLabel lblNewfondo = new JLabel("Fondo");
		lblNewfondo.setIcon(new ImageIcon(FrameCalculoFinal.class.getResource("/resurso/bg.jpg")));
		lblNewfondo.setBounds(0, 0, 590, 405);
		contentPane.add(lblNewfondo);
	}
	
	private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botonSiguienteActionPerformed

		PrintWriter out = null;
		try {// Guardar Resultados de la ventana
			out = new PrintWriter(new BufferedWriter(new FileWriter("Repuesta De Usuario.in", true)));
			out.println(resultadoTole);
			out.println(resultadoCapacidad);
		} catch (IOException e) {
			System.err.println(e);
		}
		out.close();
		/** Llamado a la siguiente ventana */
		new FrameMantenibilidad().setVisible(true);
		this.setLocationRelativeTo(null);
		this.setVisible(false);
		
	}// GEN-LAST:event_botonSiguienteActionPerformed


}
