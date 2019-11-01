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
public class FrameFiabilidad extends JFrame {

	private JPanel contentPane;
	protected int resultadoTole;
	protected int resultadoCapacidad;
	private static final long serialVersionUID = 1L;

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
	public FrameFiabilidad() {
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
		btnNewButtonSiguiente.setBounds(476, 310, 110, 45);
		contentPane.add(btnNewButtonSiguiente);

		JLabel lblFuncionabilidad = new JLabel("Fiabilidad");
		lblFuncionabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblFuncionabilidad.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblFuncionabilidad.setBounds(21, 0, 559, 45);
		contentPane.add(lblFuncionabilidad);

		JSeparator separator = new JSeparator();
		separator.setBounds(21, 45, 565, 16);
		contentPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 194, 565, 16);
		contentPane.add(separator_1);

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
		ToleranciaBox.setBounds(42, 157, 360, 25);
		contentPane.add(ToleranciaBox);

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
		CapacidadBox.setToolTipText("Evaluaci\u00F3n\r\nNo cumple con ninguna caracter\u00EDstica. \u2192 0 puntos\r\nCumple con 1 caracter\u00EDstica. \u2192 1 punto\r\nCumple con 2 caracter\u00EDsticas. \u2192 2 puntos\r\n");
		CapacidadBox.setBounds(42, 305, 360, 20);
		contentPane.add(CapacidadBox);

		JLabel lblToleranciaAFallos = new JLabel("Tolerancia a Fallos");
		lblToleranciaAFallos.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblToleranciaAFallos.setBounds(42, 57, 164, 25);
		contentPane.add(lblToleranciaAFallos);

		JLabel lblProteccionDe = new JLabel("* Proteccion de datos");
		lblProteccionDe.setBounds(129, 94, 326, 20);
		contentPane.add(lblProteccionDe);

		JLabel lblLogsDe = new JLabel("* Logs de actividades");
		lblLogsDe.setBounds(129, 126, 208, 16);
		contentPane.add(lblLogsDe);

		JLabel lblCapacidadDeRecuperacion = new JLabel("Capacidad de Recuperacion");
		lblCapacidadDeRecuperacion.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblCapacidadDeRecuperacion.setBounds(52, 209, 403, 20);
		contentPane.add(lblCapacidadDeRecuperacion);

		JLabel lblReanudacionDe = new JLabel("* Reanudacion de actividades");
		lblReanudacionDe.setBounds(129, 241, 290, 20);
		contentPane.add(lblReanudacionDe);

		JLabel lblMantenibilidadDel = new JLabel("* Mantenibilidad del estadio previo al error");
		lblMantenibilidadDel.setBounds(129, 273, 273, 20);
		contentPane.add(lblMantenibilidadDel);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FrameFiabilidad.class.getResource("/recursos/bg.jpg")));
		lblNewLabel.setBounds(0, 0, 606, 361);
		contentPane.add(lblNewLabel);

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
