package AlgoritmoCalidadSimplePago;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
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
import javax.swing.ImageIcon;

public class FrameUsabilidad extends JFrame {

	private JPanel contentPane;
	private int resulEnt;
	private int resulAtract;

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
		setBounds(100, 100, 606, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Algoritmo de Calidad Simple págo");
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JButton btnNewButtonSiguiente = new JButton("Siguiente");
		btnNewButtonSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonSiguienteActionPerformed(e);
			}
		});
		btnNewButtonSiguiente.setBounds(483, 371, 97, 23);
		contentPane.add(btnNewButtonSiguiente);
		
		JLabel lblFuncionabilidad = new JLabel("Usabilidad");
		lblFuncionabilidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFuncionabilidad.setBounds(21, 0, 103, 20);
		contentPane.add(lblFuncionabilidad);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 20, 565, 2);
		contentPane.add(separator);
		
		JTextPane txtpnDescripcinCapacidadQue = new JTextPane();
		txtpnDescripcinCapacidadQue.setText("\u25CF  Subcaracter\u00EDstica: Capacidad de ser entendido\r\nDescripci\u00F3n:\tCapacidad que posee el software para ayudar a los usuarios ante una determinada situaci\u00F3n donde se necesite asistencia.\r\n \r\nCaracter\u00EDsticas a medir\r\n\u2022 Posee ayuda contextual sobre men\u00FAs y botones de acci\u00F3n.\r\n\u2022 Manual de usuario incorporado al sistema como un men\u00FA dedicado.");
		txtpnDescripcinCapacidadQue.setEditable(false);
		txtpnDescripcinCapacidadQue.setBackground(new Color(255, 255, 224));
		txtpnDescripcinCapacidadQue.setBounds(15, 31, 300, 161);
		contentPane.add(txtpnDescripcinCapacidadQue);
		
		JTextPane txtpnDescripcinEsLa = new JTextPane();
		txtpnDescripcinEsLa.setText("\u25CF  Subcaracter\u00EDstica: Capacidad de atracci\u00F3n\r\nDescripci\u00F3n\r\nEs la capacidad del producto software para ser atractivo al usuario.\r\n\r\nCaracter\u00EDsticas a medir\r\n\u2022 1..10");
		txtpnDescripcinEsLa.setEditable(false);
		txtpnDescripcinEsLa.setBackground(new Color(255, 255, 224));
		txtpnDescripcinEsLa.setBounds(15, 212, 300, 161);
		contentPane.add(txtpnDescripcinEsLa);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 203, 565, 2);
		contentPane.add(separator_1);
		
		JLabel lblSubcaractersticaCapacidad_1 = new JLabel("");
		lblSubcaractersticaCapacidad_1.setBounds(21, 168, 304, 14);
		contentPane.add(lblSubcaractersticaCapacidad_1);
		
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
		EntendidoBox.setBounds(325, 56, 215, 20);
		contentPane.add(EntendidoBox);
		
		JLabel label = new JLabel("Evaluacion");
		label.setBounds(325, 31, 220, 14);
		contentPane.add(label);
		
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
		AtractivoBox.setBounds(325, 237, 215, 20);
		contentPane.add(AtractivoBox);
		
		JLabel label_1 = new JLabel("Evaluacion");
		label_1.setBounds(325, 212, 220, 14);
		contentPane.add(label_1);
		
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
