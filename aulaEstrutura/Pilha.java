package aulaEstrutura;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        Scanner leia = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("1 - Adicionar livro na pilha");
            System.out.println("2 - Listar livros da pilha");
            System.out.println("3 - Retirar livro da pilha");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            while (!leia.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número.");
                leia.next();
                System.out.print("Escolha uma opção: ");
            }
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do livro: ");
                    String livro = leia.nextLine();
                    pilha.push(livro);
                    System.out.println("Livro adicionado na pilha!");
                    break;
                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        System.out.println("Livros na pilha:");
                        for (int i = pilha.size() - 1; i >= 0; i--) {
                            System.out.println(pilha.get(i));
                        }
                    }
                    break;
                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia. Nenhum livro para retirar.");
                    } else {
                        String retirado = pilha.pop();
                        System.out.println("Livro retirado: " + retirado);
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        leia.close();
    }
}
