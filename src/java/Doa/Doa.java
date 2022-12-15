/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doa;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author chouaib
 * @param <Table>
 */
public interface Doa<Table> {
    
    Optional<Table> get(int id);
    Optional<Table> get(String id);
    
    List<Table> getall();
    
    void save(Table table);
    void update(Table table, String[] args);
    void delete(Table table);
    
}
