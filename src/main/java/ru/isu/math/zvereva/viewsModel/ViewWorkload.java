package ru.isu.math.zvereva.viewsModel;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class ViewWorkload {
    private final SimpleIntegerProperty id;
    private final SimpleIntegerProperty studentClassId;
    private final SimpleIntegerProperty subjectId;
    private final SimpleIntegerProperty userId;

    public ViewWorkload(Integer id, Integer studentClassId, Integer subjectId, Integer userId) {
        this.id = new SimpleIntegerProperty(id);
        this.studentClassId = new SimpleIntegerProperty(studentClassId);
        this.subjectId = new SimpleIntegerProperty(subjectId);
        this.userId = new SimpleIntegerProperty(userId);
    }
    public IntegerProperty idProperty() { return id; }
    public IntegerProperty studentClassIdProperty() { return studentClassId; }
    public IntegerProperty subjectIdProperty() { return subjectId; }
    public IntegerProperty userIdProperty() { return userId; }

    public int getId(){
        return id.get();
    }
    public int getStudentClassId(){
        return studentClassId.get();
    }
    public int getSubjectId(){
        return subjectId.get();
    }
    public int getUserId(){
        return userId.get();
    }
}
