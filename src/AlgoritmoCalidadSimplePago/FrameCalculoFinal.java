package AlgoritmoCalidadSimplePago;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.security.auth.callback.TextOutputCallback;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class FrameCalculoFinal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textFieldPromedio;
	/**** variable para el calculo **/
	private int[] Entradas;
	private double[] Promedios;
	private int[] Pesocaracteristica = { 15, 15, 10, 10, 10, 7 };
	private double PromedioTotal;
	private static final double Minimo_aceptable = 11.25;
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCalculoFinal frame = new FrameCalculoFinal();
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
	public FrameCalculoFinal() {

		Entradas = new int[12];
		Promedios = new double[6];

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		setTitle("Algoritmo de Calidad Simple - Pago");
		contentPane.setLayout(null);
		contentPane.setLayout(null);

		JLabel lblFuncionabilidad = new JLabel("Funcionabilidad");
		lblFuncionabilidad.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblFuncionabilidad.setBounds(20, 105, 152, 25);
		contentPane.add(lblFuncionabilidad);

		JLabel lblEficiencia = new JLabel("Eficiencia");
		lblEficiencia.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblEficiencia.setBounds(20, 135, 152, 25);
		contentPane.add(lblEficiencia);

		JLabel lblFiabilidad = new JLabel("Fiabilidad");
		lblFiabilidad.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblFiabilidad.setBounds(20, 165, 152, 25);
		contentPane.add(lblFiabilidad);

		JLabel lblMantenibilidad = new JLabel("Mantenibilidad");
		lblMantenibilidad.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblMantenibilidad.setBounds(20, 195, 152, 25);
		contentPane.add(lblMantenibilidad);

		JLabel lblUsabilidad = new JLabel("Usabilidad");
		lblUsabilidad.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblUsabilidad.setBounds(20, 233, 152, 25);
		contentPane.add(lblUsabilidad);

		JLabel lblProtabilidad = new JLabel("Protabilidad");
		lblProtabilidad.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblProtabilidad.setBounds(20, 270, 152, 25);
		contentPane.add(lblProtabilidad);

		JLabel lblToalPromedioPonderado = new JLabel("Total - Promedio Ponderado.");
		lblToalPromedioPonderado.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblToalPromedioPonderado.setBounds(20, 307, 272, 21);
		contentPane.add(lblToalPromedioPonderado);

		JLabel lblAnalisisFinal = new JLabel("Analisis Final");
		lblAnalisisFinal.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnalisisFinal.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblAnalisisFinal.setBounds(6, 11, 594, 45);
		contentPane.add(lblAnalisisFinal);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setBounds(300, 104, 75, 25);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setBounds(300, 134, 75, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEditable(false);
		textField_2.setBounds(300, 164, 75, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setEditable(false);
		textField_3.setBounds(300, 194, 75, 25);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setEditable(false);
		textField_4.setBounds(300, 231, 75, 25);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setEditable(false);
		textField_5.setBounds(300, 267, 75, 25);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(6, 61, 570, 14);
		contentPane.add(separator);

		textFieldPromedio = new JTextField();
		textFieldPromedio.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPromedio.setEditable(false);
		textFieldPromedio.setBounds(300, 304, 75, 25);
		contentPane.add(textFieldPromedio);
		textFieldPromedio.setColumns(10);

		JButton btnSali = new JButton("SALIR");
		btnSali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSali.setBounds(444, 284, 110, 45);
		contentPane.add(btnSali);

		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		textPane.setBounds(395, 135, 193, 118);
		contentPane.add(textPane);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FrameCalculoFinal.class.getResource("/recursos/bg.jpg")));
		lblNewLabel.setBounds(0, 0, 606, 356);
		contentPane.add(lblNewLabel);
		inciciarCalculo();

		if(error_de_entrada_requisitos_minimos())
			textPane.setText("Nivel de calidad es:"
					+ "\nNO Satisfactorio\n"
					+ "\"NO Cumple con el minimo aceptable\"");
		else
			{if(PromedioTotal<Minimo_aceptable)
			textPane.setText("Nivel de calidad"
					+ "\nNO Satisfactorio\n");
			else
				{
				textPane.setText("Nivel de calidad"
						+ "\n Satisfactorio\n");

				}
			}
		CargarCampos();
	}

	private void inciciarCalculo() {
		// TODO Auto-generated method stub
		int i;
		int j;
		double Promedio_general = 0;
		/*** Lectura de los valores ingresados */
		Scanner in = null;
		try {// Guardar Resultados de la ventana
			in = new Scanner(new File("Repuesta De Usuario.in"));
		} catch (IOException e) {
			System.out.println(e);
		}
		for (i = 0; i < 12; i++) {
			Entradas[i] = in.nextInt();
		}
		in.close();
		/*** Fin de lectura *******/

		/*** Calcular las variables a utilizar */
		for (j = 0; j < 6; j++) {
			double decimal = (double) ((Entradas[j * 2] + Entradas[(j * 2) + 1]));
			Promedios[j] = (decimal / 2);
			Promedio_general += (Promedios[j] * Pesocaracteristica[j]);
		}
		PromedioTotal = (Promedio_general / 6);
	}

	/**
	 * @param Promedio_general
	 */
	public void CargarCampos() {

		textField.setText(String.valueOf(Promedios[0] * Pesocaracteristica[0]));
		textField_1.setText(String.valueOf(Promedios[1] * Pesocaracteristica[1]));
		textField_2.setText(String.valueOf(Promedios[2] * Pesocaracteristica[2]));
		textField_3.setText(String.valueOf(Promedios[3] * Pesocaracteristica[3]));
		textField_4.setText(String.valueOf(Promedios[4] * Pesocaracteristica[4]));
		textField_5.setText(String.valueOf(Promedios[5] * Pesocaracteristica[5]));
		/*
		 * DecimalFormat df= new DecimalFormat("#.00");
		 * textFieldPromedio.setText(String.valueOf(df.format(decimal)));
		 */
		textFieldPromedio.setText("0.0");
	}

	/**
	 * @return
	 */
	public boolean error_de_entrada_requisitos_minimos() {
		boolean error = false;
				if (Entradas[0] < 2)
					error = true;
				for (int K = 1; K < 12; K++) {
					if (Entradas[K] < 1)
						error = true;
				}
				return error;
	}

}
