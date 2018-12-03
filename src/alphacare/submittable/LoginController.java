/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare.submittable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
    private Label errorLabel;
    @FXML
    private void loginButtonAction(ActionEvent event) throws Exception {
        
        boolean success = false;
        String userType = "";
        
        String csvFile = "USERS.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null && success == false) {

                // use comma as separator
                String[] searchUser = line.split(cvsSplitBy);
                System.out.println(searchUser[0] + searchUser[1] + searchUser[2] + searchUser[3] + searchUser[4] + searchUser[5] + searchUser[6] + searchUser[7]);
                
                String username = usernameField.getText();
                String password = passwordField.getText();
                
                if (searchUser[2].equals(username)) {
                    if (searchUser[6].equals(password)) {
                        userType = searchUser[0];
                        success = true;
                    }
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
//        if (users.find("bplatfoot9", "Zjvxd8Csy")) {
//            System.out.println("yay");
//        } else {
//            System.out.println("boo");
//        }
        
        if (success) {
            Stage stage = (Stage)loginTitle.getScene().getWindow();
            String document = "PatientMain.fxml";
            if (userType.equals("PATIENT")) {
                document = "PatientMain.fxml";
            } else if (userType.equals("DOCTOR") || userType.equals("PHARMACIST")) {
                document = "DoctorMain.fxml";
            }
            Parent root = FXMLLoader.load(getClass().getResource(document));
            Scene scene = new Scene(root);
        
            stage.setScene(scene);
            stage.show();
        } else {
            errorLabel.setText("Account not found!");
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
