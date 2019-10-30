package AlgoritmoCalidadSimplePago;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class FrameInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameInicial frame = new FrameInicial();
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
	public FrameInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
				
		JLabel lblAlgorimoDeCalidad = new JLabel("Algorimo de Calidad");
		lblAlgorimoDeCalidad.setBounds(5, 5, 424, 19);
		lblAlgorimoDeCalidad.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblAlgorimoDeCalidad);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(158, 133, 132, 53);
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonIniciarActionPerformed(e);
			}
		});
		contentPane.add(btnIniciar);
		
		JLabel lblEncuestaPartaEl = new JLabel("Encuesta para el usuario...");
		lblEncuestaPartaEl.setBounds(69, 69, 279, 14);
		contentPane.add(lblEncuestaPartaEl);
	}
	
	private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botonSiguienteActionPerformed
		/** Llamado a la siguiente ventana */
		new FrameFuncionabilidad().setVisible(true);
		this.setVisible(false);
		this.setLocationRelativeTo(null);
	}// GEN-LAST:event_botonSiguienteActionPerformed

}
