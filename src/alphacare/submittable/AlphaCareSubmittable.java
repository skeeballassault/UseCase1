/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare.submittable;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jacob
 * @author niko
 */
public class AlphaCareSubmittable extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
//        User patientTest = UserFactory.createUser("patient", 1,"pat1","george","smith"); // creates a user of type patient
//        User pharmacistTest = UserFactory.createUser("pharmacist", 1,"pha1","tom","williams"); // creates a user of type pharmacist
//        User doctorTest = UserFactory.createUser("doctor", 1,"doc1","vinny","nardone"); // creates a user of type doctor
//
//        System.out.println(patientTest);
//        System.out.println(pharmacistTest);
//        System.out.println(doctorTest);

    }
    
}
