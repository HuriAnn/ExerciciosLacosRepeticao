package Exercicios02_LacosRepeticao;

import java.util.Scanner;

public class Q06_DoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		/* Escrever um programa que receba v�rios n�meros inteiros no teclado.
		 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero)
		 */
		
		int num, soma=0, multiplos=-2;
		
		do 
		{
			System.out.println("\n Digite um n�mero:");
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
		
		System.out.println("\n A m�dia dos n�meros multiplos de 3 �: "+soma / multiplos);
	}

}
