/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.util.ArrayList;

/**
 *
 * @author psaikko
 */
public class TestIO implements IO{
    private String[] inputs;
    private int inputIndex = 0;
    private ArrayList<String> outputs;
    
    public TestIO(String... inputs) {
        this.inputs = inputs;
        this.outputs = new ArrayList<String>();
    }
    
    @Override
    public String getLine() {
        if (inputIndex < inputs.length)
            return inputs[inputIndex++];
        else 
            return "";
    }
    
    @Override
    public void printLine(String s) {
        outputs.add(s);
    }
    
    @Override
    public void print(String s) {
        outputs.add(s);
    }
    
    public ArrayList<String> getOutputs() {
        return outputs;
    }
}
