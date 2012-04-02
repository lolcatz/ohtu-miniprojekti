package Main;

import IO.StreamIO;
import IO.IO;

/**
 *
 */
public class App 
{
    static String welcomeMessage = "Hello good user, welcome to the lolcats ohtu-miniproject";
    static String inputPrompt = "> ";
    static String badInput = "Unrecognized command..";
    
    private IO io;
    
    public App(IO io) {
        this.io = io;
    }
    
    public void run() {
        io.printLine(welcomeMessage);
        while (true) {
            io.print(inputPrompt);
            String input = io.getLine().toLowerCase();
            
            if (input.isEmpty() || input.equals("exit"))
                break;
            
            else 
                io.printLine(badInput);
            
        }
    }
    
    public static void main( String[] args ) {
        App app = new App(new StreamIO(System.in, System.out));
        app.run();
    }
}
