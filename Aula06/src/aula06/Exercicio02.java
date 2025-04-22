package aula06;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Exercicio02 {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<>();
        Random random = new Random();

        while (numeros.size() < 10) {
            int numeroAleatorio = random.nextInt(20) + 1;
            numeros.add(numeroAleatorio);
        }
       
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número inteiro para buscar: ");
        int numeroDigitado = leia.nextInt();

        if (numeros.contains(numeroDigitado)) {
            System.out.println("Número " + numeroDigitado + " foi encontrado!");
        } else {
            System.out.println("O número " + numeroDigitado + " não foi encontrado!");
        }

        leia.close();
	}

}
