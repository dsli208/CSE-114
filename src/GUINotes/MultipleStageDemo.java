/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUINotes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author dsli
 */
public class MultipleStageDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new Button("OK"), 200, 250);
        primaryStage.setTitle("My Java FX");
        primaryStage.setScene(scene);
        primaryStage.show();
        Stage stage = new Stage();
        stage.setTitle("Second stage");
        Scene s2 = new Scene(new Button("New Stage"));
        stage.setScene(new Scene(new Button("new Stage")));
        stage.setScene(s2);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
