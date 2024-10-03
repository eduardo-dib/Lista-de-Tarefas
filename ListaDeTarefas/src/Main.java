import Presenter.Presenter;
import View.View;
import Models.TarefaModel;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        TarefaModel model = new TarefaModel();
        Presenter presenter = new Presenter(view, model);
        presenter.iniciar();
    }
}
