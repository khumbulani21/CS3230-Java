package hellofx;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<MouseEvent>{
	
 
 @Override // Override the start method in the Application class
 public void start(Stage primaryStage) {
   // Create a pane and set its properties
   GridPane pane = new GridPane();
   //pane.setAlignment(Pos.CENTER);
 //  pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
  // pane.setHgap(5.5);
   //pane.setVgap(5.5);
   
     
   
   for(int i=0;i<8;i++) {
		for(int j=0;j<8;j++) {
			//insert polygon and color it
			//colors have to alternate
			Polygon	  polygon = new Polygon();  
			   
			   //Adding coordinates to the polygon 
			   polygon.getPoints().addAll(new Double[]{ 
			 		    0.0, 0.0,
			 		    50.0, 0.0,
			 		    50.0, 50.0, 
			 		    0.0, 50.0 
			   });
			   if(i%2==0)
			   {
				   if(j%2==0)
				   {
					   polygon.setFill(Color.SNOW); 
				   }
				   
			   }
			   else if(i%2==1)
			   {
				   if(j%2==1)
				   {
					   polygon.setFill(Color.SNOW); 
				   }
				   
			   }
			   //polygon.setFill(Color.SNOW);
			   polygon.setOnMousePressed(new EventHandler<MouseEvent>() {
	                @Override
	                public void handle(MouseEvent event) {
	                	polygon.setFill(Color.BLUE); 
	                }
	            });
			   pane.add(polygon, i, j);
		}
	}
   
   // Create a scene and place it in the stage
   Scene scene = new Scene(pane);
   primaryStage.setTitle("ShowGridPane"); // Set the stage title
   primaryStage.setScene(scene); // Place the scene in the stage
   primaryStage.show(); // Display the stage
 }
 
 /**
  * The main method is only needed for the IDE with limited
  * JavaFX support. Not needed for running from the command line.
  */
 public static void main(String[] args) {
   launch(args);
 }
 

@Override
public void handle(MouseEvent arg0) {
	 
	
}
} 