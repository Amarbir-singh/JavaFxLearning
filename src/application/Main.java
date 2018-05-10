package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.text.Text;




public class Main extends Application 
{
	

	@Override
	public void start(Stage primaryStage) 
	{ 
		
		//creating a text object
		Text text = new Text();
		//setting the text to be added
		text.setText("Hello");
		//setting the position of the text
		text.setX(120);
		text.setY(80);
		//creating a group object
		
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
		StackPane stack = new StackPane();
         		
		
		stack.getChildren().addAll(text,path);
		//Creating a scene object
		
		
		//Setting title to the stage
		primaryStage.setTitle("Drawing");
		Scene scene =new Scene(stack);
		//Adding css file
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		//Adding scene to the stage
		primaryStage.setScene(scene);
		//Displaying the contents of the stage
		primaryStage.show();
           
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
