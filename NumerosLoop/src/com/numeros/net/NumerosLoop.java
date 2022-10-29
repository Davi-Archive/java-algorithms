package com.numeros.net;

import java.util.Scanner;

public class NumerosLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, s = 0;
		String resp;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Digite um Número: ");
			n = teclado.nextInt();
			s += n;
			System.out.println("Quer continuar [S/N] ");
			resp = teclado.next();
		} while (resp.equals("S")||resp.equals("s"));
		System.out.println("A Soma dos valores é " + s);

	}

}
