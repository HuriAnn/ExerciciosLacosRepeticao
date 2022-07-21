package Exercicios02_LacosRepeticao;

import java.util.Scanner;

public class Q01_For {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		/*Informar todos os números de 1000 a 1999 que quando dividido por 11 obtemos resto = 5*/
		
		int num;
		
		for(num=1000; num<=1999; num++) 
		{
			if(num%11 ==5)
				System.out.println(num);
		}


	}

}
