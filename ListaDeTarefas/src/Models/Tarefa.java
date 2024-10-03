package Models;


import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Tarefa {
    
    private List<Tarefa> tarefas;
    private static int proximoId = 1;
    private int id;
    private String titulo;
    private String descricao;
    private LocalDateTime criadoEm;
    private String status;

    public Tarefa(String titulo, String descricao) {
        this.id = proximoId++;
        this.titulo = titulo;
        this.descricao = descricao;
        this.criadoEm = LocalDateTime.now();
        this.status = "Não iniciada";
        this.tarefas = new LinkedList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void adicionarTarefa(Tarefa tarefa){
         tarefas.add(tarefa);
    }

    public void excluirTarefa(Tarefa tarefa){
        tarefas.remove(tarefa);
    }

    public String avançarTarefa(Tarefa tarefa){
          if(tarefa.status == "Não iniciada"){
            tarefa.status = "Concluída";
          }
          else if(tarefa.status == "Concluída"){
            return "Esta tarefa já está concluída";
          }
          return tarefa.status;
    }

    public List<Tarefa> retornarTarefas(){
        return tarefas.stream().
        toList();
    }

    @Override
    public String toString() {
        return "\nTarefa [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", criadoEm=" + criadoEm
                + ", categoria=" + ", status=" + status + "]";
    }
}
