package com.metodo1;

public class metodo1 {

	static void soma(int a, int b) {
		int s = a + b;
		System.out.println("A soma é " + s);
	}
	
	
	static int somaReturn(int a, int b) {
		int sn = a+b;
		return sn;
	}

	public static void main(String[] args) {
		System.out.println("Inicio da execução");
		soma(5,2);
		int sm = somaReturn(8,2);
		System.out.println("O valor de soma é "+sm);
	}
}
