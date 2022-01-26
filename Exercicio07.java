/*
 *7. Um sistema de equações lineares do tipo: 
 * pode ser resolvido segundo mostrado abaixo : 
 *
 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e 
 * mostra os valores de x e y. 
 */

package introducao;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		double a,b,c,d,e,f,x,y;
		Scanner bruno = new Scanner(System.in);
		
		System.out.print("Defina A: ");
		a = bruno.nextDouble();
		
		System.out.print("Defina B: ");
		b = bruno.nextDouble();
		
		System.out.print("Defina C: ");
		c = bruno.nextDouble();
		
		System.out.print("Defina D: ");
		d = bruno.nextDouble();
		
		System.out.print("Defina E: ");
		e = bruno.nextDouble();
		
		System.out.print("Defina F: ");
		f = bruno.nextDouble();
		
		x = (c*e-b*f) / (a*e-b*d);
		y = (a*f-c*d) / (a*e-b*d);
		
		System.out.println("X é igual a : " + x);
		System.out.println("Y é igual a : " + y);

		

	
	}
}
