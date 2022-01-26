/*
 * 6. Construa um programa em c que, 
 * tendo como dados de entrada 
 * dois pontos quaisquer no plano, 
 * P(x1, y1) e P(x2, y2), escreva 
 * a distância entre eles. 
 * A fórmula que efetua tal cálculo é:
 */

package introducao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, d1, d2, d;
		Scanner bruno = new Scanner(System.in);
		
		System.out.print("Defina X1: ");
		x1 = bruno.nextDouble();
		
		System.out.print("Defina X2: ");
		x2 = bruno.nextDouble();
		
		System.out.print("Defina Y1: ");
		y1 = bruno.nextDouble();
		
		System.out.print("Defina Y2: ");
		y2 = bruno.nextDouble();
		
		d1 = Math.pow ((x2 - x1), 2);
		d2 = Math.pow ((y2 - y1), 2);
		
		d = Math.sqrt ((d1 + d2));
		
		System.out.println("Imprima D: " + d);
		

	}

}
