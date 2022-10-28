package com.calculadora.multipla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraMultipla extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraMultipla frame = new CalculadoraMultipla();
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
	public CalculadoraMultipla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Informe um valor: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(17, 97, 236, 26);
		contentPane.add(lblNewLabel);

		JLabel lblSuperCalculadora = new JLabel("SUPER CALCULADORA");
		lblSuperCalculadora.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuperCalculadora.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblSuperCalculadora.setBounds(87, 11, 314, 75);
		contentPane.add(lblSuperCalculadora);

		JLabel lblRestoDaDiviso = new JLabel("Resto da divisão por 2: ");
		lblRestoDaDiviso.setBounds(32, 165, 137, 14);
		contentPane.add(lblRestoDaDiviso);

		JLabel lblElevadoAoCubo = new JLabel("Elevado ao Cubo:");
		lblElevadoAoCubo.setBounds(32, 195, 137, 14);
		contentPane.add(lblElevadoAoCubo);

		JLabel lblNewLabel_3_1 = new JLabel("Raiz Quadrada:");
		lblNewLabel_3_1.setBounds(32, 220, 137, 14);
		contentPane.add(lblNewLabel_3_1);

		JLabel lblNewLabel_3_2 = new JLabel("Raiz Cúbica");
		lblNewLabel_3_2.setBounds(32, 245, 137, 14);
		contentPane.add(lblNewLabel_3_2);

		JLabel lblNewLabel_3_3 = new JLabel("Valor Absoluto:");
		lblNewLabel_3_3.setBounds(32, 270, 137, 14);
		contentPane.add(lblNewLabel_3_3);

		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 13));
		spinner.setBounds(263, 97, 165, 26);
		contentPane.add(spinner);

		JLabel lblResto = new JLabel("0");
		lblResto.setBounds(179, 165, 106, 14);
		contentPane.add(lblResto);

		JLabel lblCubo = new JLabel("0");
		lblCubo.setBounds(179, 195, 106, 14);
		contentPane.add(lblCubo);

		JLabel lblQuad = new JLabel("0");
		lblQuad.setBounds(179, 220, 106, 14);
		contentPane.add(lblQuad);

		JLabel lblCubica = new JLabel("0");
		lblCubica.setBounds(179, 245, 106, 14);
		contentPane.add(lblCubica);

		JLabel lblAbsoluta = new JLabel("0");
		lblAbsoluta.setBounds(179, 270, 106, 14);
		contentPane.add(lblAbsoluta);

		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero = (int) spinner.getValue();

				double resto = numero % 2;

						
				lblResto.setText(Double.toString(resto));
				lblCubo.setText(Double.toString(Math.round(Math.cbrt(numero))));
				lblQuad.setText(Float.toString(Math.round((float) Math.pow(numero, 2))));
				lblCubica.setText(Float.toString(Math.round((float) Math.cbrt(numero))));
				lblAbsoluta.setText(Double.toString(Math.abs(numero)));
				
				
			}
		});
		btnCalc.setBounds(323, 164, 137, 155);
		contentPane.add(btnCalc);
	}

}
