package aula03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, operacao, resultado;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = leia.nextInt();
		
		System.out.println("Digite a operacao(de 1 a 4): ");
		operacao = leia.nextInt();
		
		
		switch (operacao) {
        case 1:
        	resultado = num1 + num2;
        	System.out.println("Resultado da adicao: " + resultado);
            break;
        case 2:
        	resultado = num1 - num2;
        	System.out.println("Resultado da subtracao: " + resultado);
            break;
        case 3:
        	resultado = num1 * num2;
        	System.out.println("Resultado da multiplicacao: " + resultado);
            break;
        case 4:
        	resultado = num1 / num2;
        	System.out.println("Resultado da divisao: " + resultado);
            break;

	}}

}
