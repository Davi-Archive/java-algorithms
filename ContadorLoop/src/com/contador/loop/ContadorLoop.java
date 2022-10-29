package com.contador.loop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class ContadorLoop extends JFrame {
	int INICIO=5;
	int FIM=10;
	int PASSO=1;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContadorLoop frame = new ContadorLoop();
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
	public ContadorLoop() {

		setTitle("Contador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Início");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 23, 69, 21);
		contentPane.add(lblNewLabel);

		JLabel lblfimns = new JLabel("Fim");
		lblfimns.setFont(new Font("Arial", Font.PLAIN, 17));
		lblfimns.setBounds(10, 55, 69, 21);
		contentPane.add(lblfimns);

		JLabel lblPasso222 = new JLabel("Passo");
		lblPasso222.setFont(new Font("Arial", Font.PLAIN, 17));
		lblPasso222.setBounds(10, 88, 69, 21);
		contentPane.add(lblPasso222);

		JLabel lblInicio = new JLabel("1");
		lblInicio.setForeground(Color.MAGENTA);
		lblInicio.setFont(new Font("Arial", Font.BOLD, 18));
		lblInicio.setBounds(307, 23, 69, 21);
		contentPane.add(lblInicio);

		JLabel lblFim = new JLabel("10");
		lblFim.setForeground(Color.MAGENTA);
		lblFim.setFont(new Font("Arial", Font.BOLD, 18));
		lblFim.setBounds(307, 55, 69, 21);
		contentPane.add(lblFim);
		

		JList<Integer> list = new JList();
		list.setBounds(497, 243, -102, -225);
		contentPane.add(list);

		JLabel lblPasso = new JLabel("1");
		lblPasso.setForeground(Color.MAGENTA);
		lblPasso.setFont(new Font("Arial", Font.BOLD, 18));
		lblPasso.setBounds(307, 88, 69, 21);
		contentPane.add(lblPasso);

		JSlider sliderInicio = new JSlider();
		sliderInicio.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				INICIO = sliderInicio.getValue();
				lblInicio.setText(Integer.toString(INICIO));
			}
		});
		sliderInicio.setValue(1);
		sliderInicio.setMinorTickSpacing(1);
		sliderInicio.setMinimum(1);
		sliderInicio.setMaximum(5);
		sliderInicio.setBounds(97, 23, 200, 26);
		contentPane.add(sliderInicio);

		JSlider sliderFim = new JSlider();
		sliderFim.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				FIM = sliderFim.getValue();
				lblFim.setText(Integer.toString(FIM));
			}
		});
		sliderFim.setMinimum(10);
		sliderFim.setValue(10);
		sliderFim.setBounds(97, 50, 200, 26);
		contentPane.add(sliderFim);

		JSlider sliderPasso = new JSlider();
		sliderPasso.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int PASSO = sliderPasso.getValue();
				lblPasso.setText(Integer.toString(PASSO));
			}
		});
		sliderPasso.setMaximum(5);
		sliderPasso.setMinimum(1);
		sliderPasso.setValue(1);
		sliderPasso.setBounds(97, 83, 200, 26);
		contentPane.add(sliderPasso);

		JButton btnNewButton = new JButton("Contar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<Integer> lista = new DefaultListModel<Integer>();
				for (int i = INICIO; i <= FIM; i += PASSO) {
					System.out.println(i);
					
					lista.addElement(i);
										//textArea.setText(Integer.toString(i));
				}
				list.setModel(lista);
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton.setBounds(94, 153, 147, 42);
		contentPane.add(btnNewButton);
		
	}
}
