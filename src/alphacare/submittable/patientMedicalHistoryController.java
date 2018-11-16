/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare.submittable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;



/**
 *
 * @author rafael
 */
public class patientMedicalHistoryController implements Initializable {

    ObservableList data = FXCollections.observableArrayList();
            
    @FXML
    private ListView<String> historyList ;
    private TextField historyTitle ;
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        loadData();
    }
    private void loadData(){
        String title20181115 = "2018-11-15\tHeart Transplant";
        String title20181001 = "2018-10-01\tAnnual G.P.Check Up";
        String title20180515 = "2018-05-15\tAnnual Dental Check Up";
        String title20180105 = "2018-01-05\tAnnual Cancer Screening";
        data.addAll(title20181115,title20181001,title20180515,title20180105);
        historyList.getItems().addAll(data);
    }

    @FXML
    private void listClick(MouseEvent event) {
        String entryTitle = historyList.getSelectionModel().getSelectedItem();
        if (entryTitle == null || entryTitle.isEmpty()){
            historyTitle.setText("Nothing Selected"); 
        } else {
            historyTitle.setText(entryTitle);
        }
    }
}
