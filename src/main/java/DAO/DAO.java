/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Main.Reference;
import java.util.List;
/**
 *
 * @author psaikko
 */
public interface DAO {
    public void add(Reference r);
    public void remove(String name);
    public List<Reference> listAll();
    public Reference findByName(String name);
}
