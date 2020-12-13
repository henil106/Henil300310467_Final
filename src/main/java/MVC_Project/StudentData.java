package MVC_Project;

public class StudentData {

    //private member attributes
    private String studentNumber = "";
    private String studentName = "";
    private Double studentGPA = 0.0;

    //parameterized constructor
    public StudentData(String studentNumber, String studentName, Double studentGPA) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.studentGPA = studentGPA;
    }

    //getters and setters
    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Double getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(Double studentGPA) {
        this.studentGPA = studentGPA;
    }

}
