package ru.isu.tashkenova.appSch.viewsModel;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ViewSubject {
    private final SimpleIntegerProperty id;
    private final SimpleIntegerProperty groupNumber;
    private final SimpleStringProperty name;

    public ViewSubject(Integer id, Integer groupNumber, String name) {
        this.id = new SimpleIntegerProperty(id);
        this.groupNumber = new SimpleIntegerProperty(groupNumber);
        this.name = new SimpleStringProperty(name);
    }
    public IntegerProperty idProperty() { return id; }
    public IntegerProperty groupNumberProperty() { return groupNumber; }
    public StringProperty nameProperty() {
        return name;
    }

    public int getId(){
        return id.get();
    }
    public int getGroupNumber(){ return groupNumber.get(); }
    public String getName(){
        return name.get();
    }
}
