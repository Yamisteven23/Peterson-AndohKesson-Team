/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

import java.util.Scanner;
import project.strangerThings.control.GameControl;
import strangerthings.StrangerThings;

/**
 *
 * @author Yamisteven23
 */
public class MainMenuView {
    private String menu;

   public void displayMainMenuView() {
        
        boolean done = false;
        do{
        
        String menuOption = this.getMenuOption();
        if (menuOption.toUpperCase().equals("E"))
            return;
        
        done = this.doAction(menuOption);
        } while (!done);
    }

    public MainMenuView() {
        this.menu = "\n"
                    +"\n----------------------------------"
                    +"\n|         Main Menu              |"
                    +"\n----------------------------------"
                    +"\nN- New Game"
                    +"\nR- Restore existing game"
                    +"\nH- Help Menu"
                    +"\nE- Exit Game"
                    +"\n----------------------------------";
    }

   private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initalize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
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

    private boolean doAction(String menuOption) {
       String choice = menuOption.toUpperCase();
        
        switch (choice){
            case "N": //create new game
                this.startNewGame();
                break;
            case "R": //restore existing game
                this.restoreExistingGame();
                break;
            case "H": //Help Menu
                this.helpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Please Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(StrangerThings.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void restoreExistingGame() {
        System.out.println("\n*** restoreExistingGame called ***");
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }
    
}
