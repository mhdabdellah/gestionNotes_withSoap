/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author chouaib
 */
public class Notes implements Serializable{
    
    private String codem;
    private int matricule;
    private double note;

    public Notes(String codem, int matricule, double note) {
        this.codem = codem;
        this.matricule = matricule;
        this.note = note;
    }

    public String getCodem() {
        return codem;
    }

    public int getMatricule() {
        return matricule;
    }

    public double getNote() {
        return note;
    }

    public void setCodem(String codem) {
        this.codem = codem;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public void setNote(double note) {
        this.note = note;
    }
    
    
    
}
