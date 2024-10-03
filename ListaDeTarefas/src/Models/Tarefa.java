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

    @Override
    public String toString() {
        return "\nTarefa [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", criadoEm=" + criadoEm
                + ", categoria=" + ", status=" + status + "]";
    }
}
