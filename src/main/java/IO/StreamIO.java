/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author psaikko
 */
public class StreamIO implements IO{
    private PrintStream ps;
    private Scanner sc;
    
    public StreamIO(InputStream is, PrintStream ps) {
        this.ps = ps;
        this.sc = new Scanner(is);
    }
    
    @Override
    public String getLine() {
        return sc.nextLine();
    }
    
    @Override
    public void printLine(String s) {
        ps.println(s);
    }
    
    @Override
    public void print(String s) {
        ps.print(s);
    }
}
