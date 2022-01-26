/*
 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
 */


package introducao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int idadeDias = 0, idadeFinalDias = 0, idadeFinalMeses = 0, idadeFinalAnos = 0;
		Scanner scanner = new Scanner(System.in);
				
		int dia = 1;
		int mes = 30;
		int ano = 365;
		
		System.out.print("Quantos dias você tem? ");
		idadeDias = scanner.nextInt();
		
		idadeFinalDias = idadeDias/dia;
		idadeFinalMeses = idadeDias/mes;
		idadeFinalAnos = idadeDias/ano;
		
		System.out.println("Você já viveu " + idadeFinalAnos + " anos;");
		System.out.println("Você já viveu " + idadeFinalMeses + " meses;");
		System.out.println("Você já viveu " + idadeFinalDias + " dias.");

	}

}
