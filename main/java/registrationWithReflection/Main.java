package registrationWithReflection;

import registrationWithReflection.Utilities.Validator;
import registrationWithReflection.controller.Controller;
import registrationWithReflection.model.Model;
import registrationWithReflection.view.View;

public class Main {
    public static void main(String[] args) {
        //Initialization
        Validator validator = new Validator();
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view, validator);

        //Run
        controller.mainProcess();
    }
}
