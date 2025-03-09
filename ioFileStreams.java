/***************************************************************************************************
 * <ioFileStreams.java>
 * <Katie | Katherine O'Connor>
 * <Take input Streams and output to a File>
 * <Version 1.0>
 *                         Copywrite Notice : 
 * This is intellectualy Property of CSUG & other unlisted parties
 * You do not have the right to read, use, copy, or even have access to this document
 * Unless submitted to you by the author.
 * If this document is not intended for you please stop reading and dispose of immediatly 
 * 
 * <This file gets input objects and outputs them to a File>
 * 
 *************************************************************************************************
 */

package StudentsGrades;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public class ioFileStreams 
{
    FileInputStream iFile = null;
    FileOutputStream oFile = null;
    LinkedList<Student> GenericLinkedList= null;

    // constructor to get the input file from a different class file
    ioFileStreams(FileInputStream inFile)
    {
        setIFile(inFile);
        //IFile2OFile ();
    }
    // constructor to get the input of LinkedList to output to a file
    ioFileStreams(LinkedList<Student> inLinkedList) throws IOException
    {
        setLinkedList(inLinkedList);
        ILinkedList2OFile (inLinkedList);
    }

    // Input File set / get methods
    void setIFile(FileInputStream inFile)
    {
        this.iFile = inFile;
    }
    FileInputStream getIFile()
    {
        return this.iFile;
    }

    // Output File set / get methods
    void setOFile(FileOutputStream OutFile)
    {
        this.oFile = OutFile;
    }
    FileOutputStream getOFile()
    {
        return this.oFile;
    }

    // Input Linked List set / get methods
    void setLinkedList(LinkedList<Student> iLinkedList)
    {
        this.GenericLinkedList = iLinkedList;
    }
    LinkedList<Student> getILinkedList()
    {
        return this.GenericLinkedList;
    }

    // Input File  to Output file
    void IFile2OFile ()throws IOException{
    {
        try{
            oFile = new FileOutputStream("StudentGrades.txt");
   
            while(this.getIFile().read() != -1)
            {
                this.getOFile().write(this.iFile.read());
            }
        }
        finally
        {
            if(this.getIFile()!=null)
            {
                this.getIFile().close();
            }
            if(this.getOFile()!= null)
            {
                this.getOFile().close();
            }
        }
    }
}

    // LinkedList to Output file
    void ILinkedList2OFile (LinkedList<Student> linkedlist) throws IOException{
            PrintWriter outFileWriter = null;
        try{
            outFileWriter = new PrintWriter(new FileWriter("StudentsGPA.txt"));
            Iterator<Student> LinkedListIterator = linkedlist.iterator();
            while(LinkedListIterator.hasNext())
            {
                outFileWriter.println(LinkedListIterator.next().getStudentContents());
            }
                System.out.println("Saving to a new document named StudentsGPA");
                outFileWriter.close();
            
        }
       catch(IOException e)
       {
            System.err.println(e.getMessage());
       }
  
    }
}

