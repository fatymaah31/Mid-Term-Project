/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubric;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
     
     
     public boolean saveStudentData(String filename)
    { boolean flag= false;
        try {
            FileWriter fr = new FileWriter(filename);
            BufferedWriter br = new BufferedWriter(fr);
            
            for(int i = 0 ; i < student.size();i++)
            {
                br.write(student.get(i).getName() + ","+
                        student.get(i).getId() +    ","+
                        student.get(i).getSection()+ ","+
                        student.get(i).getSession()+"\n"
                        
                        
                );
            }
            br.flush();
            br.close();
            fr.close();
            flag= true;
        } catch (Exception ex) {
            flag= false;
        }
        return flag;
        
    }
    
     
     public  void loadStudentData(){
         
     try {
         try (FileReader fr = new FileReader("Student.txt"); BufferedReader br = new BufferedReader(fr)) {
             
             String line= br.readLine();
             
            
            
             while(line != null)
             {
                 
                 AddStudent e = new AddStudent();
                 String[] str = line.split(",");
                 e.setName(str[0]);
                 e.setId(str[1]);
                 e.setSection(str[2]);
                 e.setSession(str[3]);
                 
                 
                         
                
                 student.add(e);
                  line = br.readLine();
                 
             }
             
             
             br.close();
             fr.close();
             
         }
        } catch (IOException ex) {
           
        }
    }
}




