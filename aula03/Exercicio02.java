package aula03;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int num = leia.nextInt();
        
        String parImpar;
        String sinal;
        
        if (num % 2 == 0) {
            parImpar = "par";
        } else { 
            parImpar = "impar";
        }
        
        if (num > 0) {
            sinal = "positivo";
        } else if (num < 0) {
            sinal = "negativo";
        } else {
            sinal = "zero";
        }
        
        System.out.println("O numero e " + parImpar + " e " + sinal);
    }
}
