package view;

import controller.GestorContactos;
import java.util.Scanner;

/**
 * Gere a interação com o utilizador via consola.
 */
public class Consola {
    private GestorContactos gestor;
    private Scanner scanner;

    public Consola(GestorContactos gestor) {
        this.gestor = gestor;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcao = 0;
        do {
            exibirMenu();
            try {
                opcao = Integer.parseInt(scanner.nextLine());
                processarOpcao(opcao);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduza um número válido.");
            }
        } while (opcao != 6);
    }

    private void exibirMenu() {
        System.out.println("\n1 Listar Contactos");
        System.out.println("2 Acrescentar Contacto");
        System.out.println("3 Remover Contacto");
        System.out.println("4 Encontrar Contactos");
        System.out.println("5 Estatisticas");
        System.out.println("6 Sair");
        System.out.print("\nEscolha uma opção entre [1,6]: ");
    }

    private void processarOpcao(int opcao) {
        switch (opcao) {
            case 1: listar(); break;
            case 2: acrescentar(); break;
            case 3: remover(); break;
            case 4: encontrar(); break;
            case 5: estatisticas(); break;
            case 6: System.out.println("A sair..."); break;
            default: System.out.println("Opção inválida.");
        }
    }

    // TODO: Implementar métodos de interação detalhados
    private void listar() {}
    private void acrescentar() {}
    private void remover() {}
    private void encontrar() {}
    private void estatisticas() {}
}
