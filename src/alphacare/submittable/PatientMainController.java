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
 */
public class PatientMainController implements Initializable {
    
    private Label patientTitle;
    @FXML
    private Label doctorTitle;
    @FXML
    private Button viewInsuranceButton;


    
    private void medicalButtonAction(ActionEvent event) throws IOException {
        Stage stage = (Stage)patientTitle.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("patientMedicalHistoryView.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
    private void prescriptionLogButton(ActionEvent event) throws IOException {
        Stage stage = (Stage)patientTitle.getScene().getWindow();
        Parent root1 = FXMLLoader.load(getClass().getResource("PrescriptionsListView.fxml"));
        
        Scene scene = new Scene(root1);
        
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    
}
