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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class FramePortabilidad extends JFrame {

	private JPanel contentPane;
	protected int resulInta;
	private int resulAdap;

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
		setBounds(100, 100, 606, 350);
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
		btnNewButtonSiguiente.setBounds(443, 277, 97, 23);
		contentPane.add(btnNewButtonSiguiente);
		
		JLabel lblFuncionabilidad = new JLabel("Portabilidad");
		lblFuncionabilidad.setBounds(21, 0, 103, 20);
		contentPane.add(lblFuncionabilidad);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 20, 565, 2);
		contentPane.add(separator);
	
		JTextPane txtpnDescripcinEsLa = new JTextPane();
		txtpnDescripcinEsLa.setText("\u25CF        Subcaracter\u00EDstica: Adaptabilidad\r\nDescripci\u00F3n\r\nEs la capacidad del producto software de adaptarse a diferentes sistemas operativos sin cambiar su estructura interna.\r\n \r\nCaracter\u00EDsticas a medir\r\n\u2022 Compatible con 1 sistema operativo.\r\n\u2022 Compatible con 2 sistemas operativos.\r\n\u2022 Compatible con 3 o m\u00E1s sistemas operativos.");
		txtpnDescripcinEsLa.setEditable(false);
		txtpnDescripcinEsLa.setBackground(new Color(255, 255, 224));
		txtpnDescripcinEsLa.setBounds(15, 31, 306, 111);
		contentPane.add(txtpnDescripcinEsLa);
		
		JTextPane txtpnDescripcinElProducto = new JTextPane();
		txtpnDescripcinElProducto.setText("\u25CF        Subcaracter\u00EDstica: Instalabilidad\r\nDescripci\u00F3n\r\nEl producto software debe poder ser instalado en una cantidad m\u00EDnima de pasos.\r\n\r\nCaracter\u00EDsticas a medir\r\n\u2022 El producto se instala en 7 o m\u00E1s pasos\r\n\u2022 El producto se instala entre 4 y 6 pasos\r\n\u2022 El producto se instala en 3 o menos pasos\r\n");
		txtpnDescripcinElProducto.setEditable(false);
		txtpnDescripcinElProducto.setBackground(new Color(255, 255, 224));
		txtpnDescripcinElProducto.setBounds(15, 164, 306, 111);
		contentPane.add(txtpnDescripcinElProducto);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 153, 565, 2);
		contentPane.add(separator_1);
		
		JLabel label = new JLabel("Evaluacion");
		label.setBounds(331, 53, 237, 14);
		contentPane.add(label);
		
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
		AdaptabilidadBox.setBounds(365, 78, 203, 20);
		contentPane.add(AdaptabilidadBox);
		
		JLabel label_1 = new JLabel("Evaluacion");
		label_1.setBounds(331, 184, 237, 14);
		contentPane.add(label_1);
		
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
		InstalabilidadBox.setBounds(365, 209, 203, 20);
		contentPane.add(InstalabilidadBox);
	}
	
	private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botonSiguienteActionPerformed

		PrintWriter out = null;
		try {// Guardar Resultados de la ventana
			out = new PrintWriter(new BufferedWriter(new FileWriter("Entrada.in", true)));
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
