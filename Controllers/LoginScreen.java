import java.io.IOError;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class LoginScreen implements Initializable {
    private Stage stage; 
    private Scene scene; 
    private static Parent root; 

    @FXML
    private Button loginBtn;

    @FXML
    private PasswordField passwordFieldtxt;

    @FXML
    private TextField usernameFieldtxt;



@FXML
void loginBtnAction(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("/FXML Files/ReservationOptions.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("Login Button Clicked");
    }

@Override
public void initialize(URL location, ResourceBundle resources) {

}



}
