package Exercicios02_LacosRepeticao;

import java.util.Scanner;

public class Q04_While {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		/* Uma empresa desenvolveu uma pesquisa para saber as características 
		 * psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas era 
		 * perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se 
		 * a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		 * o número de pessoas calmas; 
		 * o número de mulheres nervosas; 
		 * o número de homens agressivos; 
		 * o número de outros calmos;
		 * o número de pessoas nervosas com mais de 40 anos; 
		 * o número de pessoas calmas com menos de 18 anos.
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
				System.out.println("\n Você digitou um valor inválido");
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
					System.out.println("Opção inválida");
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
					System.out.println("Opção inválida");
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
		
		System.out.println("\n O número de pessoas calmas: "+calma);
		System.out.println("\n O número de mulheres nervosas: "+somaFemNerv);
		System.out.println("\n O número de homens agressivos: "+somaMasAgress);
		System.out.println("\n O número de outros calmos "+somaOutrosCalmos);
		System.out.println("\n O número de pessoas nervosas com mais de 40 anos: "+somaNervMais40);
		System.out.println("\n O número de pessoas calmas com menos de 18 anos "+somaCalmasMenos18);
		

	}

}
