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
import javafx.scene.text.Text;
import javafx.stage.Stage;



/**
 *
 * @author rafael
 */
public class patientMedicalHistoryController implements Initializable {

    @FXML
    private ListView<String> listView;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        ObservableList<String> data = FXCollections.observableArrayList(
                "Heart Transplant", "Annual G.P.Check Up","Annual Dental Check Up","Annual Cancer Screening",
                "Heart Transplant", "Annual G.P.Check Up","Annual Dental Check Up","Annual Cancer Screening",
                "Heart Transplant", "Annual G.P.Check Up","Annual Dental Check Up","Annual Cancer Screening",
                "Heart Transplant", "Annual G.P.Check Up","Annual Dental Check Up","Annual Cancer Screening",
                "Heart Transplant", "Annual G.P.Check Up","Annual Dental Check Up","Annual Cancer Screening");
        listView.setItems(data);
    }


}
