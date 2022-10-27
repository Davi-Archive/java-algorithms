package com.sistema.hora;

import java.text.DateFormat;
import java.util.Date;

public class HoraDoSistema {
	
	public static void main(String[] args) {
		Date relogio = new Date();
		System.out.println("A hora do sistema é");
		System.out.println(DateFormat.getDateInstance().format(relogio));
		// System.out.println(relogio.toLocaleString());    // WORKS BUT DEPRECATED
	}
	
}
