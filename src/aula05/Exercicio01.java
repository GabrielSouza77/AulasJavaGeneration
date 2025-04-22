package aula05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
        int[] numeros = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite um número para procurar: ");
        int numeroProcurado = leia.nextInt();
        
        int posicao = -1;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroProcurado) {
                posicao = i; 
                break;
            }
        }
        
        if (posicao != -1) {
            System.out.println("O número está na posição: " + posicao);
        } else {
            System.out.println("Não foi encontrado!");
        }
        
        leia.close();

	}

}
