package com.voto.obrigatorio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class VotoJanela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VotoJanela frame = new VotoJanela();
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
	public VotoJanela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel bebe = new JPanel();
		bebe.setBounds(56, 99, 127, 253);
		contentPane.add(bebe);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(VotoJanela.class.getResource("/com/voto/obrigatorio/image/bebe22.png")));
		bebe.add(lblNewLabel_1);

		JPanel adolescente = new JPanel();
		adolescente.setBounds(178, 49, 169, 262);
		contentPane.add(adolescente);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(VotoJanela.class.getResource("/com/voto/obrigatorio/image/16.png")));
		adolescente.add(lblNewLabel_1_1);

		JPanel idoso = new JPanel();
		idoso.setBounds(502, 11, 218, 288);
		contentPane.add(idoso);

		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon(VotoJanela.class.getResource("/com/voto/obrigatorio/image/70.png")));
		idoso.add(lblNewLabel_1_2);

		JLabel lblVoto = new JLabel("");
		lblVoto.setVerticalAlignment(SwingConstants.TOP);
		lblVoto.setFont(new Font("Roboto Lt", Font.BOLD, 14));
		lblVoto.setEnabled(false);
		lblVoto.setHorizontalAlignment(SwingConstants.LEFT);
		lblVoto.setBounds(10, 11, 458, 32);
		contentPane.add(lblVoto);

		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 150, 1));
		spinner.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		spinner.setBounds(389, 85, 79, 51);
		contentPane.add(spinner);

		JPanel adulto = new JPanel();
		adulto.setBounds(304, 145, 238, 90);
		contentPane.add(adulto);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VotoJanela.class.getResource("/com/voto/obrigatorio/image/adulto_obri.png")));
		adulto.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("Qual sua idade?");
		lblNewLabel_2.setBounds(389, 60, 76, 14);
		contentPane.add(lblNewLabel_2);

		
		bebe.setVisible(false);
		idoso.setVisible(false);
		adulto.setVisible(false);
		adolescente.setVisible(false);
		
		JButton btnNewButton = new JButton("Voto é obrigatorio?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idade = (int) spinner.getValue();

				if (idade < 16) {
					bebe.setVisible(true);
					idoso.setVisible(false);
					adulto.setVisible(false);
					adolescente.setVisible(false);
					lblVoto.setText("Voto É PROIBIDO, NÃO VOTE!!!!.");
				} else if ((idade >= 16) && (idade < 18)) {
					bebe.setVisible(false);
					idoso.setVisible(false);
					adulto.setVisible(false);
					adolescente.setVisible(true);
					lblVoto.setText("Voto é Opcional.");
				} else if ((idade >= 18) && (idade < 60)) {
					bebe.setVisible(false);
					idoso.setVisible(false);
					adulto.setVisible(true);
					adolescente.setVisible(false);
					lblVoto.setText("Voto é OBRIGATORIO.");
				} else {
					bebe.setVisible(false);
					idoso.setVisible(true);
					adulto.setVisible(false);
					adolescente.setVisible(false);
					lblVoto.setText("Voto é Opcional.");
				}

			}

		});
		btnNewButton.setBounds(357, 228, 127, 71);
		contentPane.add(btnNewButton);
	}
}
