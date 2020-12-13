package MVC_Project;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;

public class StudentController {

    //StudentService studentService = new StudentService();

    //defining route for the default landing of the page which displays student details
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showStudentRecordsPage(ModelMap modelMap) throws SQLException {
        //modelMap.addAttribute("datas", studentService.display());
        return "studentRecords";
    }

    //defining route for the adding of a new student data by the user
    @RequestMapping(value = "/add-new-record", method = RequestMethod.GET)
    public String showAddPage() {
        return "addStudentRecord";
    }

}

