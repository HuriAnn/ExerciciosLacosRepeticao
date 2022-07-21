package Exercicios02_LacosRepeticao;

import java.util.Scanner;

public class Q05_DoWhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		/* Crie um programa que leia um número do teclado até que encontre um número igual a zero.
		 * No final, mostre a soma dos números digitados
		 */

		int num, somaTotal=0;
		
		do 
		{
			System.out.println("\n Digite um valor:");
			num = leia.nextInt();
			somaTotal+=num;
			System.out.println("\n Digite 0 para sair:");
		}
		
		while(num!=0);
		
		System.out.println("\n A soma total dos números digitados é de: "+somaTotal);
	}

}
