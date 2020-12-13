package MVC_Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentService implements StudentInterface {

    public StudentService() {
    }

    //constructor for the StudentService class
    public StudentService(Connection con) {
        this.connection = con;
    }

    //creating a connection object
    public Connection connection;

    //getter and setter for connection object
    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection con) {
        this.connection = con;
    }

    //overriding the display method
    @Override
    public ArrayList<StudentData> display() throws SQLException {

        //query
        String query = "SELECT * FROM studentrecord";

        //prepared statement
        PreparedStatement pstmt = connection.prepareStatement(query);

        //empty object
        StudentData studentData;

        //defining the result set
        ResultSet rs = pstmt.executeQuery();

        //empty ArrayList
        ArrayList<StudentData> studentList = new ArrayList<>();

        while (rs.next()) {
            //storing all student data one by one into objects of StudentData class
            studentData = new StudentData(rs.getString("snumber"), rs.getString("sname"), rs.getDouble("gpa"));
            studentList.add(studentData);
        }

        //returning the list
        return studentList;

    }

    //overriding the add method
    @Override
    public void add(StudentData studentData) throws SQLException, ClassNotFoundException {

        //query
        String query = "INSERT INTO studentrecord VALUES ( ?, ?, ? )";

        //prepared statement
        PreparedStatement pstmt = connection.prepareStatement(query);

        //setting the strings with the prepared statement
        pstmt.setString(1, studentData.getStudentNumber());
        pstmt.setString(2, studentData.getStudentName());
        pstmt.setString(3, String.valueOf(studentData.getStudentGPA()));

        //executing
        pstmt.executeUpdate();

    }

    //overriding the delete method
    @Override
    public void delete(String sno) throws SQLException, ClassNotFoundException {

        //query
        String query = "DELETE FROM studentrecord WHERE snumber=?";

        //prepared statement
        PreparedStatement pstmt = connection.prepareStatement(query);

        //setting the strings with the prepared statement
        pstmt.setString(1, sno);

        //executing
        pstmt.executeUpdate();

    }

    //overriding the update method
    @Override
    public StudentData update(StudentData studentData, String sno) throws SQLException, ClassNotFoundException {

        //query
        String query = "UPDATE studentrecord SET snumber=?, sname=?, gpa=? WHERE snumber=?";

        //prepared statement
        PreparedStatement pstmt = connection.prepareStatement(query);

        //setting the strings with the prepared statement
        pstmt.setString(1, studentData.getStudentNumber());
        pstmt.setString(2, studentData.getStudentName());
        pstmt.setString(3, String.valueOf(studentData.getStudentGPA()));
        pstmt.setString(4, sno);

        //executing
        pstmt.executeUpdate();

        return studentData;

    }

}
