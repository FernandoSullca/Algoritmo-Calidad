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
		setBounds(100, 100, 606, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		setTitle("Algoritmo de Calidad Simple p�go:Resultados");
		contentPane.setLayout(null);
		contentPane.setLayout(null);

		JLabel lblFuncionabilidad = new JLabel("Funcionabilidad");
		lblFuncionabilidad.setBounds(20, 50, 152, 14);
		contentPane.add(lblFuncionabilidad);

		JLabel lblEficiencia = new JLabel("Eficiencia");
		lblEficiencia.setBounds(20, 80, 152, 14);
		contentPane.add(lblEficiencia);

		JLabel lblFiabilidad = new JLabel("Fiabilidad");
		lblFiabilidad.setBounds(20, 110, 152, 14);
		contentPane.add(lblFiabilidad);

		JLabel lblMantenibilidad = new JLabel("Mantenibilidad");
		lblMantenibilidad.setBounds(20, 140, 152, 14);
		contentPane.add(lblMantenibilidad);

		JLabel lblUsabilidad = new JLabel("Usabilidad");
		lblUsabilidad.setBounds(20, 170, 152, 14);
		contentPane.add(lblUsabilidad);

		JLabel lblProtabilidad = new JLabel("Protabilidad");
		lblProtabilidad.setBounds(20, 200, 152, 14);
		contentPane.add(lblProtabilidad);

		JLabel lblToalPromedioPonderado = new JLabel("Toal Promedio Ponderado.");
		lblToalPromedioPonderado.setBounds(20, 230, 152, 14);
		contentPane.add(lblToalPromedioPonderado);

		JLabel lblAnalisisFinal = new JLabel("Analisis Final");
		lblAnalisisFinal.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAnalisisFinal.setBounds(208, 11, 181, 21);
		contentPane.add(lblAnalisisFinal);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(200, 50, 42, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(200, 80, 42, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(200, 110, 42, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(200, 140, 42, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(200, 170, 42, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(200, 200, 42, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 43, 570, 6);
		contentPane.add(separator);

		textFieldPromedio = new JTextField();
		textFieldPromedio.setEditable(false);
		textFieldPromedio.setBounds(200, 230, 42, 20);
		contentPane.add(textFieldPromedio);
		textFieldPromedio.setColumns(10);

		JButton btnSali = new JButton("Sali");
		btnSali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSali.setBounds(318, 196, 191, 23);
		contentPane.add(btnSali);

		JTextPane textPane = new JTextPane();
		textPane.setBounds(335, 80, 152, 80);
		contentPane.add(textPane);
		inciciarCalculo();
		
		if(error_de_entrada_requisitos_minimos())
			textPane.setText("El nivel de calidad es: \nNO Satisfactorio\n\"NO Cumple con el minimo aceptable\"");
		else 
			{if(PromedioTotal<Minimo_aceptable)
			textPane.setText("El nivel de calidad es: \nNO Satisfactorio\n");
			else
				{
				textPane.setText("El nivel de calidad es:\n Satisfactorio\n");
			
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
		textFieldPromedio.setText(String.format("%.2f", PromedioTotal));
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
