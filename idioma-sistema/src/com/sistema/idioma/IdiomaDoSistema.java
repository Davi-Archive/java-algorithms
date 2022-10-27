package com.sistema.idioma;

import java.util.Locale;

public class IdiomaDoSistema {
	public static void main(String[] args) {
		
		String locale = System.getProperty("user.language");
		Locale local2 = Locale.getDefault();
		String country = System.getProperty("user.country");
		
		System.out.println(locale);
		System.out.println(local2);
		System.out.println(country);
	}
}
