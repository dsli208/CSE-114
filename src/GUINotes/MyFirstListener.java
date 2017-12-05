/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUINotes;

import java.util.EventListener;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author dsli
 */
public class MyFirstListener extends Application {
    Label l = new Label("0");
    String counter = "";
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox pane = new VBox();
        Button btOK = new Button("OK");
        Button btCancel = new Button("Cancel");
        btOK.setOnAction(new OKListener()); //or btOK.setOnAction(e -> { System.out.println("OK button clicked"}); } --> ANONYMOUS LISTENER
        btOK.setOnAction(e -> {
            System.out.println("OK button clicked");
        });
        pane.getChildren().add(btOK);
        pane.getChildren().add(btCancel);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My First Handler");
        primaryStage.show();

    }
    //A class WITHIN a class, so what's above has access more easily
    class OKListener implements EventHandler {

        @Override
        public void handle(Event event) {
            counter += "x";
            l.setText("" + counter);
            System.out.println("OK was clicked");
        }
    }
}

class CancelHandler implements EventHandler {

    @Override
    public void handle(Event event) {
        System.out.println("Cancel was clicked");
    }
}
