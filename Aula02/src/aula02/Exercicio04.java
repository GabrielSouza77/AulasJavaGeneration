package aula02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		
		System.out.println("Digite o numero 1: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o numero 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o numero 3: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o numero 4: ");
		n4 = leia.nextFloat();
		
		float diff = (n1 * n2) - (n3 * n4);
		
		System.out.println("\nDiferença " + (diff > 0.0 ? "positiva de: " : "negativa de: ") + diff);

	}

}
