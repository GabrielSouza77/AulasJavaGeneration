package aula05;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		double[][] notas = new double[10][4];
        double[] medias = new double[10];
        Scanner leia = new Scanner(System.in);

        for (int aluno = 0; aluno < 10; aluno++) {
            System.out.println("Digite as 4 notas do aluno " + (aluno + 1) + ":");
            for (int bimestre = 0; bimestre < 4; bimestre++) {
                System.out.print("Nota " + (bimestre + 1) + ": ");
                notas[aluno][bimestre] = leia.nextDouble();
            }
        }

        for (int aluno = 0; aluno < 10; aluno++) {
            double soma = 0;
            for (int bimestre = 0; bimestre < 4; bimestre++) {
                soma += notas[aluno][bimestre];
            }
            medias[aluno] = soma / 4;
        }

        System.out.println("\nMédias dos alunos:");
        for (int aluno = 0; aluno < 10; aluno++) {
            System.out.printf("Aluno %d: %.2f\n", (aluno + 1), medias[aluno]);
        }

        leia.close();
	}

}
