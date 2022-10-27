package com.example.helloworld;

import javax.swing.JOptionPane;

public class SwingIntoHelloWorld {
	
	
	//static can run before main, come after java 1.7
	static {
		JOptionPane.showInputDialog("Hello");
	}
	
	
	public static void main(String[] args) {
		//Janela
		//JOptionPane.showInputDialog("HelloWorld");
	}
}
