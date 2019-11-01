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
public class FrameEficiencia extends JFrame {

	private JPanel contentPane;
	private int resultadoRecur;
	private int resultadoTime;
	private static final long serialVersionUID = 1L;
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
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 57, 565, 6);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 200, 565, 12);
		contentPane.add(separator_1);
		
		JLabel lblEficiencia = new JLabel("Eficiencia");
		lblEficiencia.setHorizontalAlignment(SwingConstants.CENTER);
		lblEficiencia.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblEficiencia.setBounds(20, 0, 580, 45);
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
		RecursoBox.setBounds(36, 169, 366, 20);
		contentPane.add(RecursoBox);
		
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
		TiempoBox.setBounds(36, 317, 366, 20);
		contentPane.add(TiempoBox);
		
		JLabel lblUtilizacionDeRecursos = new JLabel("Utilizacion de Recursos");
		lblUtilizacionDeRecursos.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblUtilizacionDeRecursos.setBounds(36, 75, 279, 29);
		contentPane.add(lblUtilizacionDeRecursos);
		
		JLabel lblDe = new JLabel("* % de uso del Procesador");
		lblDe.setBounds(117, 125, 242, 20);
		contentPane.add(lblDe);
		
		JLabel lblComportamientoFrenteAl = new JLabel("Comportamiento frente al tiempo");
		lblComportamientoFrenteAl.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblComportamientoFrenteAl.setBounds(36, 224, 353, 20);
		contentPane.add(lblComportamientoFrenteAl);
		
		JLabel lblTiempoDe = new JLabel("* Tiempo de respuesta del Sistema");
		lblTiempoDe.setBounds(117, 271, 254, 20);
		contentPane.add(lblTiempoDe);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FrameEficiencia.class.getResource("/recursos/bg.jpg")));
		lblNewLabel.setBounds(0, 0, 606, 356);
		contentPane.add(lblNewLabel);
	}

	private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botonSiguienteActionPerformed

		PrintWriter out = null;
		try {// Guardar Resultados de la ventana
			out = new PrintWriter(new BufferedWriter(new FileWriter("Repuesta De Usuario.in", true)));
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
