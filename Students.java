/***************************************************************************************************
 * Students.java
 * Katie | Katherine O'Connor
 * Students Class Extends the Student Class Object
 * Version 1.0
 *                         Copywrite Notice : 
 * This is intellectualy Property of CSUG & other unlisted parties
 * You do not have the right to read, use, copy, or even have access to this document
 * Unless submitted to you by the author.
 * If this document is not intended for you please stop reading and dispose of immediatly 
 *************************************************************************************************
 */

package StudentsGrades;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;
import java.io.IOException;

public class Students extends Student {

    LinkedList<Student> studentSheet = new LinkedList<Student>();   // unsorted 
    LinkedList<Student> ASORTstudentSheet = new LinkedList<Student>();  // sorted

    Students() throws IOException {
        
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Type exit when you are finished. And press enter."); 
        System.out.println("Start with your first Student's name. And press enter.");
        System.out.println("Then the student's address. And press enter.");
        System.out.println("Then type the GPA in format 0.00. And press enter.");
        
        try {
            int cont = 1;
            String name;
            String address;
            Double GPA;
            
            // loop for creating and adding students to the linked list
            while(cont == 1 ) {
                System.out.print("Student's name: ");
                name = scanner.nextLine();
                System.out.print("Student's GPA: ");
                GPA = Double.parseDouble(scanner.nextLine());
                System.out.print("Student's address: ");
                address = scanner.nextLine();
                studentSheet.add(new Student(name,address,GPA));
                System.out.println("Would you like to add another?");
                System.out.print("1 for yes & 0 for no : ");
                cont = Integer.parseInt(scanner.nextLine());
            }
            
            // sort the student names in ascending order 
            // Treeset defaults to sort in ascending order 
            SortedSet<String> sortbyName = new TreeSet<String>();
            for(Student student :this.studentSheet) {
                sortbyName.add(student.getName());
            }
            
            // using the ascending sorted Treeset create a Sorted LinkedList by looping through and finding the objects
            for(String sname:sortbyName) {
                for(int i = 0; i < studentSheet.size();i++) {   
                    Student newStud = studentSheet.get(i);
                    if(sname == newStud.getName()) {
                        ASORTstudentSheet.add(studentSheet.get(i));
                        break;
                    }
                }
            }
        } // end of try block
        finally {
            scanner.close();
        }
        // take the sorted linked list to the file stream for output
        ioFileStreams ioFS = new ioFileStreams(ASORTstudentSheet);
    }
 }

