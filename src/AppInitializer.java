import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("view/MainForm.fxml"));
        Scene scene = new Scene(load);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FoodCity POS System");
        primaryStage.getIcons().add(new Image("assets/logo.png"));
        primaryStage.centerOnScreen();
        primaryStage.show();

    }
}
