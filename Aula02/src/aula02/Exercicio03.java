package aula02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("#,##0.00");
        df.getDecimalFormatSymbols().setGroupingSeparator('.');
        df.getDecimalFormatSymbols().setDecimalSeparator(',');
		
		float salarioBruto, addNoturno, horaExtra, desconto, salarioLiq;
		
		System.out.println("Digite o valor do salario bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o valor do adicional noturno: ");
		addNoturno = leia.nextFloat();
		
		System.out.println("Digite a quantidade de horas extras: ");
		horaExtra = leia.nextFloat();
		
		System.out.println("Digite o valor dos descontos: ");
		desconto = leia.nextFloat();
		
		salarioLiq = (salarioBruto + addNoturno + (horaExtra * 5)) - desconto;
		
		System.out.println("\nSalario bruto: R$" + df.format(salarioBruto));
        System.out.println("\nAdicional noturno: R$" + df.format(addNoturno));
        System.out.println("\nHora extra: R$" + df.format(horaExtra));
        System.out.println("\nDesconto: R$" + df.format(desconto));
		
		System.out.println("\nO valor do salario liquido: R$" +  df.format(salarioLiq));
		
	}

}
