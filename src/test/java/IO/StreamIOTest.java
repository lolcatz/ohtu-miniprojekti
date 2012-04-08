/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import junit.framework.TestCase;
import junit.framework.Assert.*;
import java.io.*;

/**
 *
 * @author psaikko
 */
public class StreamIOTest extends TestCase {
    
    public StreamIOTest(String testName) {
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
     * Test of getLine method, of class StreamIO.
     */
    public void testGetLine() {
        String input = "hello";
        InputStream is = new ByteArrayInputStream(input.getBytes());
        StreamIO io = new StreamIO(is, null);
        assertEquals(io.getLine(), input);
    }
    
    public void testGetManyLines() {
        String input = "line1\nline2\nline3";
        InputStream is = new ByteArrayInputStream(input.getBytes());
        StreamIO io = new StreamIO(is, null);
        assertEquals(io.getLine(), "line1");
        assertEquals(io.getLine(), "line2");
        assertEquals(io.getLine(), "line3");
    }  

    /**
     * Test of printLine method, of class StreamIO.
     */
    public void testPrintLine() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        StreamIO io = new StreamIO(System.in, ps);
        io.printLine("hello");
        assertEquals(baos.toString(), "hello\n");
    }

    public void testPrintManyLines() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        StreamIO io = new StreamIO(System.in, ps);
        io.printLine("line1");
        io.printLine("line2");
        io.printLine("line3");
        assertEquals(baos.toString(), "line1\nline2\nline3\n");
    }
       
    /**
     * Test of print method, of class StreamIO.
     */
    public void testPrint() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        StreamIO io = new StreamIO(System.in, ps);
        io.print("hello");
        assertEquals(baos.toString(), "hello");
    }
}
