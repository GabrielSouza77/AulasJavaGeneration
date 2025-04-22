package Aula04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, somaPositivo = 0;
		
		System.out.println("Digite um numero: ");
		num = leia.nextInt();
		
		do {
			
			if (num > 0) {
				somaPositivo += num;
			}
			
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
		} while (num != 0 );
		
		System.out.println("A soma dos numeros positivos e: " + somaPositivo);
		leia.close();

	}

}
