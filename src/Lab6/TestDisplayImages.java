/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab6
 * Instructor: Monisha Verma
 */

package Lab6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TestDisplayImages extends Application
{	
	@Override  //Overrides the start method in the Application Class
	public void start(Stage primaryStage) 
	{
		// TODO Auto-generated method stub
		try 
		{
		
		//create a pane to hold the images
		GridPane pane = new GridPane();
		
		//place nodes in the pane
		pane.add(new ImageView(new Image("image/uk.gif")), 0, 0);
		pane.add(new ImageView(new Image("image/ca.gif")), 1, 0);
		pane.add(new ImageView(new Image("image/china.gif")), 0, 1);
		pane.add(new ImageView(new Image("image/us.gif")), 1, 1);
		
		//create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise 14.1"); //stage name
		primaryStage.setScene(scene); //Place the scene in the stage
		primaryStage.show(); //Display the stage.
		}
		catch (Exception ex)
		{
			System.out.println("Images not found");
		}
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
