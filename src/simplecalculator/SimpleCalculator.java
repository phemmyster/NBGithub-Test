/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author PC
 */
public class SimpleCalculator extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // define UI
        
        Label laNumber1 = new Label("Number1:");
        TextField txtNumber1 = new TextField();
        
         Label laNumber2 = new Label("Number2:");
        TextField txtNumber2 = new TextField();
        
        Label laResult = new Label("Sum: ");
        
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        grid.setGridLinesVisible(true);
        grid.add(laNumber1, 0, 0);
        grid.add(txtNumber1, 1, 0);
        grid.add(laResult, 0, 2);
        
        grid.add(laNumber2, 0, 1);
        grid.add(txtNumber2, 1, 1);
        
        Scene scene = new Scene(grid, 400, 350);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
