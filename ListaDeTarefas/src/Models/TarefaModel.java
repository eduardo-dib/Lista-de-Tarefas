package Models;

import java.util.ArrayList;
import java.util.List;

public class TarefaModel {

    private final List<Tarefa> tarefas;

    public TarefaModel() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void excluirTarefa(int id) {
        Tarefa tarefaParaExcluir = encontrarTarefaPorId(id);
        if (tarefaParaExcluir != null) {
            tarefas.remove(tarefaParaExcluir);
        }
    }

    public void marcarComoConcluida(int id) {
        Tarefa tarefa = encontrarTarefaPorId(id);
        if (tarefa != null) {
            tarefa.marcarComoConcluida();
        }
    }

    public List<Tarefa> listarTarefas() {
        return new ArrayList<>(tarefas); // Retorna uma cópia para proteger o encapsulamento
    }

    private Tarefa encontrarTarefaPorId(int id) {
        return tarefas.stream()
                      .filter(tarefa -> tarefa.getId() == id)
                      .findFirst()
                      .orElse(null);
    }
}
