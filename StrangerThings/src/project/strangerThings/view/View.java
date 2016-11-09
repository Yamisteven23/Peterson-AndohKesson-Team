/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

import java.util.Scanner;

/**
 *
 * @author Isaac
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
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
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initalize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.displayMessage);
            
            value = keyboard.nextLine(); //get next line typed by keyboard
            value = value.trim(); //trim off leading and trailing whitespace
            
            if (value.length() < 1){ //value is blank
                System.out.println("\nInvalid value; value cannot be blank");
                continue;
            }
            break; //end the loop
            
        }
        return value; //return the value entered
    }

    
}
