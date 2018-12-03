/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare.submittable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;



/**
 *
 * @author rafael
 */
public class DoctorMainController implements Initializable {
    
    @FXML
    private Label doctorTitle;


    @FXML
    private void historySelection(ActionEvent event) throws IOException {
        Stage stage = (Stage)doctorTitle.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("DoctorSelectPatientHistory.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void prescriptionSelection(ActionEvent event) throws IOException {
        Stage stage = (Stage)doctorTitle.getScene().getWindow();
        Parent root1 = FXMLLoader.load(getClass().getResource("DoctorSelectPrescriptions.fxml"));
        
        Scene scene = new Scene(root1);
        
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void viewInsuranceDetails(ActionEvent event) throws IOException {
        Stage stage = (Stage)doctorTitle.getScene().getWindow();
        Parent root1 = FXMLLoader.load(getClass().getResource("InsuranceDetails.fxml"));
        
        Scene scene = new Scene(root1);
        
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    




}
