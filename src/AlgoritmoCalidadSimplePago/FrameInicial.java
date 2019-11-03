package AlgoritmoCalidadSimplePago;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
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
		setBounds(100, 100, 450,300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
				
		JLabel lblAlgorimoDeCalidad = new JLabel("Algorimo de Calidad");
		lblAlgorimoDeCalidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlgorimoDeCalidad.setBounds(5, 5, 424, 42);
		lblAlgorimoDeCalidad.setFont(new Font("Tahoma", Font.BOLD, 25));
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 5, 434, 256);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFondo = new JLabel("fondo");
		lblFondo.setBounds(0, 0, 434, 256);
		panel.add(lblFondo);
		lblFondo.setIcon(new ImageIcon(FrameInicial.class.getResource("/resurso/bg.jpg")));
	}
	
	private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botonSiguienteActionPerformed
		/** Llamado a la siguiente ventana */
		new FrameFuncionabilidad().setVisible(true);
		this.setVisible(false);
		this.setLocationRelativeTo(null);
	}// GEN-LAST:event_botonSiguienteActionPerformed
}
