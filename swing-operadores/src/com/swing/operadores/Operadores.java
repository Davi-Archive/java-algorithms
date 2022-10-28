package com.swing.operadores;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Operadores extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Operadores frame = new Operadores();
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
	public Operadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 248, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numerador");
		lblNewLabel.setBounds(20, 33, 64, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Denominador");
		lblNewLabel_1.setBounds(20, 71, 64, 14);
		contentPane.add(lblNewLabel_1);
		
		txt1 = new JTextField();
		txt1.setBounds(108, 30, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(108, 68, 86, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Divisao");
		lblNewLabel_2.setBounds(20, 175, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblDiv = new JLabel("");
		lblDiv.setBounds(88, 175, 46, 14);
		contentPane.add(lblDiv);
		
		JLabel lblRest = new JLabel("");
		lblRest.setBounds(88, 216, 46, 14);
		contentPane.add(lblRest);
		
		JLabel lblNewLabel_2_3 = new JLabel("Resto");
		lblNewLabel_2_3.setBounds(20, 216, 46, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numerador = Integer.parseInt(txt1.getText());
				int denominador = Integer.parseInt(txt2.getText());
				
				float divisao = numerador / denominador;
				float resto = numerador % denominador;
				
				lblDiv.setText(Float.toString(divisao));
				lblRest.setText(Float.toString(resto));
			}
		});
		btnCalc.setBounds(62, 117, 89, 23);
		contentPane.add(btnCalc);
	}
}
