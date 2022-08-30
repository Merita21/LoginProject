package login;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginMain extends Application {
	 public static void main(String[] args) {
	        launch(args);
	    }

	  

	    public void start(Stage primaryStage) {
	        primaryStage.setScene(new Scene(new LoginController(primaryStage).getView()));
	        primaryStage.setWidth(300);
	        primaryStage.setHeight(200);
	        primaryStage.setTitle("Login");
	        primaryStage.show();
	    }
}
