package Exercicios02_LacosRepeticao;

import java.util.Scanner;

public class Q03_While {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		/* Solicitar a idade de várias pessoas e imprimir:
		 * Total de pessoas com menos de 21 anos.
		 * Total de pessoas com mais de 50 anos.
		 * O programa termina quando idade for =-99
		 */
		
		int idade, menores21=0, maiores50=0;
		
		System.out.println("\n Digite a idade:");
		
		idade = leia.nextInt();
		
		while(idade!=-99) 
		{
			if(idade<21) 
			{
				menores21++;
			}
			if(idade>50) 
			{
				maiores50++;
			}
			
			System.out.println("\n Digite -99 para sair:");
			System.out.println("\n Digite outra idade:");
			idade = leia.nextInt();
		}

		System.out.println("\n Total de pessoa(s) com idade menor(es) que 21 anos: "+menores21);
		System.out.println("\n Total de pessoa(s) com idade menor(es) que 50 anos: "+maiores50);
	}

}
