/*
 * 4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:
 */


package introducao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		double A = 0;
		double B = 0;
		double C = 0;
		double D = 0;
		double R = 0;
		double S = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Defina A: ");
		A = scanner.nextInt();
		
		System.out.print("Defina B: ");
		B = scanner.nextInt();
		
		System.out.print("Defina C: ");
		C = scanner.nextInt();
		
		R = Math.pow((A + B), 2);
		
		S = Math.pow((B + C), 2);
		
		D = (R + S) / 2;
		
		System.out.println("D é igual a: " + D);
		
		
		
		
		
		

	}

}
