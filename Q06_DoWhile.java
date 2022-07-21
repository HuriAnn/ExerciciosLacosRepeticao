package Exercicios02_LacosRepeticao;

import java.util.Scanner;

public class Q06_DoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		/* Escrever um programa que receba vários números inteiros no teclado.
		 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero)
		 */
		
		int num, soma=0, multiplos=-2;
		
		do 
		{
			System.out.println("\n Digite um número:");
			num = leia.nextInt();
			if(num %3==0) 
			{
				soma+=num;
				multiplos++;
			}
			System.out.println("\n Digite 0 para sair:");
		}
		while(num!=0);
		soma++;
		multiplos++;
		
		System.out.println("\n A média dos números multiplos de 3 é: "+soma / multiplos);
	}

}
