package com.variables.types;

import java.util.Scanner;

public class VariablesType {

	public static void main(String[] args) {
		String nome = "Davi";
		// float nota = (float) 8.5;
		// float nota = 8.5f;
		// Float nota = new Float(8.5);
		// System.out.printf("A nota de %s é %f", nome, nota);

		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o Nome do aluno: ");

		String nomeTeclado = teclado.nextLine();
		System.out.print("Digite a nota do Aluno: ");
		float nota = teclado.nextFloat();
		;
		System.out.printf("A nota de %s é %f", nomeTeclado, nota);
	}
}
