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
public class Manipulator {
    
    static Manipulator data= new Manipulator();
    static Manipulator  event;
    public List<AddStudent>student= new ArrayList<>();
    private Manipulator()
    {
        student= new ArrayList<AddStudent>();
    }
     public static Manipulator getEvent(){
        if(event==null)
        {
            event = new Manipulator();
        }
        
        return event;
    }
     
     
     //Add Student
     
     public void addStudent(AddStudent a)
     {
         student.add(a);
     }
    
}




