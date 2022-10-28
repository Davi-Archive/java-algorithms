package com.condicional.nota;

import java.util.Scanner;

public class MediaNota {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira a primeira média: ");
		float n1 = teclado.nextFloat();
		System.out.println("Insita a segunda média: ");
		float n2 = teclado.nextFloat();
		float med = (n1 + n2) / 2;

		if (!(n1 > 10 || n2 > 10)) {
			if (med >= 9) {
				System.out.println("Parabéns, sua média foi Muito Boa " + med);
			}
			else if ((med >= 7) && (med < 9)) {
				System.out.println("Você foi Aprovado " + med);
			} else {
				System.out.println("Sua media foi " + med);
			}
		} else {
			System.out.println("A nota máxima é 10.");
		}

		teclado.close();
	}
}
