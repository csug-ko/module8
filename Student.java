package StudentsGrades;

public class Student {
    private String Studentname;
    private String address;
    private double GPA;
    
    // Blank Constructor
    Student(){}

    // Overriden Constructor
    Student(String username,String userAddress, double userGPA)
    {this.Studentname = username;this.GPA = userGPA;this.address = userAddress;}

    // The setters for this Student Object Shell
    void setName(String userName){this.Studentname = userName;}
    void setAddress(String userAddress){this.address = userAddress;}
    void setGPA(double userGPA){this.GPA = userGPA;}

    // The getters for this Student Object Shell
    String getName(String userName){return this.Studentname;}
    String getAddress(String userAddress){return this.address;}
    double getGPA(double userGPA){return this.GPA;}
    
}
