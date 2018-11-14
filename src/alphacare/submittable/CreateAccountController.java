package alphacare.submittable;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

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
    private TextField emailField;
    @FXML
    private ComboBox userAccountTypeComboBox;

    public int userId = 0;
    private String accountType;
    private String username;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;
    private User newUser;

    @FXML
    private void createAccountButtonAction(ActionEvent event) throws Exception {
        this.accountType = (String) userAccountTypeComboBox.getValue();
        this.username = usernameField.getText();
        this.firstName = firstNameField.getText();
        this.lastName = lastNameField.getText();
        this.dateOfBirth = dateOfBirthField.getText();
        this.email = emailField.getText();
        userId++;
        newUser = UserFactory.createUser(accountType, userId, username, firstName, lastName, dateOfBirth, email);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
