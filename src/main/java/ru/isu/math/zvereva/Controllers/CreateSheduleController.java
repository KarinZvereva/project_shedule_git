package ru.isu.math.zvereva.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;

public class CreateSheduleController {
    @FXML
    private ComboBox<?> day;

    @FXML
    private Button createScheme;

    @FXML
    private Button deleteScheme;

    @FXML
    private Button changeScheme;

    @FXML
    private TableView<?> scheme;

    @FXML
    void changeSchemeClick(ActionEvent event) {

    }
}
