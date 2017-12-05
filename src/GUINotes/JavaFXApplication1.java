/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUINotes;

//import java.awt.Button;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
/**
 *
 * @author dsli
 */
public class JavaFXApplication1 extends Application {
    @Override //Override the start method in the Application class
    public void start(Stage primaryStage) {
        //Create a button and place it in the scene
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 250);
        primaryStage.setTitle("MyJavaFX"); //Set stage title
        primaryStage.setScene(scene); //Place the scene in the stage
        primaryStage.show(); //Display the stage
    }
    //Not really needed, only in IDE's that have limited JavaFX support to RUN the program itself
    public static void main(String[] args) {
        launch(args);
    }
}
