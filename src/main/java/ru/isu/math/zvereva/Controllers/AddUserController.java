package ru.isu.math.zvereva.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ru.isu.math.zvereva.RetrofitService;
import ru.isu.math.zvereva.User;
import ru.isu.math.zvereva.UserView;

import java.io.IOException;

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
    private Button save;

    @FXML
    private PasswordField tpassword;

    User user = new User();

    @FXML
    void saveButtonClicked(ActionEvent event) throws IOException {
        String user_name = tname.getText();
        String user_surname = tsurname.getText();
        String user_fathername = tfathername.getText();
        int user_roleId = -1;
        try {
            user_roleId = Integer.parseInt(troleId.getText());
        }

        catch (Exception e) {
            user_roleId = -1;
        }

        String user_login = tlogin.getText();
        String user_password = tpassword.getText();

        user = new User(0,user_roleId,user_name,user_surname,
                user_fathername, user_login, user_password, 1);


        RetrofitService.RetrofitBuild().addUser(user).execute();
        UsersController.data.add(new UserView(user.getName(), user.getSurname(),
                user.getFathername(), user.getLogin(), user.getRoleId(), user.getId(), user.getPassword()));

        Stage stag = (Stage) save.getScene().getWindow();
        stag.close();
    }
}
