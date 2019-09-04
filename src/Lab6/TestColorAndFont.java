/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab6
 * Instructor: Monisha Verma
 */
package Lab6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TestColorAndFont extends Application
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
		//create an HBox
		HBox hBox = new HBox(10);
		hBox.setPadding(new Insets(10, 10, 10, 10));
		hBox.setAlignment(Pos.CENTER);
		
		//add text to HBox
		for (int i = 0; i < 5; i++)
		{
			//create the text and text properties
			Text text = new Text("Java");
			text.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
			text.setRotate(90);
			
			//set random color and opacity
			text.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
			hBox.getChildren().add(text);
			
		}
		
		//create a scene
		Scene scene = new Scene(hBox, 300, 100);
		primaryStage.setTitle("Exercise 14.4: Color and Font");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
