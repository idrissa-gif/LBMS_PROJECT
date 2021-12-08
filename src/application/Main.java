package application;
//let test the git
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.*;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Student.fxml"));

        Scene scene = new Scene(root, 600, 600);
        
        primaryStage.setTitle("Library Management System Admin App");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
