/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare.submittable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



/**
 *
 * @author jacob
 */
public class LoginController implements Initializable {
    
    @FXML
    private Label loginTitle;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField dateOfBirthField;
    @FXML
    private TextField emailField;
    @FXML
    private ComboBox userAccountTypeComboBox;
    
    @FXML
    private void loginButtonAction(ActionEvent event) throws Exception {
        Stage stage = (Stage)loginTitle.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("PatientMain.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void createAccountButtonAction(ActionEvent event) throws Exception {
        Stage stage = (Stage)loginTitle.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("CreateAccountScreen.fxml"));

        Scene scene = new Scene (root);

        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
