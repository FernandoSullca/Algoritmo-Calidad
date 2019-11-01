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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

@SuppressWarnings({"rawtypes", "unchecked"})
public class FramePortabilidad extends JFrame {

	private JPanel contentPane;
	protected int resulInta;
	private int resulAdap;
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePortabilidad frame = new FramePortabilidad();
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
	public FramePortabilidad() {
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
		btnNewButtonSiguiente.setBounds(470, 305, 110, 45);
		contentPane.add(btnNewButtonSiguiente);

		JLabel lblFuncionabilidad = new JLabel("Portabilidad");
		lblFuncionabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblFuncionabilidad.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblFuncionabilidad.setBounds(21, 0, 579, 45);
		contentPane.add(lblFuncionabilidad);

		JSeparator separator = new JSeparator();
		separator.setBounds(15, 43, 565, 12);
		contentPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 202, 565, 12);
		contentPane.add(separator_1);

		JComboBox AdaptabilidadBox = new JComboBox();
		AdaptabilidadBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 switch(AdaptabilidadBox.getSelectedIndex()) {
		            case 0: {
		            	resulAdap = 0;
		                break;
		            }
		            case 1: {
		            	resulAdap = 1;
		                break;
		            }
		            case 2: {
		            	resulAdap = 2;
		                break;
		            }
		        }
			}
		});
		AdaptabilidadBox.setModel(new DefaultComboBoxModel(new String[] {"Compatible con 1 sistema operativo.", "Compatible con 2 sistemas operativos.", "Compatible con 3 o m\u00E1s sistemas operativos."}));
		AdaptabilidadBox.setToolTipText("");
		AdaptabilidadBox.setBounds(32, 160, 361, 20);
		contentPane.add(AdaptabilidadBox);

		JComboBox InstalabilidadBox = new JComboBox();
		InstalabilidadBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(InstalabilidadBox.getSelectedIndex()) {
	            case 0: {
	            	resulInta = 0;
	                break;
	            }
	            case 1: {
	            	resulInta = 1;
	                break;
	            }
	            case 2: {
	            	resulInta = 2;
	                break;
	            }
	        }

			}
		});
		InstalabilidadBox.setModel(new DefaultComboBoxModel(new String[] {"El producto se instala en 7 o m\u00E1s pasos", "El producto se instala entre 4 y 6 pasos", "El producto se instala en 3 o menos pasos"}));
		InstalabilidadBox.setToolTipText("");
		InstalabilidadBox.setBounds(32, 305, 361, 20);
		contentPane.add(InstalabilidadBox);

		JLabel lblAdaptabilidad = new JLabel("Adaptabilidad");
		lblAdaptabilidad.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblAdaptabilidad.setBounds(31, 68, 348, 20);
		contentPane.add(lblAdaptabilidad);

		JLabel lblCompatibilidadCon = new JLabel("* Compatibilidad con diferentes sistemas operativos");
		lblCompatibilidadCon.setBounds(121, 114, 415, 20);
		contentPane.add(lblCompatibilidadCon);

		JLabel lblInstalabilidad = new JLabel("Instalabilidad");
		lblInstalabilidad.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblInstalabilidad.setBounds(27, 226, 380, 26);
		contentPane.add(lblInstalabilidad);

		JLabel lblCantidadDe = new JLabel("* Cantidad de pasos para instalar el sistema");
		lblCantidadDe.setBounds(121, 264, 415, 29);
		contentPane.add(lblCantidadDe);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FramePortabilidad.class.getResource("/recursos/bg.jpg")));
		lblNewLabel.setBounds(0, 0, 606, 377);
		contentPane.add(lblNewLabel);
	}

	private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botonSiguienteActionPerformed

		PrintWriter out = null;
		try {// Guardar Resultados de la ventana
			out = new PrintWriter(new BufferedWriter(new FileWriter("Repuesta De Usuario.in", true)));
			out.println(resulAdap);
			out.println(resulInta);
		} catch (IOException e) {
			System.err.println(e);
		}
		out.close();
		/** Llamado a la siguiente ventana */
		new FrameCalculoFinal().setVisible(true);
		this.setVisible(false);
		this.setLocationRelativeTo(null);
	}// GEN-LAST:event_botonSiguienteActionPerformed

}
