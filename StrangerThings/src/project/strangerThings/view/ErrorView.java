/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

import java.io.PrintWriter;
import strangerthings.StrangerThings;

/**
 *
 * @author Yamisteven23
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = StrangerThings.getOutFile();
    private static final PrintWriter logFile = StrangerThings.getLogFile();
    
    public static void display(String className, String errorMessage){
        
        errorFile.println(
                         "-----------------------------------------------"
                        +"\n- ERROR - " +errorMessage
                        +"\n----------------------------------------------");
   // log error
    logFile.println(className + "-" + errorMessage);
    
    }
    
    
}
