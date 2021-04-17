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
    public List<String> Rubric1= new ArrayList<String>();
    public List<String> Rubric2= new ArrayList<String>();
    public List<String> Rubric3= new ArrayList<String>();
    public List<String> Rubric4= new ArrayList<String>();

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

    
    
    
}
