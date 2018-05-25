package ru.isu.math.zvereva.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AddUserController {
    @FXML
    private Label name;

    @FXML
    private Label surname;

    @FXML
    private Label fathername;

    @FXML
    private Label roleId;

    @FXML
    private Label login;

    @FXML
    private Label password;

    @FXML
    private TextField tname;

    @FXML
    private TextField tsurname;

    @FXML
    private TextField tfathername;

    @FXML
    private TextField troleId;

    @FXML
    private TextField tlogin;

    @FXML
    private Button exitButton;

    @FXML
    private PasswordField tpassword;

    @FXML
    void saveButtonClicked(ActionEvent event) {

    }
}
