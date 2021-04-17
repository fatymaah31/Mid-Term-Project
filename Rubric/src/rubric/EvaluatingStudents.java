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
public class EvaluatingStudents {
    private String asseno;
    private String closno;
    private String regno;
    public List<Double> evaluationMarks = new ArrayList<Double>();

    /**
     * @return the asseno
     */
    public String getAsseno() {
        return asseno;
    }

    /**
     * @param asseno the asseno to set
     */
    public void setAsseno(String asseno) {
        this.asseno = asseno;
    }

    /**
     * @return the closno
     */
    public String getClosno() {
        return closno;
    }

    /**
     * @param closno the closno to set
     */
    public void setClosno(String closno) {
        this.closno = closno;
    }

    /**
     * @return the regno
     */
    public String getRegno() {
        return regno;
    }

    /**
     * @param regno the regno to set
     */
    public void setRegno(String regno) {
        this.regno = regno;
    }
    
    
}
