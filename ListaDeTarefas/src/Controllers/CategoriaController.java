package Controllers;

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
            if (buscarCategoria(categoria.getNome()) != null) {
                throw new Exception("Categoria com o mesmo nome já cadastrada.");
            }
            categorias.add(categoria);
            return "Categoria cadastrada com sucesso.";
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }

    public Categoria buscarCategoria(String nome) {
        return categorias.stream()
                .filter(p -> p.getNome().trim().equalsIgnoreCase(nome.trim()))
                .findFirst()
                .orElse(null);
    }

    public List<Categoria> listarCategorias(){
        return categorias;
    }

    public String atualizarCategoria(String nomeAtual, String nomeAtualizado) {
        Categoria categoria = buscarCategoria(nomeAtual);
        if (categoria != null) {
            if (buscarCategoria(nomeAtualizado) != null) {
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
            if (buscarCategoria(categoria.getNome()) == null) {
                throw new Exception("Categoria não encontrada.");
            }
            categorias.remove(categoria);
            return "Categoria deletada com sucesso.";
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }
}