package View;

import Models.Tarefa;

import java.util.List;
import java.util.Scanner;

public class View {

    private final Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\n=== Gerenciador de Tarefas ===");
        System.out.println("1. Adicionar tarefa");
        System.out.println("2. Excluir tarefa");
        System.out.println("3. Marcar tarefa como concluída");
        System.out.println("4. Listar tarefas");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public String lerTitulo() {
        System.out.print("Digite o título da tarefa: ");
        scanner.nextLine();  
        return scanner.nextLine();
    }

    public String lerDescricao() {
        System.out.print("Digite a descrição da tarefa: ");
        return scanner.nextLine();
    }

    public int lerIdTarefa() {
        System.out.print("Digite o ID da tarefa: ");
        return scanner.nextInt();
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void mostrarTarefas(List<Tarefa> tarefas) {
        System.out.println("\n=== Lista de Tarefas ===");
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            tarefas.forEach(System.out::println);
        }
    }
}
