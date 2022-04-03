package finalproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class AnimationPlayer extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane pane = new Pane();
        
        Scene scene = new Scene(pane, 1600, 900, Color.WHITESMOKE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Animation Player");
        
        primaryStage.show();
        
    }
    
    void loadAnimationFromFile(String fileName) {
        
    }
    
    void run() {
        
        launch();
    
    }
    
}
