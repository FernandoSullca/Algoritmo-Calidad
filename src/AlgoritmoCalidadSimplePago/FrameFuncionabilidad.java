package AlgoritmoCalidadSimplePago;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AlgoritmoCalidadSimplePago.FrameEficiencia;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

@SuppressWarnings({"rawtypes", "unchecked"})
public class FrameFuncionabilidad extends JFrame {

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
		setBounds(100, 100, 606, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Algoritmo de Calidad Simple - Pago");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JButton btnNewButtonSiguiente = new JButton("Siguiente");
		btnNewButtonSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botonSiguienteActionPerformed(arg0);
			}
		});
		btnNewButtonSiguiente.setBounds(476, 310, 110, 45);
		contentPane.add(btnNewButtonSiguiente);

		JLabel lblFuncionabilidad = new JLabel("Funcionabilidad");
		lblFuncionabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblFuncionabilidad.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblFuncionabilidad.setBounds(21, 0, 565, 45);
		contentPane.add(lblFuncionabilidad);

		JSeparator separator = new JSeparator();
		separator.setBounds(21, 48, 565, 14);
		contentPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(21, 210, 565, 23);
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
		SeguridadBox.setModel(new DefaultComboBoxModel(new String[] {
				"No cumple con ninguna caracter\u00EDstica.",
				"Cumple con 1 caracter\u00EDstica.",
				"Cumple con 2 caracter\u00EDsticas."}));
		SeguridadBox.setToolTipText("Evaluaci\u00F3n\r\nNo cumple con ninguna caracter\u00EDstica. \u2192 0 puntos\r\nCumple con 1 caracter\u00EDstica. \u2192 1 punto\r\nCumple con 2 caracter\u00EDsticas. \u2192 2 puntos\r\n");
		SeguridadBox.setBounds(37, 175, 391, 23);
		contentPane.add(SeguridadBox);

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
		ExactitudBox.setBounds(37, 305, 391, 23);
		contentPane.add(ExactitudBox);

		JLabel lblSeguridadDeAcceso = new JLabel("Seguridad de Acceso");
		lblSeguridadDeAcceso.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSeguridadDeAcceso.setBounds(31, 69, 539, 30);
		contentPane.add(lblSeguridadDeAcceso);

		JLabel lblEncriptacionDeDatos = new JLabel("* Encriptacion de datos");
		lblEncriptacionDeDatos.setBounds(121, 111, 162, 23);
		contentPane.add(lblEncriptacionDeDatos);

		JLabel lblInicioDeSesion = new JLabel("* Inicio de sesion de usuarios");
		lblInicioDeSesion.setBounds(120, 146, 402, 22);
		contentPane.add(lblInicioDeSesion);

		JLabel lblNewLabel = new JLabel("Exactitud de Resultados");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(31, 231, 539, 30);
		contentPane.add(lblNewLabel);

		JLabel lblCantidadDeErrores = new JLabel("* Cantidad de Errores");
		lblCantidadDeErrores.setBounds(135, 278, 162, 23);
		contentPane.add(lblCantidadDeErrores);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(FrameFuncionabilidad.class.getResource("/recursos/bg.jpg")));
		lblNewLabel_1.setBounds(0, 0, 606, 378);
		contentPane.add(lblNewLabel_1);
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
