package com.swing.somar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaSomar extends JFrame {

	private JPanel contentPane;
	private JTextField txtN2;
	private JTextField txtN1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSomar frame = new TelaSomar();
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
	public TelaSomar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 266);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtN1 = new JTextField();
		txtN1.setBounds(60, 38, 116, 40);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setBounds(226, 38, 116, 40);
		contentPane.add(txtN2);
		txtN2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setBounds(185, 38, 31, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblResultado = new JLabel("0", (int) CENTER_ALIGNMENT);
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 72));
		lblResultado.setBounds(75, 148, 267, 68);
		contentPane.add(lblResultado);
		
		JButton btnSoma = new JButton("=");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txtN1.getText());
				int n2 = Integer.parseInt(txtN2.getText());
				
				int soma = n1 + n2;
				
				lblResultado.setText(Integer.toString(soma));
				
				
			}
		});
		btnSoma.setFont(new Font("Times New Roman", Font.BOLD, 56));
		btnSoma.setBounds(155, 99, 89, 46);
		contentPane.add(btnSoma);
	}
}
