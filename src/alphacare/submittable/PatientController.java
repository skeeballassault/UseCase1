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
 * @author jacob
 * @refactor niko
 */
public class PatientController implements Initializable {
    
    @FXML
    private Label patientTitle;
    @FXML
    private Button viewMedicalHistoryButton;
    @FXML
    private Button viewPrescriptionLogButton;
    @FXML
    private Button createAppointmentButton;
    @FXML
    private Button createUserButton;
    

    @FXML
    private void viewMedicalHistoryButtonAction (ActionEvent event){

    }
    @FXML
    private void viewPrescriptionLogButtonAction(ActionEvent event){

    }
    @FXML
    private void createAppointmentButtonAction(ActionEvent event){

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
