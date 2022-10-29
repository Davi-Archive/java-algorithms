package com.loop.tela;

import javax.swing.JOptionPane;

public class TelaLoopNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int soma = 0;
		int totalValores = 0;
		int totalPares = 0;
		int totalImpares = 0;
		int maisQueCem = 0;
		double media = 0;

		do {
			n = Integer.parseInt(JOptionPane.showInputDialog(null, 
					"<html>Informe um Número<br /> <em>(valor 0 interrompe)</em></html>"));
			soma += n;
			totalValores++;
			
			if (n % 2 == 0) {
				totalPares++;
			}
			if (n % 2 == 1) {
				totalImpares++;
			}
			if(n>100) {
				maisQueCem++;
			}
			

		} while (n != 0);
		
		media=soma/totalValores;
		String[] resposta = { "Resultado", "_________________________", " ", "Resultado: " + soma, "",
				"Total de Valores: " + totalValores, "Total de Pares: " + totalPares,
				"Total de Impares: " + totalImpares, "Acima de 100: " + maisQueCem, "Média dos Valores: " + media };
		JOptionPane.showMessageDialog(null, resposta);
	}

}
