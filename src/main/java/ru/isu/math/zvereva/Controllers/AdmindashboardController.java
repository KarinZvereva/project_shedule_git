package ru.isu.math.zvereva.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class AdmindashboardController {

    @FXML
    private Label l;

    @FXML
    private Button shedule;

    @FXML
    private Button exit;

    @FXML
    private Button classroom;

    @FXML
    private Button subject;

    @FXML
    private Button users;

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
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.width;
        double height = screenSize.getHeight();
        stage.setScene(new Scene(root, width-10, height-80));
        stage.show();
    }


    @FXML
    void classroomClick(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/classes.fxml"));
        stage.setTitle("Classes");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.width;
        double height = screenSize.getHeight();
        stage.setScene(new Scene(root, width-1, height-80));
        stage.show();
    }

    @FXML
    void subjectClick(ActionEvent event) {

    }

    @FXML
    void usersClick(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/users.fxml"));
        stage.setTitle("Classes");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.width;
        double height = screenSize.getHeight();
        stage.setScene(new Scene(root, width-1, height-80));
        stage.show();
    }
    @FXML
    void deleteButtonClicked(ActionEvent event) {

    }

    @FXML
    void addButtonClicked(ActionEvent event) {

    }

    @FXML
    void saveButtonClicked(ActionEvent event) {

    }

}
