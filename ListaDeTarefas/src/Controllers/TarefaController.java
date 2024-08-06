package Controllers;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Models.*;
public class TarefaController {
    private List<Tarefa> tarefas;

    

    public TarefaController() {
        this.tarefas = new ArrayList<>();
    }

    public String adicionarTarefa(Tarefa tarefa){
        try {
            if (buscarTarefa(tarefa.getTitulo()) != null) {
                throw new Exception("Tarefa com o mesmo nome já cadastrada.");
            }
            tarefas.add(tarefa);
            return "Tarefa cadastrada com sucesso.";
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }

    public String atualizarTarefaNome(String nomeAtual, String nomeAtualizado) {
        Tarefa tarefa = buscarTarefa(nomeAtual);
        if (tarefa != null) {
            if (buscarTarefa(nomeAtualizado) != null) {
                return "Erro: Tarefa com o nome atualizado já existe.";
            }
            tarefa.setTitulo(nomeAtualizado);
            return "Tarefa atualizada com sucesso.";
        } else {
            return "Erro: Tarefa não encontrada.";
        }
    }

    public String atualizarTarefaDescricao(String nome, String descricaoAtual, String descricaoAtualizada) {
        Tarefa tarefa = buscarTarefa(nome);
        if (tarefa != null) {
            tarefa.setDescricao(descricaoAtualizada);
            return "Tarefa atualizada com sucesso.";
        } else {
            return "Erro: Tarefa não encontrada.";
        }
    }

    public String atualizarTarefaStatus(String nomeAtual) {
        Tarefa tarefa = buscarTarefa(nomeAtual);
        if (tarefa != null && tarefa.getStatus() == "Não iniciada") {
            tarefa.setStatus("Em andamento");
        }
        else if(tarefa != null && tarefa.getStatus() == "Em andamento"){
            tarefa.setStatus("Concluída");
        } 
        else {
            return "Erro: Tarefa não encontrada.";
        }
        return "Tarefa alterada com sucesso";
    }

    public Tarefa buscarTarefa(String titulo){
       return tarefas.stream().
       filter(c -> c.getTitulo().trim().equalsIgnoreCase(titulo.trim())).
       findFirst().
       orElse(null);
    }

    public Tarefa buscarTarefaPorId(int id){
        return tarefas.stream().
        filter(c -> c.getId() == id).
        findFirst().
        orElse(null);
     }

    public List<Tarefa> buscarTarefasPorPalavraChave(String palavraChave) {
    return tarefas.stream()
        .filter(t -> t.getDescricao().contains(palavraChave))
        .collect(Collectors.toList());
    }

    public List<Tarefa> buscarTarefaPorData(LocalDateTime data) {
        LocalDate targetDate = data.toLocalDate();
        List<Tarefa> tarefasEncontradas = tarefas.stream()
                .filter(c -> c.getCriadoEm().toLocalDate().equals(targetDate))
                .toList();

        return tarefasEncontradas;
    }

    public List<Tarefa> buscarTarefasPorCategoria(Categoria categoria) {
        return tarefas.stream()
            .filter(t -> t.getCategoria().equals(categoria))
            .collect(Collectors.toList());
        }
    public List<Tarefa> buscarTarefasPorStatus(String status) {
        return tarefas.stream()
            .filter(t -> t.getStatus().trim().equalsIgnoreCase(status))
            .collect(Collectors.toList());
        }
 

    public List<Tarefa> listaTarefas(){
        return tarefas;
    }

    public String deletarTarefa(Tarefa tarefa) {
        try {
            if (buscarTarefa(tarefa.getTitulo()) == null) {
                throw new Exception("Tarefa não encontrada.");
            }
            tarefas.remove(tarefa);
            return "Tarefa deletada com sucesso.";
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }
}
