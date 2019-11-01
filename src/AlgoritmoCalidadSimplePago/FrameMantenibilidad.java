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

public class FrameMantenibilidad extends JFrame {

	private JPanel contentPane;
	protected int resulCapAnali;
	protected int resulCapCambi;

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
		
		JLabel lblFuncionabilidad = new JLabel("Mantenibilidad");
		lblFuncionabilidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFuncionabilidad.setBounds(21, 0, 103, 20);
		contentPane.add(lblFuncionabilidad);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 20, 565, 4);
		contentPane.add(separator);
		
		JTextPane txtpnDescripcinParaEvaluar = new JTextPane();
		txtpnDescripcinParaEvaluar.setText("\u25CF  Subcaracter\u00EDstica: Capacidad del c\u00F3digo para ser analizado\r\nDescripci\u00F3n\r\nPara evaluar esta subcaracter\u00EDstica se tiene en cuenta el porcentaje de comentarios que posee el c\u00F3digo por cada m\u00E9todo y en general.\r\n \r\nCaracter\u00EDsticas a medir\r\n\u2022 \"N%\" del c\u00F3digo comentado\r\n");
		txtpnDescripcinParaEvaluar.setEditable(false);
		txtpnDescripcinParaEvaluar.setBackground(new Color(255, 255, 224));
		txtpnDescripcinParaEvaluar.setBounds(15, 31, 300, 161);
		contentPane.add(txtpnDescripcinParaEvaluar);
		
		JTextPane txtpnDescripcinParaEvaluar_1 = new JTextPane();
		txtpnDescripcinParaEvaluar_1.setText("\u25CF   Subcaracter\u00EDstica: Capacidad del c\u00F3digo para ser cambiado\r\nDescripci\u00F3n\r\nPara evaluar esta subcaracter\u00EDstica se tomar\u00E1 en cuenta la complejidad ciclom\u00E1tica del m\u00E9todo.\r\n \r\nCaracter\u00EDsticas a medir\r\n\u2022 La complejidad ciclom\u00E1tica es mayor o igual a , entre , menor o igual a \"N\"");
		txtpnDescripcinParaEvaluar_1.setEditable(false);
		txtpnDescripcinParaEvaluar_1.setBackground(new Color(255, 255, 224));
		txtpnDescripcinParaEvaluar_1.setBounds(15, 212, 300, 161);
		contentPane.add(txtpnDescripcinParaEvaluar_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 203, 565, 11);
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
		analizadoBox.setBounds(325, 56, 215, 20);
		contentPane.add(analizadoBox);
		
		JLabel label = new JLabel("Evaluacion");
		label.setBounds(325, 35, 220, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Evaluacion");
		label_1.setBounds(325, 212, 220, 14);
		contentPane.add(label_1);
		
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
		cambiadoBox.setBounds(325, 237, 215, 20);
		contentPane.add(cambiadoBox);
		
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
