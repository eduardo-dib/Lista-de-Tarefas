import java.time.LocalDateTime;

import Controllers.*;
import Models.*;


public class App {
    public static void main(String[] args) throws Exception{
        CategoriaController controller = new CategoriaController();
        TarefaController tarefaController = new TarefaController();



        

        Categoria cat1 = new Categoria("Trabalho");
        Categoria cat2 = new Categoria("Pessoal");
        Categoria cat3 = new Categoria("Trabalho");

        String resultado1 = controller.cadastrarCategoria(cat1);
        System.out.println(resultado1);  

        String resultado2 = controller.cadastrarCategoria(cat2);
        System.out.println(resultado2);  

        Tarefa tar1 = new Tarefa("Passear com o cachorro","brodis",  cat1);
        Tarefa tar2 = new Tarefa("Aprender Guitarra","brah",  cat2);
        Tarefa tar3 = new Tarefa("Passear com o gato","bros",  cat2);


        
        String resultado3 = controller.cadastrarCategoria(cat1);
        System.out.println(resultado3);  

        
        System.out.println(controller.listarCategorias());

         

        System.out.println(controller.cadastrarCategoria(cat3));
       
        System.out.println(controller.listarCategorias());

        System.out.println(controller.deletarCategoria(cat3));

        System.out.println(controller.listarCategorias());

        System.out.println(tarefaController.adicionarTarefa(tar1));

        System.out.println(tarefaController.adicionarTarefa(tar2));
        System.out.println(tarefaController.adicionarTarefa(tar3));


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

        System.out.println(controller.buscarCategoriaPorId(1));
        System.out.println(controller.buscarCategoriaPorId(2));
        System.out.println(controller.buscarCategoriaPorId(3));
        System.out.println(controller.listarCategorias());
        String dataStr = "2024-08-06T19:18:58.428171100";
        LocalDateTime data = LocalDateTime.parse(dataStr);
        System.out.println(controller.buscarCategoriaPorData(data));
        System.out.println(tarefaController.buscarTarefaPorId(1));
        System.out.println(tarefaController.buscarTarefaPorId(2));
        System.out.println(tarefaController.buscarTarefaPorId(3));
        System.out.println(tarefaController.buscarTarefasPorPalavraChave("brodis"));
        System.out.println(tarefaController.buscarTarefaPorData(data));
        System.out.println("-------------------------------------------------------");
        System.out.println(tarefaController.buscarTarefasPorCategoria(cat2));
        System.out.println(tarefaController.buscarTarefasPorStatus("nao iniciada"));

        
        
        



    }
}
