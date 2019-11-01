package AlgoritmoCalidadSimplePago;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class FrameInicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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

	public FrameInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
				
		JLabel lblAlgorimoDeCalidad = new JLabel("ALGORITMO DE CALIDAD");
		lblAlgorimoDeCalidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlgorimoDeCalidad.setBounds(20, 80, 424, 36);
		lblAlgorimoDeCalidad.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblAlgorimoDeCalidad);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(164, 179, 132, 53);
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonIniciarActionPerformed(e);
			}
		});
		contentPane.add(btnIniciar);
		
		JLabel lblEncuestaPartaEl = new JLabel("Encuesta para el usuario");
		lblEncuestaPartaEl.setBounds(300, 303, 158, 19);
		contentPane.add(lblEncuestaPartaEl);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(FrameInicial.class.getResource("/recursos/bg.jpg")));
		lblNewLabel.setBounds(0, 0, 464, 328);
		contentPane.add(lblNewLabel);
	}
	
	private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {
		/** Llamado a la siguiente ventana */
		new FrameFuncionabilidad().setVisible(true);
		this.setVisible(false);
		this.setLocationRelativeTo(null);
	}

}
