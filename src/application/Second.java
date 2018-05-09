package application;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

public class Second extends Application 
{
   @Override
   public void start(Stage stage) 
   {
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
	   Text text = new Text();
	   text.setFont(new Font(45));
	   text.setX(50);
	   text.setY(150);
	   text.setText("Welcome to Tutorialspoint");
	   
	   ObservableList list = root.getChildren();
	   list.add(text);
	   Scene scene = new Scene(root, 600,300);
	   stage.setScene(scene);
	   stage.show();
   }
   
   
   public static void main(String[]args)
   {
	 launch(args);
   }

}
