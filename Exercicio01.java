/*
 * 1. Faça um sistema que leia a idade de uma pessoa 
 * expressa em anos, meses e dias e 
 * mostre-a expressa apenas em dias. 
 */


package introducao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int idadeAno = 0, idadeMes = 0, idadeDia = 0;
		
		int mes = 30;
		int ano = 365;
		
		int idadeFinal = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos anos você tem? ");
		idadeAno = scanner.nextInt();
		
		System.out.print("Quantos meses você tem? ");
		idadeMes = scanner.nextInt();
		
		System.out.print("Quantos dias você tem? ");
		idadeDia = scanner.nextInt();
		
		idadeFinal = (idadeAno * ano) + (idadeMes * mes) + (idadeDia);
		
		System.out.println("Sua idade em dias é " + idadeFinal);
		
	}

}
