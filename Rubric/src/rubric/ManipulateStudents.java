/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubric;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author fatym
 */
public class ManipulateStudents {
    
    static ManipulateStudents data= new ManipulateStudents();
    static ManipulateStudents  event;
    public List<AddStudent>student= new ArrayList<>();
    private ManipulateStudents()
    {
        student= new ArrayList<AddStudent>();
    }
     public static ManipulateStudents getEvent(){
        if(event==null)
        {
            event = new ManipulateStudents();
        }
        
        return event;
    }
     
     
     //Add Student
     
     public void addStudent(AddStudent a)
     {
         student.add(a);
     }
     
     
     public void updateStudent(AddStudent c, int rowcheck)
   {
       student.set(rowcheck,c);
       
   }
     
     public void deleteStudent(int rowcheck)
     {
         student.remove(rowcheck);
     }
    
}




