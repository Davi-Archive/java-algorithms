package com.tela.fator;

public class Calculos {

	public static int fatorar(int a) {
		int multiplicacao = 1; // multiply by zero is zero, needs to start at 1
		for (int i = 1; i <= a; i++) {
			multiplicacao *= i;
		}
		return multiplicacao;
	}

	public static String criarFatorar(int value) {
		String concat = "";
		for (int i = 1; i <= value; i++) {
			if(i==value) {
				concat += Integer.toString(i); // last multiply symbol deleted
			}else {
				concat += Integer.toString(i) + " x ";
			}
			
		}
		return concat;
	}
}
