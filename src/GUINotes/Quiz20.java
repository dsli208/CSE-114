/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUINotes;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author dsli
 */
public class Quiz20 extends Application {
    //First, just declare all that's in the program
    private TextField number1 = new TextField();
    private TextField number2 = new TextField();
    private Label result = new Label();
    private Button add = new Button("Add");
    private Button subtract = new Button("Subtract");
    private Button multiply = new Button("Multiply");
    private Button divide = new Button("Divide");
    @Override
    public void start(Stage primaryStage) {
        //Now, we create the program and sort everything previously declared together
        GridPane gridPane = new GridPane();
        gridPane.add(new Label("Number 1: "), 0, 0);
        gridPane.add(number1, 1, 0);
        gridPane.add(new Label("Number 2: "), 2, 0);
        gridPane.add(number2, 3, 0);
        gridPane.add(new Label("Result: "), 4, 0);
        gridPane.add(result, 5, 0);
        //Now we add the buttons
        gridPane.add(add, 0, 1);
        gridPane.add(subtract, 1, 1);
        gridPane.add(multiply, 2, 1);
        gridPane.add(divide, 3, 1);

        add.setOnAction(e -> add());
        subtract.setOnAction(e -> subtract());
        multiply.setOnAction(e -> multiply());
        divide.setOnAction(e -> divide());
        //Parent GridPane;

        Scene scene = new Scene(gridPane, 800, 150);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void add() {
        double number1d = Double.parseDouble(number1.getText());
        double number2d = Double.parseDouble(number2.getText());
        result.setText(String.format("%.2f", number1d + number2d));
    }
    
    private void subtract() {
        double number1d = Double.parseDouble(number1.getText());
        double number2d = Double.parseDouble(number2.getText());
        result.setText(String.format("%.2f", number1d - number2d));
    }
    
    private void multiply() {
        double number1d = Double.parseDouble(number1.getText());
        double number2d = Double.parseDouble(number2.getText());
        result.setText(String.format("%.2f", number1d * number2d));
    }
    
    private void divide() {
        double number1d = Double.parseDouble(number1.getText());
        double number2d = Double.parseDouble(number2.getText());
        result.setText(String.format("%.2f", number1d / number2d));
    }
}
