package aula06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

        ArrayList<String> cores = new ArrayList<>();


        Scanner leia = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a " + i + "ª cor: ");
            String cor = leia.nextLine();
            cores.add(cor);
        }

        System.out.println("\nCores digitadas:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        Collections.sort(cores);

        System.out.println("\nCores em ordem crescente:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        leia.close();

	}

}
