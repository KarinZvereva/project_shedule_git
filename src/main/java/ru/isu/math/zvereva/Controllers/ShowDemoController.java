package ru.isu.math.zvereva.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class ShowDemoController {

    @FXML
    private Button exit;

    @FXML
    private TabPane sheduleWeek;

    @FXML
    void buttonExitClick(ActionEvent event) {
        Stage stag = (Stage) exit.getScene().getWindow();
        stag.close();
    }
}
