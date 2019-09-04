/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab6
 * Instructor: Monisha Verma
 */
package Lab6;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TestCharactersAroundCircle extends Application
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception 
	{
		// TODO Auto-generated method stub
		//create pane
		Pane pane = new Pane();
		
		String[] java = "WELCOME TO JAVA".split("");
		
		Font font = Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 30);
		
		
		// create Cicle
		Point2D center = new Point2D(200, 200);
		double radius = 100;
		double angle = 0;
		double rotate = 90;
		
		//insert text within circle using the trig equation for a circle:
		// x = a + r * cos(t)
		// y = b + r * sin(t)
		for (int i = 0; i < java.length; i++, angle += 22, rotate += 22)
		{
			double x = center.getX() + radius * Math.cos(Math.toRadians(angle));
			double y = center.getY() + radius * Math.sin(Math.toRadians(angle));
			//insert Text
			Text text = new Text(x, y, java[i]);
			text.setRotate(rotate);
			text.setFont(font);
			pane.getChildren().add(text);
		}
		
		//create the scene
		Scene scene = new Scene(pane, 400, 400);
		arg0.setTitle("Exercise 14.5: Characters around circle");
		arg0.setScene(scene);
		arg0.show();
	}

}
