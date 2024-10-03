package Models;

import java.time.LocalDateTime;

public class Tarefa {

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
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public String getStatus() {
        return status;
    }

    public void marcarComoConcluida() {
        this.status = "Concluída";
    }

    @Override
    public String toString() {
        return "\nTarefa [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", criadoEm=" + criadoEm + ", status=" + status + "]";
    }
}
