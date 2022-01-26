/*
 * 8. O custo ao consumidor de um carro novo 
 * é a soma do custo de fábrica com a percentagem 
 * do distribuidor e dos impostos (aplicados ao custo de fábrica). 
 * Supondo que a percentagem do distribuidor 
 * seja de 28% e os impostos de 45%, 
 * escrever um sistema que leia o custo de fábrica de 
 * um carro e escreva o custo ao consumidor. 
 */


package introducao;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		double custoFabrica, porDistribuidor, impostos, custoFinal;
		Scanner bruno = new Scanner (System.in);
		
		porDistribuidor = 0.28;
		impostos = 0.45;
		
		System.out.print("Qual é o valor do custo de fábrica deste veículo: ");
		custoFabrica = bruno .nextDouble();
		
		porDistribuidor = custoFabrica * porDistribuidor;
		impostos = custoFabrica * impostos;
		
		custoFinal = (custoFabrica + impostos + porDistribuidor);
		
		System.out.println("O valor do custo final, que será cobrado do consumidor, é: " + custoFinal);
		
		
		
		


	}

}
