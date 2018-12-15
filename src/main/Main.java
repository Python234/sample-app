package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage stage) throws Exception {
        StackPane layout = new StackPane();
        layout.getChildren().add(new Button("button"));

        stage.setScene(new Scene(layout));
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}
