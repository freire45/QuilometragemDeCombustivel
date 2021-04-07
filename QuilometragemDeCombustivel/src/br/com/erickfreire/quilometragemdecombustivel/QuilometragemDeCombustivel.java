package br.com.erickfreire.quilometragemdecombustivel;

import java.util.Scanner;

/**
 * Programa em Java que calcula a quilometragem de combustivel
 * @author Erick Freire
 * @version 1 - Criado em 07-04-2021 as 17:49
 */

public class QuilometragemDeCombustivel {
	public static void main(String[] args) {
		int quilometragem;
		int totalQui = 0;
		int litrosGasolina;
		int totalLitr = 0;
		double soma;
		int contador;
		int totalViagens = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calculador de gastos de gasolina por viagem");
		
		System.out.print("Digite 1 para inserir uma viagem ou -1 para sair");
		contador = entrada.nextInt();
		
		while(contador != -1) {
			
			System.out.print("Digite os Quilometros dirigidos: ");
			quilometragem = entrada.nextInt();
			
			totalQui += quilometragem;
			
			System.out.print("Digite a quantidade de litros de gasolina: ");
			litrosGasolina = entrada.nextInt();
			
			totalLitr += litrosGasolina;
			
			totalViagens++;
			
			System.out.print("Digite 1 para inserir uma viagem ou -1 para sair");
			contador = entrada.nextInt();
			
		}
		
		soma = (double) totalQui / totalLitr;
		
		System.out.printf("%n%nTotal de Viagens: %d%n"
				        + "Total de Quilometros Feitos: %d%n"
				        + "Total de Litros De Gasolina: %d%n"
				        + "Média Gasta de Litros por Quilometro dirigido: %.2f litros%n", totalViagens, totalQui, totalLitr, soma);
		
		
		
		
	}

}
