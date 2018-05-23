package ru.isu.math.zvereva.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class AdmindashboardController {

    @FXML
    private Label l;

    @FXML
    private Button shedule;

    @FXML
    private Button exit;

    @FXML
    void buttonExitClick(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/main.fxml"));
        stage.setTitle("Schedule");
        stage.setScene(new Scene(root, 600, 395));
        stage.show();
        Stage stag = (Stage) exit.getScene().getWindow();
        stag.close();
    }

    @FXML
    void sheduleClick(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/shedule.fxml"));
        stage.setTitle("Shedule");
        stage.setScene(new Scene(root, 1031, 791));
        stage.show();
    }

}
