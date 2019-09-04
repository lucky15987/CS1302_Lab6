/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab6
 * Instructor: Monisha Verma
 */
package Lab6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TestCylinder extends Application
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
		//create gridPane
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		
		//create nodes
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				//create a stack pane
				StackPane stackPane = new StackPane();
				
				//add circles to stack pane
				Circle circle = getCircle();
				stackPane.getChildren().add(circle);
				
				//add arcs to stack
				getArcs(stackPane);
				
				gridPane.add(stackPane, i, j);
			}
		}
		//create the scene
		Scene scene = new Scene(gridPane);
		primaryStage.setTitle("Exercise 14.9: Create Four Fans");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	//method for adding arcs to the scene
	private void getArcs(StackPane stackPane) 
	{
		// TODO Auto-generated method stub
		
		double angle = 30; //starting angle
		for (int i = 0; i < 4; i++)
		{
			Pane pane = new Pane();
			Arc arc = new Arc(100, 100, 80, 80, angle + 90, 35);
			arc.setFill(Color.BLACK);
			arc.setType(ArcType.ROUND);
			pane.getChildren().add(arc);
			stackPane.getChildren().add(pane);
			angle+= 90;	//to constantly change the angle
		}
	}
	//method for adding circles to the scene
	private Circle getCircle() 
	{
		// TODO Auto-generated method stub
		
		Circle circle = new Circle();
		circle.setRadius(100);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		return circle;
	}

}
