package alphacare.submittable;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * @author niko
 */

public class CreateAccountController implements Initializable {
    @FXML
    private TextField usernameField;
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField dateOfBirthField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField emailField;
    @FXML
    private ComboBox userAccountTypeComboBox;
    @FXML
    private Label errorLabel;

    public int userId;
    private String accountType;
    private String username;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String password;
    private String email;
    private User newUser;
    private List<User> listOfUsers; //this was just for testing purposes.

    @FXML
    private void createAccountButtonAction(ActionEvent event) throws Exception {
        String[] searchUser = new String[]{"","","","","","","","" };
        String password = passwordField.getText();
        
        boolean isLongEnough = false;
        boolean hasLetter = false;
        boolean hasDigit = false;

        
        if (password.length() >= 6) {
            isLongEnough = true;
        }
        
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }
        
        if (!isLongEnough) {
            errorLabel.setText("Password must be >= 6 characters.");
        } else if (!hasLetter) {
            errorLabel.setText("Pass must contain >= 1 letter.");
        } else if (!hasDigit) {
            errorLabel.setText("Pass must contain >= 1 number.");
        } else {
            String csvFile = "USERS.csv";
            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ",";
            
        
            try {

                br = new BufferedReader(new FileReader(csvFile));
                while ((line = br.readLine()) != null) {

                    // use comma as separator
                    searchUser = line.split(cvsSplitBy);
                    System.out.println(searchUser[0] + searchUser[1] + searchUser[2] + searchUser[3] + searchUser[4] + searchUser[5] + searchUser[6] + searchUser[7]);
                
                }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            //This is where the user would be created
            this.accountType = (String) userAccountTypeComboBox.getValue();
            this.accountType = this.accountType.toUpperCase();
            this.username = usernameField.getText();
            this.firstName = firstNameField.getText();
            this.lastName = lastNameField.getText();
            this.dateOfBirth = dateOfBirthField.getText();
            this.password = passwordField.getText();
            this.email = emailField.getText();
            Integer newID = ((Integer.parseInt(searchUser[1]) + 1));
            //Integer newID = (int)(Math.random() * 50000 + 51);
            StringBuilder sb = new StringBuilder();
            sb.append(accountType);
            sb.append(",");
            sb.append(newID.toString());
            sb.append(",");
            sb.append(username);
            sb.append(",");
            sb.append(firstName);
            sb.append(",");
            sb.append(lastName);
            sb.append(",");
            sb.append(dateOfBirth);
            sb.append(",");
            sb.append(password);
            sb.append(",");
            sb.append(email);
            sb.append('\n');
            
            FileWriter fw = new FileWriter(csvFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(sb.toString());
            pw.close();
            
            errorLabel.setText("Account created successfully!");
            
//            Stage stage = (Stage)passwordField.getScene().getWindow();
//            String document = "LoginScreen.fxml";
//            Parent root = FXMLLoader.load(getClass().getResource(document));
//            Scene scene = new Scene(root);
//        
//            stage.setScene(scene);
//            stage.show();
        }
        
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
