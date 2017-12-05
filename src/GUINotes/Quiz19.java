/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUINotes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
/**
 *
 * @author dsli
 */
public class Quiz19 extends Application {
    @Override
    public void start(Stage primaryStage) {
        FlowPane panel = new FlowPane();
        Label label1 = new Label("This is a label");
        TextField text1 = new TextField("This is a text field");
        Button button1 = new Button("OK");
        panel.getChildren().addAll(label1, text1, button1);
        Scene scene = new Scene(panel, 320, 40);
        primaryStage.setTitle("Quiz");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
