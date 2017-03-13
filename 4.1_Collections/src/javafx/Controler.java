package javafx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import zoomanager.ZooManager;


/**
 * Created by DK on 10.03.2017.
 */
public class Controler {

    public TextField nameField;
    public TextField typeField;

    public CheckBox animalSex;

    public void okPressed(ActionEvent actionEvent) {
        String sexAni;
        ZooManager zooManager = View.zoo;
        String type = typeField.getText();
        String name = nameField.getText();
        boolean sex = animalSex.isSelected();
        if (sex=true) {
            sexAni = "M";
        }
        zooManager.addAnimal(type, name, sexAni);
        zooManager.print();
    }

    public void cancelPressed(ActionEvent actionEvent) {
        Platform.exit();
    }
}
