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
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField dateOfBirthField;
    @FXML
    private TextField emailField;
    @FXML
    private ComboBox userAccountTypeComboBox;

    @FXML
    private void createAccountButtonAction(ActionEvent event) throws Exception {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(firstNameField.getText());
    }

}
