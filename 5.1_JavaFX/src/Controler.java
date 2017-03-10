import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

/**
 * Created by DK on 10.03.2017.
 */
public class Controler {

    Button ok;
    Button cancel;

    TextField name;
    TextField type;

    public void okPressed(ActionEvent actionEvent) {
        System.out.println("OK");
    }

    public void cancelPressed(ActionEvent actionEvent) {
        Platform.exit();
    }
}
