/***************************************************************************************************
 * Student.java
 * Katie | Katherine O'Connor
 * Create a Student object that has a name, address and gpa.
 * Version 1.0
 *                         Copywrite Notice : 
 * This is intellectualy Property of CSUG & other unlisted parties
 * You do not have the right to read, use, copy, or even have access to this document
 * Unless submitted to you by the author.
 * If this document is not intended for you please stop reading and dispose of immediatly 
 ***************************************************************************************************
 */


package StudentsGrades;

/*
* Student Class
* @ Version 1.0
* @ Katherine O'Connor
*/

public class Student {
    private String Studentname;
    private String address;
    private double GPA;
    
    // Blank Constructor
    Student(){}

    // Overriden Constructor
    Student(String username,String userAddress, double userGPA){
        this.Studentname = username;
        this.GPA = userGPA;
        this.address = userAddress;
    }

    // The setters for this Student Class Shell
    void setName(String userName){
        this.Studentname = userName;
    }
    void setAddress(String userAddress){
        this.address = userAddress;
    }
    void setGPA(double userGPA){
        this.GPA = userGPA;
    }

    // The getters for this Student Class Shell
    String getName(String userName){
        return this.Studentname;
    }
    String getAddress(String userAddress){
        return this.address;
    }
    double getGPA(double userGPA){
        return this.GPA;
    }
    
}
