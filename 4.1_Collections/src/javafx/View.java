package javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import zoomanager.ZooManager;

/**
 * Created by DK on 10.03.2017.
 */

public class View extends Application{

    public static ZooManager zoo;

    public void setZoo(ZooManager zooManager) {
        View.zoo = zooManager;
    }

    public void run() {

        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = createSceneGraph();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Parent createSceneGraph() throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("FirstJavaControl.fxml"));
        return parent;
    }
}
