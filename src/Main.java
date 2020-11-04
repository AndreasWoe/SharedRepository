import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application
{
    public static void main(String[] args) {
        // Launch the JavaFX application
        Application.launch(args);
    }

    @Override public void start(Stage stage) {
        Group group = new Group();
        //Creating a Scene
        Scene scene = new Scene(group);
        stage.setWidth(450);
        stage.setHeight(450);
        //Setting title to the scene
        stage.setTitle("Hello World Version 3.0 von Elijah");
        //Adding the scene to the stage
        stage.setScene(scene);
        stage.getIcons().add(new Image("ico.png"));
        //Displaying the contents of a scene
        stage.show();
    }
}