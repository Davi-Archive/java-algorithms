package com.fore.each;

import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {
		int[] num = {3,50,8,7,5,8,9,10};
		Arrays.sort(num);
		for(int valor: num) {
			System.out.println(valor);
		}
	}

}
