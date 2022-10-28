package com.swing.calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;

public class TelaIdade extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIdade frame = new TelaIdade();
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
	public TelaIdade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 35, 139, 30);
		contentPane.add(lblNewLabel);
		
		JSpinner txtAN = new JSpinner();
		txtAN.setModel(new SpinnerNumberModel(1990, 1880, 2022, 0));
		txtAN.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
		txtAN.setBounds(159, 35, 88, 30);
		contentPane.add(txtAN);
		
		JLabel lblNewLabel_1 = new JLabel("Idade:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(20, 127, 67, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel txtIdade = new JLabel("0");
		txtIdade.setForeground(Color.DARK_GRAY);
		txtIdade.setHorizontalAlignment(SwingConstants.CENTER);
		txtIdade.setFont(new Font("Trebuchet MS", Font.PLAIN, 26));
		txtIdade.setBounds(97, 106, 81, 66);
		contentPane.add(txtIdade);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = (int) txtAN.getValue();
				
				Calendar date = new GregorianCalendar();
				int year = date.get(Calendar.YEAR);
				
				int res = year - n1;
				
				System.out.print(res);
				
				txtIdade.setText(Integer.toString(res));
			}
		});
		btnCalc.setFont(new Font("Wide Latin", Font.BOLD, 24));
		btnCalc.setBounds(198, 126, 226, 95);
		contentPane.add(btnCalc);
	}
}
