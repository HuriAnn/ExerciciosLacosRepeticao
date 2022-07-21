package Exercicios02_LacosRepeticao;

import java.util.Scanner;

public class Q04_While {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		/* Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas 
		 * psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era 
		 * perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es (1, se 
		 * a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		 * o n�mero de pessoas calmas; 
		 * o n�mero de mulheres nervosas; 
		 * o n�mero de homens agressivos; 
		 * o n�mero de outros calmos;
		 * o n�mero de pessoas nervosas com mais de 40 anos; 
		 * o n�mero de pessoas calmas com menos de 18 anos.
		 */
				
		int idade;
		int fem=0, mas=0, outros=0;
		int calma=0, nerv=0, agress=0;
		int somaFemNerv=0, somaMasAgress=0, somaOutrosCalmos=0;
		int somaNervMais40=0, somaCalmasMenos18=0;
		int totalPessoas=0, totalTemp=0, totalSexo=0;
		
		while(totalPessoas<=150) {
			System.out.println("\n Digite a idade:");
			idade = leia.nextInt();
			if(idade>=0 && idade<=100) {
				totalPessoas++;
			}
			else {
				System.out.println("\n Voc� digitou um valor inv�lido");
				System.out.println("\n Digite a idade:");
				idade = leia.nextInt();
			}
			
		while(totalSexo ==0) {
			System.out.println("\n Informe o sexo");
			System.out.println("\n 01 - Feminino");
			System.out.println("\n 02 - Masculino");
			System.out.println("\n 03 - Outros");
			totalSexo = leia.nextInt();
			switch(totalSexo) {
				case 1:
					fem++;
				case 2:
					mas++;
				case 3:
					outros++;
				break;
				default:
					System.out.println("Op��o inv�lida");
					totalSexo = 0;
				break;			
				}	
			
			}
		while(totalTemp == 0) {
			System.out.println("\n Informe o temperamento");
			System.out.println("\n 01 - Calmo (a)");
			System.out.println("\n 02 - Nervoso (a)");
			System.out.println("\n 03 - Agressivo (a)");
			totalTemp = leia.nextInt();
			
			switch(totalTemp) {
				case 1:
					calma++;
				case 2:
					nerv++;
				case 3:
					agress++;
					break;
				default:
					System.out.println("Op��o inv�lida");
					totalTemp = 0;
					break;			
				}	
			}
		if(totalSexo == 1 && totalSexo == 2) 
		{
			somaFemNerv++;
		}
		else if(totalSexo == 2 && totalSexo == 3) 
		{
			somaMasAgress++;
		}
		else if(totalTemp == 3 && totalTemp == 1) 
		{
			somaOutrosCalmos++;
		}
		else if(totalTemp == 2 && idade > 40) 
		{
			somaNervMais40++;
		}
		else if(totalTemp == 1 && idade < 18) 
		{
			somaCalmasMenos18++;
		}
		
		idade = 0;
		totalSexo = 0;
		totalTemp = 0;
		}
		
		System.out.println("\n O n�mero de pessoas calmas: "+calma);
		System.out.println("\n O n�mero de mulheres nervosas: "+somaFemNerv);
		System.out.println("\n O n�mero de homens agressivos: "+somaMasAgress);
		System.out.println("\n O n�mero de outros calmos "+somaOutrosCalmos);
		System.out.println("\n O n�mero de pessoas nervosas com mais de 40 anos: "+somaNervMais40);
		System.out.println("\n O n�mero de pessoas calmas com menos de 18 anos "+somaCalmasMenos18);
		

	}

}
