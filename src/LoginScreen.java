import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginScreen implements Initializable {

    @FXML
    private Button loginBtn;

    @FXML
    private PasswordField passwordFieldtxt;

    @FXML
    private TextField usernameFieldtxt;


@Override
public void initialize(URL location, ResourceBundle resources) {
    System.out.println("TEST");

}



}
