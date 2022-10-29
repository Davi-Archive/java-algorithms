package com.vetor4;

import java.util.Arrays;

public class ByteSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] v = {3,6,7,8,9,1};
		 for(int valor:v) {
			 System.out.print(valor + " ");
		 }
		 
		 int p = Arrays.binarySearch(v, 9);
		 System.out.println("Encontrei o valor na posição "+ p);
	}

}
