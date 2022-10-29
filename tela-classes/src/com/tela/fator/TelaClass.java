package com.tela.fator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaClass extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaClass frame = new TelaClass();
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
	public TelaClass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 34));
		spinner.setBounds(94, 21, 43, 48);
		contentPane.add(spinner);
		
		JLabel lblNewLabel = new JLabel("Valor: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblNewLabel.setBounds(0, 24, 99, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblRes = new JLabel("");
		lblRes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRes.setBounds(10, 116, 414, 17);
		contentPane.add(lblRes);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value = (int) spinner.getValue();
				int resultado = Calculos.fatorar(value);
				String formula = Calculos.criarFatorar(value);
				System.out.println(formula+ " = "+ resultado);
				lblRes.setText(formula+ " = "+ resultado);
			}
		});
		btnNewButton.setBounds(188, 21, 105, 32);
		contentPane.add(btnNewButton);
	}

}
