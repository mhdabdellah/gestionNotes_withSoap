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
public class Departement implements Serializable {
    
    private String coded;
    private String intitule;

    public Departement(String coded, String intitule) {
        this.coded = coded;
        this.intitule = intitule;
    }

    

    public String getCoded() {
        return coded;
    }

    public String getIntitule() {
        return intitule;
    }

    

    public void setCoded(String coded) {
        this.coded = coded;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    @Override
    public String toString() {
        return "Departement{" + "coded=" + coded + ", intitule=" + intitule + '}';
    }
    
    
    
}
