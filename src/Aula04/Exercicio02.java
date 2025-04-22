package Aula04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, idadeMenor21 = 0, idadeMaior50 = 0;
		
		System.out.println("Digite uma idade (negativo para sair): ");
		idade = leia.nextInt();
		
		while (idade >= 0) {
			
			if (idade < 21) {
				idadeMenor21++;
			} else if (idade > 50) {
				idadeMaior50++;
			}
			
			System.out.println("Digite uma idade (negativo para sair): ");
			idade = leia.nextInt();
		}
		
		System.out.println("Total de pessoas com menos de 21 anos: " + idadeMenor21);
		System.out.println("Total de pessoas com mais de 50 anos: " + idadeMaior50);
		leia.close();
		
	}
}	

