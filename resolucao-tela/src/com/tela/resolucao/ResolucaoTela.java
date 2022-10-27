package com.tela.resolucao;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
	public static void main(String[] args) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		
		double largura = screenSize.getWidth();
		double altura = screenSize.getHeight();
		
		System.out.println(screenSize);
		System.out.println(largura);
		System.out.println(altura);
	}
}
