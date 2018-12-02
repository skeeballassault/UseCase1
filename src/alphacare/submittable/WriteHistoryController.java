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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Rafael
 */
public class WriteHistoryController implements Initializable {
    
    
    @FXML
    private Label writeHistoryTitle;
    @FXML
    private Button backButton;
    @FXML
    private TextField titleTextField;
    @FXML
    private TextArea bodyTextArea;
    @FXML
    private Button SaveButton;
    @FXML
    private Label confirmationLabel;
    
    String title;
    String body; 
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveButtonAction(ActionEvent event) {
        title = titleTextField.getText();
        body = bodyTextArea.getText();
        
        confirmationLabel.setVisible(true); 
    }
    
    @FXML
    private void changeScene(MouseEvent event) throws IOException{        
        Stage stage = (Stage)writeHistoryTitle.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("DoctorSelectPatientHistory.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
}
