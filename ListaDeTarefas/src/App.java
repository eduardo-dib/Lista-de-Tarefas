import java.awt.Color;
import java.time.LocalDateTime;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import Models.*;


public class App {
    public static void main(String[] args) throws Exception{

       Tarefa tarefa1 = new Tarefa("Teste", "Tarefa teste");
       Tarefa tarefa2 = new Tarefa("Teste", "Tarefa teste");

       tarefa1.adicionarTarefa(tarefa1);
       tarefa1.excluirTarefa(tarefa1);
       tarefa2.adicionarTarefa(tarefa2);
       System.out.println(tarefa2.avançarTarefa(tarefa2));
       System.out.println(tarefa2.avançarTarefa(tarefa2));
       System.out.println(tarefa2.retornarTarefas());

        
        
        



    }
}
