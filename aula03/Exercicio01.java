package aula03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o numero A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o numero B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o numero B:");
		c = leia.nextInt();
		
		
		System.out.println("A soma de A + B " + (a + b > c ? "é maior que C " : "é menor que C"));
		

	}

}
