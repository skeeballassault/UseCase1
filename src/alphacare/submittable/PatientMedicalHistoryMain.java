package alphacare.submittable;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 *
 * @author rafael
 */
public class PatientMedicalHistoryMain {

        @Override
        private void start(Stage stage) throws Exception {
            Parent parent = FXMLLoader.load(getClass().getResource("/com/ListView.fxml"));
            Scene scene = new Scene(parent);
            stage.setTitle("Your Medical History");
            stage.setScene(scene);
            stage.show();
        }

    }

}
