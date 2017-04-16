/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

/**
 *
 * @author usmcw
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NFLPlayerFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button("Click Me");
        btn.setOnAction(new EventHandler<ActionEvent>()  {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!!!");
            }
            
        });
                
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
            
            
    }
    
}
