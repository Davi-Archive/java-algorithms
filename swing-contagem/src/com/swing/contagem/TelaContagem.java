package com.swing.contagem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaContagem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaContagem frame = new TelaContagem();
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
	public TelaContagem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 319, 186);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Contagem:");
		lblNewLabel.setBounds(26, 11, 63, 14);
		contentPane.add(lblNewLabel);

		JLabel lblContagem = new JLabel("");
		lblContagem.setBounds(10, 50, 279, 14);
		contentPane.add(lblContagem);

		JButton btnNewButton = new JButton("Contar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cc = 0;
				String contagem = "";
				while (cc < 10) {
					cc++;
					contagem += cc + " ";
					lblContagem.setText(contagem);

				}

			}
		});
		btnNewButton.setBounds(24, 98, 89, 23);
		contentPane.add(btnNewButton);
	}

}
