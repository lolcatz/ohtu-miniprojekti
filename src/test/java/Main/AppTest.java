/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import junit.framework.TestCase;
import junit.framework.Assert.*;
import IO.TestIO;

/**
 *
 * @author psaikko
 */
public class AppTest extends TestCase {

    public AppTest(String testName) {
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

    public void testWelcomeMessage() {
        TestIO io = new TestIO();
        App tester = new App(io);
        tester.run();
        assert(io.getOutputs().contains(App.welcomeMessage));
    }

    public void testInputPrompt() {
        TestIO io = new TestIO();
        App tester = new App(io);
        tester.run();
        assert(io.getOutputs().contains(App.inputPrompt));
    }
    
    public void testBadInput() {
        TestIO io = new TestIO("this is not a valid command");
        App tester = new App(io);
        tester.run();
        assert(io.getOutputs().contains(App.badInput));
    }
}
