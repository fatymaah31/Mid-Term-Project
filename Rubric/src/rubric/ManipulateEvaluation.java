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
public class ManipulateEvaluation {
    public List<EvaluatingStudents> markslist=new ArrayList<EvaluatingStudents>();
    public void addmarks(EvaluatingStudents e)
    {
        markslist.add(e);
    }
}
