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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fatym
 */
public class ManipulateCLO {
     public List<CLOs> CLO = new ArrayList<CLOs>();
     
     public void addclo(CLOs c)
     {
         CLO.add(c);
     }
     
      public boolean SaveCLOS(String filename)
    { boolean flag= false;
        try {
            FileWriter fr = new FileWriter(filename);
            BufferedWriter br = new BufferedWriter(fr);
            
            for(int i = 0 ; i < CLO.size();i++)
            {
                br.write(CLO.get(i).getCoursetitle() + ","+
                        CLO.get(i).getCoursecode() +    ","+
                        CLO.get(i).getClo()+ ","+
                        CLO.get(i).getClodes()+ ","+
                        CLO.get(i).getPlo()+ "\n"
                        
                        
                        
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
      
      public  boolean loadCLOS(){
         
     try {
         try (FileReader fr = new FileReader("CLO.txt"); BufferedReader br = new BufferedReader(fr)) {
             
             String line= br.readLine();
             
            
            
             while(line != null)
             {
                 
                 CLOs e = new CLOs();
                 String[] str = line.split(",");
                 e.setCoursetitle(str[0]);
                 e.setCoursecode(str[1]);
                 e.setClo(str[2]);
                 e.setClodes(str[3]);
                 e.setPlo(str[4]);
                 
                 
                         
                
                 CLO.add(e);
                  line = br.readLine();
                 
             }
             
             
             br.close();
             fr.close();
             return true;
         }
        } catch (IOException ex) {
           return false;
        }
    }
    
}
