import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Matrix extends Application {

    public static void main(String[] args) {
        launch(args);
        System.out.println();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("MatrixView.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Matrix");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
