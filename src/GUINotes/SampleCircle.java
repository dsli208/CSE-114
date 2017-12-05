/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUINotes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author dsli
 */
public class SampleCircle extends Application {
    @Override
    public void start(Stage primaryStage) {
        Circle c = new Circle(100);
        c.setCenterX(100);
        c.setCenterY(100);
        c.setRadius(50);
        Pane pane = new Pane();
        pane.getChildren().add(c);//gets subclasses of the parent class
        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
