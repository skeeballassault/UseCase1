/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare.submittable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeMap;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;




/**
 *
 * @author rafael
 */
public class patientMedicalHistoryController implements Initializable {

    ObservableList dataKey = FXCollections.observableArrayList();
    TreeMap<String, String> entries = new TreeMap<String, String>();

    @FXML
    private ListView<String> historyList;
    @FXML
    private Label historyTitle;
    @FXML
    private Label historyEntry;
    @FXML
    private Button backButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        loadData();
    }
    private void loadData(){
        
        entries.put("2018-11-15 Heart Transplant", "Cardiac Surgeon Doctor Shoe took the heart of a pig and performed a 93 hour surgery on you!");
        entries.put("2018-10-01 Annual G.P.Check Up", "Doctor Banana found that you have no heart. Sounds like my ex-wife");
        entries.put("2018-05-15 Annual Dental Check Up", "Dr. Gums found your teeth are great.");
        entries.put("2018-01-05 Annual Cancer Screening", "No cancer here!");
        
        Set<String> keys = entries.keySet();
        for (String key : keys) {
            dataKey.addAll(key);
        }
        historyList.getItems().addAll(dataKey);
    }

    @FXML
    private void listClick(MouseEvent event) {
        String entryTitle = historyList.getSelectionModel().getSelectedItem();
        
        if (entryTitle == null || entryTitle.isEmpty()){
            historyTitle.setText("Nothing Selected"); 
        } else {
            historyTitle.setText(entryTitle);
            historyEntry.setText(entries.get(entryTitle));
        }
    }

    @FXML
    private void changeScene(MouseEvent event) throws IOException{        
        Stage stage = (Stage)historyTitle.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("PatientMain.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
}
