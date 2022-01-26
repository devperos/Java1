/*
 * 5. Faça um sistema que leia as 3 notas de 
 * um aluno e calcule a média final deste aluno. 
 * Considerar que a média é ponderada e que 
 * o peso das notas é: 2,3 e 5, respectivamente. 
 */

package introducao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		double N1, N2, N3, P1, P2, P3, MP;
		
		P1 = 2;
		P2 = 3;
		P3 = 5;
		
		Scanner bruno = new Scanner (System.in);
		
		System.out.print("Nota da N1: ");
		N1 = bruno.nextInt();
		
		System.out.print("Nota da N2: ");
		N2 = bruno.nextInt();
		
		System.out.print("Nota da N3: ");
		N3 = bruno.nextInt();
		
		MP = ((N1*P1) + (N2*P2) + (N3*P3)) / (P1 + P2 + P3);
		
		System.out.print("A média ponderada é: " + MP);
		
		

		

	}

}
