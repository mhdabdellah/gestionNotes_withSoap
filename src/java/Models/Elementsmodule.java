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
public class Elementsmodule implements Serializable{
    
    private String codem;
    private String titre;
    private int credit;
    private int coefficient;

    public Elementsmodule(String codem, String titre, int credit, int coefficient) {
        this.codem = codem;
        this.titre = titre;
        this.credit = credit;
        this.coefficient = coefficient;
    }


    public String getCodem() {
        return codem;
    }

    public String getTitre() {
        return titre;
    }

    public int getCredit() {
        return credit;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCodem(String codem) {
        this.codem = codem;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }
    
    
    
    
}
