/*
 * 3. Faça um sistema que leia o tempo de duração de 
 * um evento em uma fábrica expressa em segundos e 
 * mostre-o expresso em horas, minutos e segundos. 
 */


package introducao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int tempoSegundos = 0, tempoFinalMinutos = 0, tempoFinalHoras = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quanto segundos durou o evento? ");
		tempoSegundos = scanner.nextInt();
		
		tempoFinalMinutos = tempoSegundos / 60;
		tempoFinalHoras = (tempoSegundos / 60) / 60;
		
		System.out.println("Um evento de " + tempoSegundos + " segundos, representa " + tempoFinalHoras + " horas, ou " + tempoFinalMinutos + " minutos.");
	}

}
