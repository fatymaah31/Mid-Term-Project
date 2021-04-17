/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubric;

/**
 *
 * @author fatym
 */
public class Rubric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mainmenu Frame1 = new Mainmenu();
        Frame1.setVisible(true);
        
        ManipulateStudents a= ManipulateStudents.getEvent();
        a.loadStudentData();
        
         
        
    }
    
}
