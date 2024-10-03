package Presenter;

import Models.Tarefa;
import Models.TarefaModel;
import View.View;

public class Presenter {

    private final View view;
    private final TarefaModel model;

    public Presenter(View view, TarefaModel model) {
        this.view = view;
        this.model = model;
    }

    public void adicionarTarefa() {
        String titulo = view.lerTitulo();
        String descricao = view.lerDescricao();
        Tarefa novaTarefa = new Tarefa(titulo, descricao);
        model.adicionarTarefa(novaTarefa);
        view.exibirMensagem("Tarefa adicionada com sucesso.");
        listarTarefas();
    }

    public void excluirTarefa() {
        int id = view.lerIdTarefa();
        model.excluirTarefa(id);
        view.exibirMensagem("Tarefa excluída com sucesso.");
        listarTarefas();
    }

    public void marcarComoConcluida() {
        int id = view.lerIdTarefa();
        model.marcarComoConcluida(id);
        view.exibirMensagem("Tarefa marcada como concluída.");
        listarTarefas();
    }

    public void listarTarefas() {
        view.mostrarTarefas(model.listarTarefas());
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            int opcao = view.mostrarMenu();
            switch (opcao) {
                case 1 -> adicionarTarefa();
                case 2 -> excluirTarefa();
                case 3 -> marcarComoConcluida();
                case 4 -> listarTarefas();
                case 5 -> {
                    continuar = false;
                    view.exibirMensagem("Saindo do sistema...");
                }
                default -> view.exibirMensagem("Opção inválida.");
            }
        }
    }
}
