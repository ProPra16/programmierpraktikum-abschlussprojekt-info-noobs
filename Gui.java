import java.io.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Gui extends Application {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    static Pane root = new Pane();
    private Scene scene;
        
    private Parent workWindow() {

      root.getChildren().clear();
      
      //Text
      TextArea input = new TextArea();
      input.setPromptText("Your Code here:");
      input.setPrefColumnCount(50);
      input.setPrefWidth(WIDTH-WIDTH/10);
      input.setPrefHeight(HEIGHT-HEIGHT/10);
      
      input.getText();
      
      
      //Erzeuge Button
      Button next = new Button();

      //Button Texte
      next.setText("Next");

      //Button Position
      next.setLayoutX(WIDTH-WIDTH/10);
      next.setLayoutY(HEIGHT-HEIGHT/10);
      
      next.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
        }
      });
     
      //Button Ende
      
      root.getChildren().add(next);
      root.getChildren().add(input);
      root.setPrefSize(WIDTH, HEIGHT);
      
      return root;
    }
    
    public static void main(String[] args) {
          launch(args);
    }
    
    @Override
    public void start(Stage stage) {
      stage.setTitle("TestDrivenDevelopmentTrainer");
      
      scene = new Scene(workWindow());
      String style = getClass().getResource("styles.css").toExternalForm();
      scene.getStylesheets().addAll(style);
      stage.setScene(scene);
      stage.show();
    }
}
