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

public class FrameEficiencia extends JFrame {

	private JPanel contentPane;
	private int resultadoRecur;
	private int resultadoTime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameEficiencia frame = new FrameEficiencia();
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
	public FrameEficiencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Algoritmo de Calidad Simple p�go");
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
	
		
		JButton btnNewButtonSiguiente = new JButton("Siguiente");
		btnNewButtonSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 botonSiguienteActionPerformed(e);
			}
		});
		btnNewButtonSiguiente.setBounds(483, 277, 97, 23);
		contentPane.add(btnNewButtonSiguiente);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 20, 565, 2);
		contentPane.add(separator);
		
		JTextPane txtpnDescripcinSeEvaluar = new JTextPane();
		txtpnDescripcinSeEvaluar.setText("\u25CF  Subcaracter\u00EDstica: Utilizaci\u00F3n de recursos\r\nDescripci\u00F3n:\tSe evaluar\u00E1 la eficiencia del producto software de acuerdo al porcentaje de uso de procesador que realice.\r\n\r\nCaracter\u00EDsticas a medir\r\n\u2022\" N% \" de uso de procesador\r\n");
		txtpnDescripcinSeEvaluar.setEditable(false);
		txtpnDescripcinSeEvaluar.setBackground(new Color(255, 255, 224));
		txtpnDescripcinSeEvaluar.setBounds(15, 31, 301, 109);
		contentPane.add(txtpnDescripcinSeEvaluar);
		
		JTextPane txtpnDescripcinSeEvaluar_1 = new JTextPane();
		txtpnDescripcinSeEvaluar_1.setText("\u25CF  Subcaracter\u00EDstica: Comportamiento en el tiempo\r\nDescripci\u00F3n:\r\nSe evaluar\u00E1 el tiempo que est\u00E1 el producto software sin informarle al usuario del estado en que se encuentra la solicitud que realiz\u00F3.\r\n \r\nCaracter\u00EDsticas a medir\r\n\u2022 El producto est\u00E1 \"N\" segundos sin informar al usuario del estado de la solicitud");
		txtpnDescripcinSeEvaluar_1.setEditable(false);
		txtpnDescripcinSeEvaluar_1.setBackground(new Color(255, 255, 224));
		txtpnDescripcinSeEvaluar_1.setBounds(15, 164, 301, 136);
		contentPane.add(txtpnDescripcinSeEvaluar_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 153, 565, 2);
		contentPane.add(separator_1);
		
		JLabel lblEficiencia = new JLabel("Eficiencia");
		lblEficiencia.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEficiencia.setBounds(20, 0, 103, 20);
		contentPane.add(lblEficiencia);
		
		JComboBox RecursoBox = new JComboBox();
		RecursoBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  switch(RecursoBox.getSelectedIndex()) {
		            case 0: {
		            	resultadoRecur = 0;
		                break;
		            }
		            case 1: {
		            	resultadoRecur = 1;
		                break;
		            }
		            case 2: {
		            	resultadoRecur = 2;
		                break;
		            }
		        }
			}
		});
		RecursoBox.setModel(new DefaultComboBoxModel(new String[] {"46% o m\u00E1s", "21% a 45%", "20% o menos"}));
		RecursoBox.setBounds(449, 74, 131, 20);
		contentPane.add(RecursoBox);
		
		JLabel lblEvaluacion = new JLabel("Evaluacion");
		lblEvaluacion.setBounds(449, 47, 131, 14);
		contentPane.add(lblEvaluacion);
		
		JLabel label = new JLabel("Evaluacion");
		label.setBounds(449, 181, 131, 14);
		contentPane.add(label);
		
		JComboBox TiempoBox = new JComboBox();
		TiempoBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  switch(TiempoBox.getSelectedIndex()) {
		            case 0: {
		            	resultadoTime = 0;
		                break;
		            }
		            case 1: {
		            	resultadoTime = 1;
		                break;
		            }
		            case 2: {
		            	resultadoTime = 2;
		                break;
		            }
		        }
			}
		});
		TiempoBox.setModel(new DefaultComboBoxModel(new String[] {"4 o m\u00E1s segundos", "3 segundos", "menos de 2 segundos"}));
		TiempoBox.setBounds(449, 206, 131, 20);
		contentPane.add(TiempoBox);
	}

	private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botonSiguienteActionPerformed

		PrintWriter out = null;
		try {// Guardar Resultados de la ventana
			out = new PrintWriter(new BufferedWriter(new FileWriter("Entrada.in", true)));
			out.println(resultadoRecur);
			out.println(resultadoTime);
		} catch (IOException e) {
			System.err.println(e);
		}
		out.close();
		/** Llamado a la siguiente ventana */
		new FrameFiabilidad().setVisible(true);
		this.setLocationRelativeTo(null);
		this.setVisible(false);
		
	}// GEN-LAST:event_botonSiguienteActionPerformed

}
