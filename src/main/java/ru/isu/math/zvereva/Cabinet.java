package ru.isu.math.zvereva;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;


public class Cabinet {
    public int id;
    public String name;

    public Cabinet(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }


}
