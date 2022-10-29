package com.vetor;

public class VatorMes {

	public static void main(String[] args) {
		String[] mes = { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro",
				"outubro", "novembro", "dezembro" };
		int[] tot = { 31, 28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31 };
		int[] totBissexto = { 31, 29, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31 };
		String[] ano = {"Normal", "Normal","Normal", "Bissexto"};

		
		for(int i=0;i<ano.length;i++) {
			for(int c=0;c<mes.length;c++) {
				if(ano[i]=="Bissexto") {
					System.out.println("O mes de "+mes[c]+" tem "+totBissexto[c]+" dias e o Ano é "+ ano[i]);
				} else {
					System.out.println("O mes de "+mes[c]+" tem "+tot[c]+" dias e o Ano é "+ ano[i]);
				}
				
			}
		}
		
	}

}
