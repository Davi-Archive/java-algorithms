package com.calculo.fatorial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class CalculoFatorial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoFatorial frame = new CalculoFatorial();
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
	public CalculoFatorial() {
		setTitle("Cálculo Fatorial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 305, 147);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("! =");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 20));
		lblNewLabel.setBounds(71, 44, 21, 24);
		contentPane.add(lblNewLabel);

		JLabel lblRes = new JLabel("1");
		lblRes.setForeground(Color.RED);
		lblRes.setFont(new Font("Roboto", Font.PLAIN, 25));
		lblRes.setBounds(98, 45, 181, 31);
		contentPane.add(lblRes);

		JSpinner spinner = new JSpinner();
		spinner.addChangeListener(new ChangeListener() {
			int contagem = 1;
			int c = 1;
			public void stateChanged(ChangeEvent e) {
				int num = (int) spinner.getValue();
							while (c <= num) {
					contagem *= c;
					c++;
					System.out.println(contagem);
				}
				
				lblRes.setText(Integer.toString(contagem));
			}
		});
		spinner.setFont(new Font("Roboto", Font.PLAIN, 20));
		spinner.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spinner.setBounds(10, 45, 57, 30);
		contentPane.add(spinner);
	}

}
