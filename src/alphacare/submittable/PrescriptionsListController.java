/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare.submittable;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeMap;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Rafael
 */
public class PrescriptionsListController implements Initializable {

    ObservableList dataKey = FXCollections.observableArrayList();
    TreeMap<String, String> log = new TreeMap<String, String>();

    @FXML
    private ListView<String> logList;
    @FXML
    private Label logTitle;
    @FXML
    private Label logDetails;
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        loadData();
    }
    private void loadData(){
        
        log.put("Vicoden 5mg", "Take two a day. This drug may make you dizzy or drowsy. "
                + "Alcohol or marijuana can make you more dizzy or drowsy. Do not drive, "
                + "use machinery, or do anything that needs alertness until you can do it"
                + " safely. Avoid alcoholic beverages. ");
        log.put("Trenbolone Acetate 1000mg", "Take once a day. Lift heavy things until happy.");
        log.put("Modafinil 60mg", "Take seven a day. It can treat narcolepsy, sleep apnea, and shift work sleep disorder.");
        log.put("Rohypnol 5mg", "Take two a day. This drug may make you dizzy or drowsy. "
                + "Alcohol or marijuana can make you more dizzy or drowsy. Do not drive, "
                + "use machinery, or do anything that needs alertness until you can do it"
                + " safely. Avoid alcoholic beverages. ");
        
        Set<String> keys = log.keySet();
        for (String key : keys) {
            dataKey.addAll(key);
        }
        logList.getItems().addAll(dataKey);
    }

    @FXML
    private void listClick(MouseEvent event) {
        String detailTitle = logList.getSelectionModel().getSelectedItem();
        
        if (detailTitle == null || detailTitle.isEmpty()){
            logTitle.setText("Nothing Selected"); 
        } else {
            logTitle.setText(detailTitle);
            logDetails.setText(log.get(detailTitle));
        }
    }
}
