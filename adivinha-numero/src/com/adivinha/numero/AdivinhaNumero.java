package com.adivinha.numero;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdivinhaNumero extends JFrame {
	static int nMax;
	static int n1;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		nMax = (int) Math.floor(Math.random() * (10 - 5)) + 5;
		n1 = (int) Math.floor(Math.random() * (nMax - 1)) + 1;
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdivinhaNumero frame = new AdivinhaNumero();
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
	public AdivinhaNumero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Adivinhe o número de:");
		lblNewLabel.setBounds(6, 24, 115, 64);
		contentPane.add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(29, 144, 92, 20);
		contentPane.add(spinner);
		
		JLabel lblN1 = new JLabel("1");
		lblN1.setBounds(170, 37, 127, 64);
		contentPane.add(lblN1);
		
		JLabel lblN2 = new JLabel(Integer.toString(nMax));
		lblN2.setBounds(247, 37, 127, 64);
		contentPane.add(lblN2);
		
		JLabel lblNewLabel_3 = new JLabel("até");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(205, 62, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblMsg = new JLabel("");
		lblMsg.setVerticalAlignment(SwingConstants.TOP);
		lblMsg.setBounds(143, 144, 220, 106);
		contentPane.add(lblMsg);
		
		JButton btnPalpite = new JButton("Palpite");
		btnPalpite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int palpite = (int) spinner.getValue();
				
				if(!(palpite==n1)) {
					lblMsg.setText("Tente Novamente");
					spinner.setValue(1);
				} else {
					lblMsg.setText("Parabéns, Você Acertou! O numero é "+n1);
				}
			}
		});
		btnPalpite.setBounds(29, 191, 89, 23);
		contentPane.add(btnPalpite);
		
		JPanel panel = new JPanel();
		panel.setBounds(143, 78, 153, -17);
		contentPane.add(panel);
				
	}
}
