package aula02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, notaFinal;
		
		System.out.println("Digite a nota 1: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite a nota 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite a nota 3: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite a nota 4: ");
		n4 = leia.nextFloat();
		
		notaFinal = (n1 + n2 + n3 + n4) / 4;
		
		System.out.printf("A nota final é: %.1f", notaFinal);
        System.out.println("\nSituação: " + (notaFinal > 6.0 ? "Aprovado" : "Reprovado"));

	}

}
