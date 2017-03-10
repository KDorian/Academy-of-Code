import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * Created by DK on 10.03.2017.
 */
public class Run extends Application {
    public static void main(final String[] args) {
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
