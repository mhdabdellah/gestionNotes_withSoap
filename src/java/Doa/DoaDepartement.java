/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doa;

import Models.Departement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import DBConnection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chouaib
 */
public class DoaDepartement implements Doa<Departement>{
    DBConnection dbconnection;
//    Connection connection;
//    con = connection.conector();
//    Connection connection = null;
//    PreparedStatement ps = null;
//    ResultSet rs = null;
    
    public DoaDepartement(){
        try{
            dbconnection = DBConnection();
//            connection = dbconnection.conector();
        }catch(Exception e){
        }
    }

    @Override
    public Optional<Departement> get(int id) {
        return null;
        
    }

    @Override
    public List<Departement> getall() {
        List<Departement> departements = new ArrayList();
        String requetSql = "select * from departement";
        
     
        Connection connection = dbconnection.conector();
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = connection.prepareStatement(requetSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Departement departement = new Departement(
                        rs.getString(1),
                        rs.getString(2));
                
                departements.add(departement);

            }
            
//            while(rs.next()){
//                Departement departement = new Departement(
//                        rs.getString(1),
//                        rs.getString(2));
//                
//                departements.add(departement);
//            }
            
//            for (Departement departement1 : departements){
//                System.out.println('')
//            }
        } catch (SQLException ex) {
            Logger.getLogger(DoaDepartement.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return departements;
    }

    @Override
    public void save(Departement table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Departement table, String[] args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Departement table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private DBConnection DBConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Departement> get(String id) {
        String requetSql = "select * from departement where coded = "+id+ "" ;
        Connection connection = dbconnection.conector();
        PreparedStatement ps;
        ResultSet rs;
        Departement departement = null ;
        try{
            ps = connection.prepareStatement(requetSql);
            rs = ps.executeQuery();
            if (rs.next()) {
                String coded = rs.getString(1);
                String intitule = rs.getString(2);
                departement = new Departement(
                        coded,
                        intitule);
                departement.toString();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DoaDepartement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Optional.ofNullable(departement);
    }
    
    
    
}
