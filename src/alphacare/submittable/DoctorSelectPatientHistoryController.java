/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare.submittable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Rafael
 */
public class DoctorSelectPatientHistoryController implements Initializable {

    private Label doctorSelectHistoryTitle;
    @FXML
    private ToggleGroup patient;

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void changeScene(MouseEvent event) throws IOException{        
        Stage stage = (Stage)doctorSelectHistoryTitle.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("DoctorMain.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private void gotoWriteHistory(MouseEvent event) throws IOException {
        Stage stage = (Stage)doctorSelectHistoryTitle.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("WriteHistory.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
}
