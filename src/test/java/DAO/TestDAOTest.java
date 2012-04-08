/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Main.Reference;
import java.util.List;
import junit.framework.TestCase;
import junit.framework.Assert;

/**
 *
 * @author psaikko
 */
public class TestDAOTest extends TestCase {
    
    public TestDAOTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of add method, of class TestDAO.
     */
    public void testAddAndList() {
        Reference r = new Reference("test", null, null);
        TestDAO t = new TestDAO();
        t.add(r);
        List<Reference> rs = t.listAll();
        assert(rs.contains(r));
    }

    /**
     * Test of remove method, of class TestDAO.
     */
    public void testRemove() {
        Reference r = new Reference("test", null, null);
        Reference r2 = new Reference("test2", null, null);
        TestDAO t = new TestDAO();
        t.add(r);
        t.add(r2);
        List<Reference> rs = t.listAll();
        assert(rs.contains(r) && rs.contains(r2));
        t.remove("test2");
        rs = t.listAll();
        assert(rs.contains(r) && !rs.contains(r2));
    }

    /**
     * Test of findByName method, of class TestDAO.
     */
    public void testFindByName() {
        Reference r = new Reference("test", null, null);
        TestDAO t = new TestDAO();
        t.add(r);
        assert(t.findByName("test") == r);
    }
}
