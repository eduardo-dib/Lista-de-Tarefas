package Controllers;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import Models.Categoria;

public class CategoriaController {
    private List<Categoria> categorias;

    public CategoriaController() {
        this.categorias = new ArrayList<>();
    }

    public String cadastrarCategoria(Categoria categoria) {
        try {
            if (buscarCategoriaPorNome(categoria.getNome()) != null) {
                throw new Exception("Categoria com o mesmo nome já cadastrada.");
            }
            categorias.add(categoria);
            return "Categoria cadastrada com sucesso.";
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }

    public Categoria buscarCategoriaPorNome(String nome){
        return categorias.stream()
                .filter(c -> c.getNome().trim().equalsIgnoreCase(nome.trim()))
                .findFirst()
                .orElse(null);
    }

    public String buscarCategoriaPorId(int id) {
        try {
            return categorias.stream()
                    .filter(c -> c.getId() == id)
                    .findFirst()
                    .orElseThrow(() -> new Exception("Categoria com ID " + id + " não encontrada."))
                    .toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public List<Categoria> buscarCategoriaPorData(LocalDateTime data) {
        LocalDate targetDate = data.toLocalDate();
        List<Categoria> categoriasEncontradas = categorias.stream()
                .filter(c -> c.getCriadoEm().toLocalDate().equals(targetDate))
                .toList();

        return categoriasEncontradas;
    }

    public List<Categoria> listarCategorias(){
        return categorias;
    }

    public String atualizarCategoria(String nomeAtual, String nomeAtualizado) throws Exception{
        Categoria categoria = buscarCategoriaPorNome(nomeAtual);
        if (categoria != null) {
            if (buscarCategoriaPorNome(nomeAtualizado) != null) {
                return "Erro: Categoria com o nome atualizado já existe.";
            }
            categoria.setNome(nomeAtualizado);
            return "Categoria atualizada com sucesso.";
        } else {
            return "Erro: Categoria não encontrada.";
        }
    }

    public String deletarCategoria(Categoria categoria) {
        try {
            if (buscarCategoriaPorNome(categoria.getNome()) == null) {
                throw new Exception("Categoria não encontrada.");
            }
            categorias.remove(categoria);
            return "Categoria deletada com sucesso.";
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }
}