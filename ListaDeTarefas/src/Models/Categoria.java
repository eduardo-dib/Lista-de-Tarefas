package Models;
import java.time.LocalDateTime;

public class Categoria {
    private int id;
    private String nome;
    private LocalDateTime criadoEm;

    public Categoria(String nome, LocalDateTime criadoEm) {
        this.id = id;
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
        return "Categoria [id=" + id + ", nome=" + nome + ", criadoEm=" + criadoEm + "]";
    }
}
