package AlgoritmoCalidadSimplePago;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AlgoritmoCalidadSimplePago.FrameEficiencia;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class FrameFuncionabilidad extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int resultadoSeg;
	private int resultadoExac;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameFuncionabilidad frame = new FrameFuncionabilidad();
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
	public FrameFuncionabilidad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Algoritmo de Calidad Simple págo");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JButton btnNewButtonSiguiente = new JButton("Siguiente");
		btnNewButtonSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botonSiguienteActionPerformed(arg0);
			}
		});
		btnNewButtonSiguiente.setBounds(483, 277, 97, 23);
		contentPane.add(btnNewButtonSiguiente);

		JLabel lblFuncionabilidad = new JLabel("Funcionabilidad");
		lblFuncionabilidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFuncionabilidad.setBounds(21, 0, 103, 20);
		contentPane.add(lblFuncionabilidad);

		JSeparator separator = new JSeparator();
		separator.setBounds(15, 20, 565, 14);
		contentPane.add(separator);
		
		JTextPane txtpnSubcaractersticaSeguridadDe = new JTextPane();
		txtpnSubcaractersticaSeguridadDe.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtpnSubcaractersticaSeguridadDe.setEditable(false);
		txtpnSubcaractersticaSeguridadDe.setText("\u25CF  Subcaracter\u00EDstica:  Seguridad de acceso\r\nDescripci\u00F3n:\r\nCapacidad del producto software para asegurar la integridad y confidencialidad de los datos.\r\n\r\nCaracter\u00EDsticas a medir:\r\n\u2022 Encriptaci\u00F3n de datos\r\n\u2022 Inicio de sesi\u00F3n de usuarios");
		txtpnSubcaractersticaSeguridadDe.setBackground(new Color(255, 255, 224));
		txtpnSubcaractersticaSeguridadDe.setBounds(15, 31, 300, 118);
		contentPane.add(txtpnSubcaractersticaSeguridadDe);
		
		JTextPane txtpnDescripcinEsLa = new JTextPane();
		txtpnDescripcinEsLa.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtpnDescripcinEsLa.setText("\u25CF  Subcaracter\u00EDstica: Exactitud de resultados\r\nDescripci\u00F3n:\r\nEs la capacidad del producto software para proporcionar los resultados con el grado necesario de precisi\u00F3n.\r\n \r\nCaracter\u00EDsticas a medir\r\n\u2022 Los resultados tienen m\u00E1s de \"N\" errores");
		txtpnDescripcinEsLa.setEditable(false);
		txtpnDescripcinEsLa.setBackground(new Color(255, 255, 224));
		txtpnDescripcinEsLa.setBounds(15, 163, 300, 123);
		contentPane.add(txtpnDescripcinEsLa);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 153, 565, 23);
		contentPane.add(separator_1);
		
		JComboBox SeguridadBox = new JComboBox();
		SeguridadBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println(SeguridadBox.getSelectedIndex());
				  switch(SeguridadBox.getSelectedIndex()) {
		            case 0: {
		            	resultadoSeg = 0;
		                break;
		            }
		            case 1: {
		            	resultadoSeg = 1;
		                break;
		            }
		            case 2: {
		            	resultadoSeg = 2;
		                break;
		            }
		        }
			}
		});
		SeguridadBox.setModel(new DefaultComboBoxModel(new String[] {"No cumple con ninguna caracter\u00EDstica.", "Cumple con 1 caracter\u00EDstica.", "Cumple con 2 caracter\u00EDsticas."}));
		SeguridadBox.setToolTipText("Evaluaci\u00F3n\r\nNo cumple con ninguna caracter\u00EDstica. \u2192 0 puntos\r\nCumple con 1 caracter\u00EDstica. \u2192 1 punto\r\nCumple con 2 caracter\u00EDsticas. \u2192 2 puntos\r\n");
		SeguridadBox.setBounds(325, 70, 237, 20);
		contentPane.add(SeguridadBox);
		
		JLabel lblEvaluacion = new JLabel("Evaluacion");
		lblEvaluacion.setBounds(325, 45, 237, 14);
		contentPane.add(lblEvaluacion);
		
		JComboBox ExactitudBox = new JComboBox();
		ExactitudBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   
				//System.out.println(ExactitudBox.getSelectedIndex());
				   
				  switch(ExactitudBox.getSelectedIndex()) {
		            case 0: 
		         
		            {
		            	resultadoExac = 0;
		                break;
		            }
		            case 1: {
		            	resultadoExac = 1;
		                break;
		            }
		            case 2: {
		            	resultadoExac = 2;
		                break;
		            }
		        }
			}
		});
		ExactitudBox.setModel(new DefaultComboBoxModel(new String[] {"Los resultados tienen m\u00E1s de 3 errores", "Los resultados tienen entre 0 y 3 errores", "Los resultados se muestran sin errores"}));
		ExactitudBox.setToolTipText("Evaluaci\u00F3n\r\nNo cumple con ninguna caracter\u00EDstica. \u2192 0 puntos\r\nCumple con 1 caracter\u00EDstica. \u2192 1 punto\r\nCumple con 2 caracter\u00EDsticas. \u2192 2 puntos\r\n");
		ExactitudBox.setBounds(325, 201, 237, 20);
		contentPane.add(ExactitudBox);
		
		JLabel label = new JLabel("Evaluacion");
		label.setBounds(325, 176, 237, 14);
		contentPane.add(label);
	}

	private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botonSiguienteActionPerformed

		PrintWriter out = null;
		try {// Guardar Resultados de la ventana Piso el archivo existente
			out = new PrintWriter(new File("Repuesta De Usuario.in"));
			out.println(resultadoSeg);
			out.println(resultadoExac);
		} catch (IOException e) {
			System.err.println(e);
		}
		out.close();
		/** Llamado a la siguiente ventana */
		new FrameEficiencia().setVisible(true);
		this.setLocationRelativeTo(null);
		this.setVisible(false);
		
	}// GEN-LAST:event_botonSiguienteActionPerformed
}
