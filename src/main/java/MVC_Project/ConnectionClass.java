package MVC_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ConnectionClass {

    //connect method for connecting the application to the database
    public Connection connect() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");

        return connection;
    }
}