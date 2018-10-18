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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;



/**
 *
 * @author jacob
 */
public class PatientMainController implements Initializable {
    
    @FXML
    private Label patientTitle;
    @FXML
    private Button medicalHistoryButton;
    @FXML
    private Button prescriptionLogButton;
    @FXML
    private Button bookAppointmentButton;
    
    @FXML
    private void loginButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
