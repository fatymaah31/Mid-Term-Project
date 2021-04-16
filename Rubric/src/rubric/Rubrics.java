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
public class Rubrics {
    private String CLONO;
    private String assno;
    private List<String> Rubric1= new ArrayList<String>();
    private List<String> Rubric2= new ArrayList<String>();
    private List<String> Rubric3= new ArrayList<String>();
    private List<String> Rubric4= new ArrayList<String>();

    /**
     * @return the CLONO
     */
    public String getCLONO() {
        return CLONO;
    }

    /**
     * @param CLONO the CLONO to set
     */
    public void setCLONO(String CLONO) {
        this.CLONO = CLONO;
    }

    /**
     * @return the assno
     */
    public String getAssno() {
        return assno;
    }

    /**
     * @param assno the assno to set
     */
    public void setAssno(String assno) {
        this.assno = assno;
    }

    /**
     * @return the Rubric1
     */
    public List<String> getRubric1() {
        return Rubric1;
    }

    /**
     * @param Rubric1 the Rubric1 to set
     */
    public void setRubric1(String s) {
        Rubric1.add(s);
    }

    /**
     * @return the Rubric2
     */
    public List<String> getRubric2() {
        return Rubric2;
    }

    /**
     * @param Rubric2 the Rubric2 to set
     */
    public void setRubric2(List<String> Rubric2) {
        this.Rubric2 = Rubric2;
    }

    /**
     * @return the Rubric3
     */
    public List<String> getRubric3() {
        return Rubric3;
    }

    /**
     * @param Rubric3 the Rubric3 to set
     */
    public void setRubric3(List<String> Rubric3) {
        this.Rubric3 = Rubric3;
    }

    /**
     * @return the Rubric4
     */
    public List<String> getRubric4() {
        return Rubric4;
    }

    /**
     * @param Rubric4 the Rubric4 to set
     */
    public void setRubric4(List<String> Rubric4) {
        this.Rubric4 = Rubric4;
    }
    
    
}
