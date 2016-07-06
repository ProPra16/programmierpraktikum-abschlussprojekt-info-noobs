import java.io.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.text.Text;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Gui extends Application {
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 800;
    static Pane root = new Pane();
    private Scene scene;
        
    private Parent workWindow() {

      root.getChildren().clear();
      
      //Text
      Text modus = new Text(WIDTH-WIDTH/6,20, "Aktueller Modus:");
      modus.setId("modus0");
      
      //TextArea
      TextArea input = new TextArea();
      input.setPromptText("Your Code here:");
      input.setPrefWidth(WIDTH-WIDTH/6);
      input.setPrefHeight(HEIGHT-HEIGHT/6);
      
      //TextArea-Ende
      
      //Erzeuge Button
      Button next = new Button();
      next.setText("Next");
      next.setLayoutX(WIDTH-WIDTH/6);
      next.setLayoutY(HEIGHT-HEIGHT/6);
      
      next.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
        }
      });
     
      //Button Ende
      
      root.getChildren().add(next);
      root.getChildren().add(input);
      root.getChildren().add(modus);
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
