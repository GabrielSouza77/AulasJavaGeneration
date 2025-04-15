package aula03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nomeString;
		int codCargo;
		float salariof;
		
		System.out.println("Digite o nome do funcionario: ");
		nomeString = leia.nextLine();
		
		System.out.println("Digite o código do cargo: ");
		codCargo = leia.nextInt();
		
		System.out.println("Digite o salario atual: ");
		salariof = leia.nextFloat();
		
		switch (codCargo) {
        case 1:
        	salariof += salariof * 0.1;
        	System.out.println("\nNome do funcionario: " + nomeString);
        	System.out.println("Codigo do funcionario: " + codCargo);
            System.out.printf("Novo salario: $%.2f", salariof);
            break;
        case 2:
        	salariof += salariof * 0.07;
        	System.out.println("\nNome do funcionario: " + nomeString);
        	System.out.println("Codigo do funcionario: " + codCargo);
            System.out.printf("Novo salario: $%.2f", salariof);
            break;
        case 3:
        	salariof += salariof * 0.09;
        	System.out.println("\nNome do funcionario: " + nomeString);
        	System.out.println("Codigo do funcionario: " + codCargo);
            System.out.printf("Novo salario: $%.2f", salariof);
            break;
        case 4:
        	salariof += salariof * 0.06;
        	System.out.println("\nNome do funcionario: " + nomeString);
        	System.out.println("Codigo do funcionario: " + codCargo);
            System.out.printf("Novo salario: $%.2f", salariof);
            break;
        case 5:
        	salariof += salariof * 0.05;
        	System.out.println("\nNome do funcionario: " + nomeString);
        	System.out.println("Codigo do funcionario: " + codCargo);
            System.out.printf("Novo salario: $%.2f", salariof);
            break;
        case 6:
        	salariof += salariof * 0.08;
        	System.out.println("\nNome do funcionario: " + nomeString);
        	System.out.println("Codigo do funcionario: " + codCargo);
            System.out.printf("Novo salario: $%.2f", salariof);
            break;
        default:
            System.out.println("Codigo invalido!");
    }

	}

}
