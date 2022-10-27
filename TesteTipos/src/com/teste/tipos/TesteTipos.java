package com.teste.tipos;

public class TesteTipos {
	public static void main(String[] args) {
		
		//Int to String
		int idade = 30;
		String valor = Integer.toString(idade);
		System.out.println(valor);
		
		
		//String to int
		String valor1 = "30";
		int idade1 = Integer.parseInt(valor1);
		System.out.println(idade1);
		
		//int to Float
		int num = 10;
		float quebrado = num;
		System.out.printf("%.3f",quebrado);  // "%.3f" show 3 houses after decimal
		
	}
}
