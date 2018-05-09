package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;




public class Main extends Application 
{
	

	@Override
	public void start(Stage primaryStage) 
	{
        //Creating a path
		Path path = new Path();
		//Moving to the starting point
		MoveTo moveTo = new MoveTo(108,71);
		//Creating 1st Line
		LineTo line1 = new LineTo(108,171);
		//Creating 2
		LineTo line2 = new LineTo(208,171);
		//Creating 3
		LineTo line3 = new LineTo(208,71);
		//4
		LineTo line4 = new LineTo(108,71);
		//Adding all the elements to the path
		path.getElements().add(moveTo);
		path.getElements().addAll(line1,line2,line3,line4);
		
		//creating a Group object
		Group root = new Group(path);
		
		//Creating a scene object
		Scene scene = new Scene(root,600,300);
		
		//Setting title to the stage
		primaryStage.setTitle("Drawing");
		
		//Adding scene to the stage
		primaryStage.setScene(scene);
		//Displaying the contents of the stage
		primaryStage.show();
           
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
