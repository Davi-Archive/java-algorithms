package com.baskhara.delta;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SegundoGrau extends JFrame {
	static Boolean calcStart = false;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SegundoGrau frame = new SegundoGrau();
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
	public SegundoGrau() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("x² + ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(98, 51, 86, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblX = new JLabel("x + ");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblX.setBounds(196, 51, 76, 31);
		contentPane.add(lblX);
		
		JLabel lblX_1 = new JLabel("=  0");
		lblX_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblX_1.setBounds(317, 51, 76, 31);
		contentPane.add(lblX_1);
		
		JLabel lblNewLabel_1 = new JLabel("Δ =        ² - 4 .       .  ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(76, 87, 222, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblB = new JLabel("B");
		lblB.setForeground(Color.GREEN);
		lblB.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblB.setBounds(123, 87, 61, 31);
		contentPane.add(lblB);
		
		JLabel lblA = new JLabel("A");
		lblA.setForeground(Color.GREEN);
		lblA.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblA.setBounds(196, 87, 61, 31);
		contentPane.add(lblA);
		
		JLabel lblC = new JLabel("C");
		lblC.setForeground(Color.GREEN);
		lblC.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblC.setBounds(237, 87, 61, 31);
		contentPane.add(lblC);
		
		JSpinner spinnerA = new JSpinner();
		spinnerA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(spinnerA.getValue().toString());
			}
		});
		spinnerA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		spinnerA.setBounds(36, 51, 47, 31);
		contentPane.add(spinnerA);
		
		JSpinner spinnerB = new JSpinner();
		spinnerB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(spinnerB.getValue().toString());
			}
		});
		spinnerB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		spinnerB.setBounds(144, 51, 40, 31);
		contentPane.add(spinnerB);
		
		JSpinner spinnerC = new JSpinner();
		spinnerC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(spinnerC.getValue().toString());
			}
		});
		spinnerC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		spinnerC.setBounds(242, 51, 56, 31);
		contentPane.add(spinnerC);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Δ =");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_2.setBounds(76, 171, 61, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tipo =");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_2_1.setBounds(46, 213, 91, 31);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblDelta = new JLabel("0");
		lblDelta.setForeground(Color.MAGENTA);
		lblDelta.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblDelta.setBounds(142, 171, 61, 31);
		contentPane.add(lblDelta);
		
		JLabel lblTipo = new JLabel("0");
		lblTipo.setForeground(Color.MAGENTA);
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTipo.setBounds(144, 213, 280, 31);
		contentPane.add(lblTipo);
	
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = (int) spinnerA.getValue();
				int b = (int) spinnerB.getValue();
				int c = (int) spinnerC.getValue();
				
				double calc = Math.pow(b, 2) - (4 * a * c);
				
				if(calc<0) {
					lblTipo.setText("Não existem raizes reais.");
				}else {
					lblTipo.setText("Existem Raizes reais.");
				}
				
				lblDelta.setText(Double.toString(calc));
				
				
			}
		});
		btnNewButton.setBounds(132, 129, 91, 31);
		contentPane.add(btnNewButton);
	}
	

}
