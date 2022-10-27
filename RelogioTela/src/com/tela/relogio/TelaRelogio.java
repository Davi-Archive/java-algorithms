package com.tela.relogio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TelaRelogio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelogio frame = new TelaRelogio();
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
	public TelaRelogio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dave\\Desktop\\vagas.png"));
		lblNewLabel.setBounds(0, 0, 120, 613);
		contentPane.add(lblNewLabel);
		
		JLabel lblDataHora = new JLabel("Data e Hora Atuais");
		lblDataHora.setForeground(Color.BLACK);
		lblDataHora.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblDataHora.setBounds(171, 45, 272, 43);
		contentPane.add(lblDataHora);
		
		JButton btnButton = new JButton("Ver Data");
		btnButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date diaHora = new Date();
				lblDataHora.setText(DateFormat.getDateInstance().format(diaHora));
			}
		});
		btnButton.setBounds(194, 99, 199, 33);
		contentPane.add(btnButton);
	}
}
