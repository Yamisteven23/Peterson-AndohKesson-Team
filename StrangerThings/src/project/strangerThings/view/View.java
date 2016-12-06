/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import strangerthings.StrangerThings;

/**
 *
 * @author Isaac
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = StrangerThings.getInFile();
    protected final PrintWriter console = StrangerThings.getOutFile();
    
    public View(){
    }

    public View(String message) {
        this.displayMessage = message;
        
    }
     
    @Override
     public void display() {
       boolean done = false;
        do{
        
        String value = this.getInput();
        if (value.toUpperCase().equals("X"))
            return;
        
        done = this.doAction(value);
        } while (!done);
    }
     
     @Override
     public String getInput() {
        
        String value = ""; //value to be returned
        boolean valid = false; //initalize to not valid
        
        try{
            
        while (!valid) {
            this.console.println("\n" + this.displayMessage);
            
            value = this.keyboard.readLine(); //get next line typed by keyboard
            value = value.trim(); //trim off leading and trailing whitespace
            
            if (value.length() < 1){ //value is blank
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid value; value cannot be blank");
                continue;
            }
            break; //end the loop
            
        }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "\n*** Error reading input: " + e.getMessage());
        }
        return value; //return the value entered
    }

    
}
