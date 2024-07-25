import Controllers.CategoriaController;
import Models.Categoria;

public class App {
    public static void main(String[] args) {
        CategoriaController controller = new CategoriaController();

        Categoria cat1 = new Categoria("Trabalho");
        Categoria cat2 = new Categoria("Pessoal");
        Categoria cat3 = new Categoria("Testando");

        String resultado1 = controller.cadastrarCategoria(cat1);
        System.out.println(resultado1);  

        String resultado2 = controller.cadastrarCategoria(cat2);
        System.out.println(resultado2);  

        
        String resultado3 = controller.cadastrarCategoria(cat1);
        System.out.println(resultado3);  

        
        System.out.println(controller.listarCategorias());

        System.out.println(controller.atualizarCategoria("Trabalho", "Pessoal"));
         

        System.out.println(controller.cadastrarCategoria(cat3));
       
        System.out.println(controller.listarCategorias());

        System.out.println(controller.deletarCategoria(cat3));

        System.out.println(controller.listarCategorias());

    }
}
