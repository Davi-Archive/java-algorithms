package com.operadores.logicos;

public class OperadoresLogicos {
	public static void main(String[] args) {
		int x,y,z;
		x=4;
		y=7;
		z=12;
		boolean r;
		
		
		System.out.println(r=(x<y && y<z)? true:false);
		
		System.out.println(r=(x<y && y==z)? true:false);
		
		System.out.println(r=(x<y || y==z)? true:false);
		
		System.out.println(r=(x<y ^ y<z)? true:false);
	}
}
