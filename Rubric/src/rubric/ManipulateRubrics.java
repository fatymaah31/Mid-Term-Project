/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubric;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fatym
 */
public class ManipulateRubrics {
    public List<Rubrics> Rubriclist = new ArrayList<Rubrics>();
    
    public void Rubricadd(Rubrics r)
    {
        Rubriclist.add(r);
    }
    
}
