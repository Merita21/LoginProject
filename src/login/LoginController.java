package login;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginController {
	private LoginViewBuilder viewBuilder;
    private LoginModel model = new LoginModel();
    private Stage stage;

    public LoginController(Stage stage) {
        this.stage = stage;
        viewBuilder = new LoginViewBuilder(model, () -> checkAccess());
    }

    public Region getView() {
        return viewBuilder.getView();
    }

    private void checkAccess() {
        if (model.getUser().equals("User") && model.getPassword().equals("Pass")) {
            loadMainApplication();
        } else {
            displayErrorMessage();
        }
    }

    private void displayErrorMessage() {
        Alert dialog = new Alert(Alert.AlertType.ERROR);
        dialog.setTitle("Not able to Login");
        dialog.setHeaderText("Incorrect Username or Password");
        dialog.setContentText("You have entered incorrect username or Password.\nPlease try Again");
        dialog.showAndWait();
    }

    private void loadMainApplication() {
        VBox vBox = new VBox(new ImageView(new Image("C:\\Users\\Perdorues\\Pictures\\download.jfif")));
        stage.setScene(new Scene(vBox));
    }

}
