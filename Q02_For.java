package Exercicios02_LacosRepeticao;

import java.util.Scanner;

public class Q02_For {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		/*Ler 10 n�meros e �mprimir quantos s�o pares e quantos s�o �mpares*/
		
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
		System.out.println("\n Total de n�meros pares: "+par);
		System.out.println("\n Total de n�meros �mpares: "+impar);

	}

}
