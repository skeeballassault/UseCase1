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
    private void loginButtonAction(ActionEvent event) throws Exception {
        
        boolean success = false;
        
        //Placeholder users
        String[] user1 = {"bromboni1997", "Testing1"};
        String[] user2 = {"roberto5", "Testing2"};
        String[] user3 = {"stickleg", "Testing3"};
        
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        if ( username.equals(user1[0]) ) {
            if ( password.equals(user1[1]) ) {
                success = true;
            }
        } else if ( username.equals(user2[0]) ) {
            if ( password.equals(user2[1]) ) {
                success = true;
            }
        } else if ( username.equals(user3[0]) ) {
            if ( password.equals(user3[1]) ) {
                success = true;
            }
        } else {
            System.out.println("Username/password invalid!");
            success = false;
        }
        
        if (success) {
            Stage stage = (Stage)loginTitle.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("PatientMain.fxml"));
        
            Scene scene = new Scene(root);
        
            stage.setScene(scene);
            stage.show();
        }
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
