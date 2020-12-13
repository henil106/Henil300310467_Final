package MVC_Project;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentInterface {

    //defining all the method declarations for the class which will implement this interface
    ArrayList<StudentData> display() throws SQLException;
    void add(StudentData studentData) throws SQLException, ClassNotFoundException;
    void delete(String sno) throws SQLException, ClassNotFoundException;
    StudentData update(StudentData studentData, String sno) throws SQLException, ClassNotFoundException;

}
