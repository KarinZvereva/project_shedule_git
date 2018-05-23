package ru.isu.math.zvereva.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SheduleController {

    @FXML
    private Button createShedule;

    @FXML
    void createSheduleClick(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/createShedule.fxml"));
        stage.setTitle("Create shedule");
        stage.setScene(new Scene(root, 1031, 791));
        stage.show();
    }
}
