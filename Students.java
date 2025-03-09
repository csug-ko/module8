package StudentsGrades;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;
public class Students extends Student {
    LinkedList<Student> studentSheet = new LinkedList<Student>();
Scanner scanner = new Scanner(System.in);
System.out.println("Type Exit when you are finished. /nStart with your first Student's name.");
try{
String isDone = scanner.next();

while(scanner.hasNext() && isDone.toLowerCase()!="exit")
{
    System.out.println("Student's name: ");
    isDone = scanner.next();
    if(isDone.toLowerCase() == "exit")
    {break;}
    else{
    String name = isDone;
    System.out.println("Student's address: ");
    String address = scanner.nextLine();
  
    System.out.println("Student's GPA: ");
    Double GPA = scanner.nextDouble();
    studentSheet.add(new Student(name,address,GPA));
    }
}
SortedSet<String> sortbyName = new TreeSet<String>();
for(Sudent student :studentSheet)
{
    sortbyName(student.getName);
}
}

}
