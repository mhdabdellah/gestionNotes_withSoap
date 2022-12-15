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
public class Etudiant implements Serializable{
    
    private int matricule;
    private String nom;
    private String prenom;
    private String coded;

    public Etudiant(int matricule, String nom, String prenom, String coded) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.coded = coded;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCoded(String coded) {
        this.coded = coded;
    }

    public int getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCoded() {
        return coded;
    }
    
    
    
}
