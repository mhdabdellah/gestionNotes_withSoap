/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Doa.DoaDepartement;
import Models.Departement;
import java.util.List;
import java.util.Optional;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author chouaib
 */
@WebService(serviceName = "seviceDepartement")
public class seviceDepartement {
    
    DoaDepartement doaDepartement = new DoaDepartement();

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "getAll")
    public List<Departement> getAll(){
        List<Departement> departements;
        try{
            departements = doaDepartement.getall();
            return departements;
        }catch(Exception e){
            return null;
        }  
    }
    
    @WebMethod(operationName = "getById")
    public Optional<Departement> getById(String coded){
        Optional<Departement> departement;
        try{
            departement = doaDepartement.get(coded);
            return departement;
        }catch(Exception e){
            return null;
        }
    }
}
