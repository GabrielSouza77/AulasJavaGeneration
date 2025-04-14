package aula02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("#,##0.00");
        df.getDecimalFormatSymbols().setGroupingSeparator('.');
        df.getDecimalFormatSymbols().setDecimalSeparator(',');
		
		System.out.println("Digite o valor do salario: ");
		float salariof = leia.nextFloat();
		
		System.out.println("Digite o valor do abono: ");
		float abonof = leia.nextFloat();
		
		float salarioTotal = salariof + abonof;
        
        System.out.println("\nSalario: R$" + df.format(salariof));
        System.out.println("\nAbono: R$" + df.format(abonof));
        System.out.println("\nSalario total: R$" + df.format(salarioTotal));
		
		

	}

}
