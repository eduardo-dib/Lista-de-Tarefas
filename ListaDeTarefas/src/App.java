import Controllers.*;
import Models.*;

public class App {
    public static void main(String[] args) {
        CategoriaController controller = new CategoriaController();
        TarefaController tarefaController = new TarefaController();


        

        Categoria cat1 = new Categoria("Trabalho");
        Categoria cat2 = new Categoria("Pessoal");
        Categoria cat3 = new Categoria("Trabalho");

        String resultado1 = controller.cadastrarCategoria(cat1);
        System.out.println(resultado1);  

        String resultado2 = controller.cadastrarCategoria(cat2);
        System.out.println(resultado2);  

        Tarefa tar1 = new Tarefa("Passear com o cachorro","brah",  cat1);
        Tarefa tar2 = new Tarefa("Aprender Guitarra","brah",  cat2);


        
        String resultado3 = controller.cadastrarCategoria(cat1);
        System.out.println(resultado3);  

        
        System.out.println(controller.listarCategorias());

        System.out.println(controller.atualizarCategoria("Trabalho", "Pessoal"));
         

        System.out.println(controller.cadastrarCategoria(cat3));
       
        System.out.println(controller.listarCategorias());

        System.out.println(controller.deletarCategoria(cat3));

        System.out.println(controller.listarCategorias());

        System.out.println(tarefaController.adicionarTarefa(tar1));

        System.out.println(tarefaController.adicionarTarefa(tar2));


        System.out.println(tarefaController.buscarTarefa("Passear com o cachorro"));
        System.out.println(tarefaController.buscarTarefa("AprenderGuitarra"));
        System.out.println(tarefaController.listaTarefas());
        System.out.println(tarefaController.atualizarTarefaNome("Passear com o cachorro", "Shake it bololo"));
        System.out.println(tar1);
        System.out.println(tarefaController.listaTarefas());
        tarefaController.atualizarTarefaStatus("Aprender Guitarra");
        System.out.println(tar2);
   
        tarefaController.atualizarTarefaStatus("Aprender Guitarra");
        System.out.println(tar2);
        tarefaController.atualizarTarefaStatus("Aprender Guitarra");
        System.out.println(tar2);


    }
}
