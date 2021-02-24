package game;

import java.util.ArrayList;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Game extends Application {
	
	Timeline timeline;
	Text title = new Text(30, 40, "This is Galaga");
	
	//class/global variables
	
	ArrayList<TextField> nameInputs = new ArrayList<TextField>();
	ArrayList<Button> nameEnter = new ArrayList<Button>();
	
	
	
	Pane gamePane = new Pane();
	Button enter1;
	
	
	// Game constructor
	public Game() {
		title.setFont(new Font("Comic Sans MS", 20));
		title.setFill(Color.WHITE);
		gamePane.getChildren().add(title);
		
		enter1 = new Button("ENTER");
		enter1.setFont(Font.font("Comic Sans MS", 16));
		enter1.setOnAction(e -> {
			// what button should do on click
		});
		
		
		
	}
	
	// Create a scene and place it in the stage
    Scene scene = new Scene(gamePane, 1000, 600);
	
	@Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
		
        timeline = new Timeline(new KeyFrame(Duration.millis(30), (ActionEvent event) -> 
        {
        	gamePane.setOnKeyPressed(e -> {
        		if (e.getCode() == KeyCode.UP) {
        			// action
        		}
        		if (e.getCode() == KeyCode.DOWN) {
        			// action
        		}
        		if (e.getCode() == KeyCode.LEFT) {
        			// action
        		}
        		if (e.getCode() == KeyCode.RIGHT) {
        			// action
        		}
        	});
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        
        
	    // Create a pane to hold the circle 
	    
	    
	    gamePane.setStyle("-fx-background-color: BLACK");
	    
	    
	    primaryStage.setTitle("ML Galaga"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	  }
	  

}
