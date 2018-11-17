package alphacare.submittable;

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
import javafx.scene.control.Label;

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
            errorLabel.setText("Password must be 6 or more characters.");
        } else if (!hasLetter) {
            errorLabel.setText("Password must contain at least 1 letter.");
        } else if (!hasDigit) {
            errorLabel.setText("Password must contain at least 1 number.");
        } else {
            System.out.println("Account creation will be implemented next sprint.");
            //This is where the user would be created
//            this.accountType = (String) userAccountTypeComboBox.getValue();
//            this.username = usernameField.getText();
//            this.firstName = firstNameField.getText();
//            this.lastName = lastNameField.getText();
//            this.dateOfBirth = dateOfBirthField.getText();
//            this.password = passwordField.getText();
//            this.email = emailField.getText();
//            userId++;
//            listOfUsers = new ArrayList();
//            newUser = UserFactory.createUser(accountType, userId, username, firstName, lastName, dateOfBirth, password, email);
//            listOfUsers.add(newUser);
        }
        
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
