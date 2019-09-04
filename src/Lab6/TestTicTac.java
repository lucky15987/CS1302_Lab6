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

public class TestTicTac extends Application
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		// TODO Auto-generated method stub
		//create a grid
		GridPane pane = new GridPane();
		
		//add nodes
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				int n = (int)(Math.random() * 3);
				
				if (n == 0)
				{
					pane.add(new ImageView(new Image("image/x.gif")), j, i);
				}
				else if (n == 1)
				{
					pane.add(new ImageView(new Image("image/o.gif")), j, i);
				}
				else
				{
					continue;
				}
			}
		}
		
		//create the scene 
		Scene scene = new Scene(pane, 120, 130);
		primaryStage.setTitle("Exercise 14.2: Tic-Tac-Toe"); //set title
		primaryStage.setScene(scene); //set scene
		primaryStage.show(); //Display the Scene
	}

}
