package Exercicios02_LacosRepeticao;

import java.util.Scanner;

public class Q02_For {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		/*Ler 10 números e ímprimir quantos são pares e quantos são ímpares*/
		
		int num;
		int par=0;
		int impar=0;
		
		for(int i=0; i<=9; i++) 
		{
			System.out.println("\n Digite um valor");
			num = leia.nextInt();
			if(num%2==0) 
			{
				par++;
			}
			else 
			{
				impar++;
			}
		}
		System.out.println("\n Total de números pares: "+par);
		System.out.println("\n Total de números ímpares: "+impar);

	}

}
