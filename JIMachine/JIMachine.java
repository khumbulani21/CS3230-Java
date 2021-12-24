import java.io.File;
import java.net.MalformedURLException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;

public class JIMachine extends Application implements EventHandler<ActionEvent> {

	Image image;
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		BorderPane borderPane = new BorderPane();
		GridPane grid= new GridPane();
		borderPane.autosize();

		ImageView iv1;

		Scene scene; 
		iv1 = new ImageView( );


		//open button
		Button open= new Button("Open");
		grid.add(open, 0,0);


		// event handler for open button
		EventHandler<ActionEvent> openEvent = new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent e) 
			{ 
				//open the image and display it on borderpane
				try {
					FileChooser fileChooser = new FileChooser();
					fileChooser.setTitle("Open Resource File");
					new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif");
					File selectedFile = fileChooser.showOpenDialog(primaryStage);
					image = new Image(selectedFile.toURI().toURL().toExternalForm() );
					iv1.setFitHeight(image.getHeight());
					iv1.setFitWidth(image.getWidth());
					iv1.setImage(image);
					borderPane.setCenter(iv1);

				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			} 
		}; 
		open.setOnAction(openEvent);
		//quit button
		Button quit= new Button("Quit");
		grid.add(quit, 1,0);
		//add event handler for the quit button
		EventHandler<ActionEvent> quitEvent = new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent e) 
			{ 
				System.exit(0);
			} 
		}; 
		quit.setOnAction(quitEvent);

		Button zoomIn= new Button("Zoom in");
		grid.add(zoomIn, 5,0);
		//zoom out event handler     
		EventHandler<ActionEvent> zoomInEvent = new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent e) 
			{ 
				iv1.setFitHeight(iv1.getFitHeight()+(iv1.getFitHeight()*(0.25)));
				iv1.setFitWidth(iv1.getFitWidth()+(iv1.getFitWidth()*0.25));

			} 
		}; 

		zoomIn.setOnAction(zoomInEvent);

		Button zoomOut= new Button("Zoom out");
		grid.add(zoomOut, 7,0);
		// zoom out event handler


		//add event handler for the quit button
		EventHandler<ActionEvent> zoomOutEvent = new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent e) 
			{ 
				//use the original image to set the imageview
				iv1.setFitHeight(iv1.getFitHeight()-(iv1.getFitHeight()*(0.25)));
				iv1.setFitWidth(iv1.getFitWidth()-(iv1.getFitWidth()*0.25));

			} 
		}; 

		zoomOut.setOnAction(zoomOutEvent);

		Button hundred= new Button("100 %");
		grid.add(hundred, 9,0);
		//add event handler for the 100% button
		EventHandler<ActionEvent> hundredEvent = new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent e) 
			{ 
				//use the original image to set the imageview
				iv1.setFitHeight(image.getHeight());
				iv1.setFitWidth(image.getWidth());

			} 
		}; 

		hundred.setOnAction(hundredEvent);


		borderPane.setTop(grid);

		scene = new Scene(borderPane);
		primaryStage.setTitle("ShowGridPane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}


	public static void main(String[] args) {
		launch(args);
	}



	@Override
	public void handle(ActionEvent arg0) {


	}

}
