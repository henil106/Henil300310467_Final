package MVC_Project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class StudentServiceTest {
    @InjectMocks
    private StudentService studentService;

    @Mock
    private Connection connection;

    @Mock
    private PreparedStatement preparedStatement;

    @Mock
    private ConnectionClass connectionClass;

    StudentData studentData = new StudentData("10", "Henil Shah", 100.0);

    @BeforeEach
    public void Setup() throws SQLException, ClassNotFoundException {
        MockitoAnnotations.openMocks(this);
        when(connection.prepareStatement(anyString())).thenReturn(preparedStatement);
        when(connectionClass.connect()).thenReturn(connection);
        studentData = new StudentData("10", "Henil Shah", 100.0);
    }

    @Test
    void add() throws SQLException, ClassNotFoundException {
        when(connection.prepareStatement("INSERT INTO studentrecords VALUES ( ?, ?, ? )")).thenReturn(preparedStatement);
        studentService.add(studentData);
        verify(preparedStatement).executeUpdate();
    }

    @Test
    void delete() throws SQLException, ClassNotFoundException {
        when(connection.prepareStatement("DELETE FROM studentrecords WHERE snumber = ?")).thenReturn(preparedStatement);
        studentService.delete("10");
        verify(preparedStatement).executeUpdate();
    }

    @Test
    void edit() throws SQLException, ClassNotFoundException {
        studentData = new StudentData("10", "Henil Shah", 100.0);
        assertEquals("Henil Shah", studentData.getStudentName());
    }
}