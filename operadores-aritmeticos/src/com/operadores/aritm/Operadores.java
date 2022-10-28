package com.operadores.aritm;

public class Operadores {
	public static void main(String[] args) {
		System.out.println("-------- media -----------");
		int n1 = 3;
		int n2 = 5;
		float m = (n1+n2)/2;
		
		System.out.println("A media da soma é "+ m);
		
		System.out.println("-------- incrementador ++ -----------");
		// ++ operator
		int numero = 5;
		numero++;
		System.out.println("o Numero ++ é "+ numero);
		
		// ++ order and how its done Valo 4+10 after num get's reduced
		System.out.println("-------- ++ e -- logica quando usada -----------");
		int num = 10;
		int valor = 4 + num--;
		System.out.println(valor);
		System.out.println(num);
		
		System.out.println("-------- soma operador -----------");
		//add
		int add = 5;
		int soma = 10;
		soma += add;
		
		System.out.println(soma);
		
		System.out.println("-------- soma operador -----------");
		double sqrt = Math.sqrt(100);
		System.out.println("raiz de "+sqrt);
		System.out.println("PI "+ Math.PI);
		System.out.println("exponenciação "+ Math.pow(5, 2));
		System.out.println("raiz cubica "+ Math.cbrt(27));
		
		int negativo = -10;
		double quebrado = 3.6;
		
		System.out.println("Absoluto ABS "+ Math.abs(negativo));
		System.out.println("Arredonda pra baixo "+ Math.floor(quebrado));
		System.out.println("Arredonda pra cima "+ Math.ceil(quebrado));
		System.out.println("Arredonda normal "+ Math.round(quebrado));
		System.out.println("Aleatório "+ Math.random());
		
		System.out.println("------------ Math methods -------------");
		double gerador = Math.random();
		int resp =(int) (5 + gerador * (20-5));
		System.out.println("Aleatório entre 5 e 10:  "+ resp);
	}
}
