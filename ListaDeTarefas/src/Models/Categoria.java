package Models;
import java.time.LocalDateTime;

public class Categoria {
    private static int proximoId = 1;
    private int id;
    private String nome;
    private LocalDateTime criadoEm;

    public Categoria(String nome) {
        this.id = proximoId++;
        this.nome = nome;
        this.criadoEm = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    @Override
    public String toString() {
        return "\nCategoria [id=" + id + ", nome=" + nome + ", criadoEm=" + criadoEm + "]";
    }
}
