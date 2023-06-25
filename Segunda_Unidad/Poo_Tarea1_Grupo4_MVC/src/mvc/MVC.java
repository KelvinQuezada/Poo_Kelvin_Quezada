
package mvc;
import model.Model;
import view.View;
import controller.Controller;

public class MVC {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        view.setVisible(true);
    }
}