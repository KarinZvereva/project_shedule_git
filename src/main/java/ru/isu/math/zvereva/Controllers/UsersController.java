package ru.isu.math.zvereva.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class UsersController {
    @FXML
    void deleteButtonClicked(ActionEvent event) {

    }

    @FXML
    void saveButtonClicked(ActionEvent event) {

    }

    @FXML
    void addButtonClicked(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/add_user.fxml"));
        stage.setTitle("Add user");
        stage.setScene(new Scene(root, 403, 381));
        stage.show();
    }

    @FXML
    void tableClicked(MouseEvent event) {

    }
}
