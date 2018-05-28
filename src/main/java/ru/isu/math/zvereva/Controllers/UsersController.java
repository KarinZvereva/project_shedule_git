package ru.isu.math.zvereva.Controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import retrofit2.Response;
import ru.isu.math.zvereva.RetrofitService;
import ru.isu.math.zvereva.User;
import ru.isu.math.zvereva.UserService;
import ru.isu.math.zvereva.viewsModel.UserView;
import javafx.scene.control.Button;
import java.io.IOException;
import java.util.List;

public class UsersController {


    public static ObservableList<UserView> data = FXCollections.observableArrayList();
    UserService service;

    @FXML
    private TableView<UserView> usersTable = new TableView<>();

    @FXML
    private TableColumn<UserView, String> columnSurname;

    @FXML
    private TableColumn<UserView, String> columnName;

    @FXML
    private TableColumn<UserView, String> columnfatherrname;

    @FXML
    private TableColumn<UserView, Integer> columnRoleId;

    @FXML
    private TableColumn<UserView, String> columnlogin;

    @FXML
    private TableColumn<UserView, String> columnPassword;



    @FXML
    private Button save;


    ObservableList content;

    @FXML
    void initialize() throws IOException {
        columnSurname.setCellValueFactory(celldata -> celldata.getValue().lastnameProperty());
        columnName.setCellValueFactory(celldata -> celldata.getValue().nameProperty());
        columnRoleId.setCellValueFactory(celldata -> celldata.getValue().roleIdProperty().asObject());
        columnfatherrname.setCellValueFactory(celldata -> celldata.getValue().fathernameProperty());
        columnlogin.setCellValueFactory(celldata -> celldata.getValue().loginProperty());
        columnPassword.setCellValueFactory(celldata -> celldata.getValue().passwordProperty());

        Gson gson = new GsonBuilder()
                .setDateFormat("MMM dd, yyyy")
                .create();

        service = RetrofitService.RetrofitBuild();

        Response<List<User>> users = service.getUsers().execute();
        content = FXCollections.observableArrayList(
                users.body()
        );
        for (User w: users.body()) {
            User user = gson.fromJson(gson.toJson(w), User.class);
            data.add(new UserView(user.getName(), user.getSurname(),
                    user.getFathername(), user.getLogin(), user.getRoleId(), user.getId(), user.getPassword()));
        }
        usersTable.setItems(data);

        usersTable.setOnMouseClicked(new ListViewHandler(){
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                UserView user = usersTable.getSelectionModel().getSelectedItem();
            }
        });



    }

    @FXML
    void deleteButtonClicked(ActionEvent event) throws IOException {
        UserView user = usersTable.getSelectionModel().getSelectedItem();
        service.deleteUser(user.getId()).execute();
        data.remove(usersTable.getSelectionModel().getSelectedIndex());
        usersTable.refresh();
        //Вызов refresh() заставляет элемент управления TableView воссоздать и повторно заполнить ячейки, необходимые для заполнения визуальных границ контроль.
        // Другими словами, это заставляет TableView обновлять то, что он показывается пользователю. Это полезно в тех случаях, когда источник данных изменился таким образом, который не наблюдается в TableView сам по себе.
    }

    @FXML
    void saveButtonClicked(ActionEvent event) throws IOException {
        Stage stag = (Stage) save.getScene().getWindow();
        stag.close();
    }

    @FXML
    void addButtonClicked(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/add_user.fxml"));
        stage.setTitle("Add user");
        stage.setScene(new Scene(root, 403, 465));
        stage.show();
        usersTable.refresh();
    }

    @FXML
    void tableClicked(MouseEvent event) {

    }

    @FXML
    void changeButtonClicked(ActionEvent event) throws IOException {
        UserView user = usersTable.getSelectionModel().getSelectedItem();
        Stage stage_add = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("views/change_user.fxml"));
        Parent root_add = fxmlLoader.load();
        ChangeUserController c = fxmlLoader.getController();
        c.setUserv(user, usersTable.getSelectionModel().getSelectedIndex());
        stage_add.setTitle("Изменить пользователя");
        stage_add.setScene(new Scene(root_add, 456, 439));
        stage_add.show();

        usersTable.refresh();
    }

    class ListViewHandler implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent event) {
            //this method will be overrided in next step
        }
    }
}
