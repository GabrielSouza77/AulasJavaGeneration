package aulaEstrutura;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        Scanner leia = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Chamar cliente");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do cliente: ");
                    String nome = leia.nextLine();
                    fila.add(nome);
                    System.out.println("Cliente adicionado!");
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Fila vazia.");
                    } else {
                        System.out.println("Clientes na fila:");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("Fila vazia.");
                    } else {
                        String chamado = fila.poll();
                        System.out.println("Chamando: " + chamado);
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
