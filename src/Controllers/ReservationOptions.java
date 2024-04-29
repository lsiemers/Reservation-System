package Controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
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
import javafx.scene.layout.AnchorPane;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import controllers.ReservationOptions;

public class ReservationOptions {
    private Stage stage; 
    private Scene scene; 
    private static Parent root; 


     @FXML
    private Button Guestbtn;

    @FXML
    private Button Logoutbtn;

    @FXML
    private Button Mapbtn;

    @FXML
    private Button Reservationbtn;

    @FXML
    void Logoutbtn(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXML Files/LoginScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("Logout Button Clicked");
    }






}
