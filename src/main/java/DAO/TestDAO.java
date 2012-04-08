/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Main.Reference;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author psaikko
 */
public class TestDAO implements DAO {
    private List<Reference> references = new ArrayList();
    
    @Override
    public void add(Reference r) {
        references.add(r);
    }

    @Override
    public void remove(String name) {
        Reference r = findByName(name);
        if (r != null)
            references.remove(r);
    }

    @Override
    public List<Reference> listAll() {
        return references;
    }

    @Override
    public Reference findByName(String name) {
        for (Reference r : references)
            if (r.name.equals(name))
                return r;
        return null;
    }
    
}
