/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

import java.util.Scanner;
import project.strangerThings.control.GameControl;
import project.strangerThings.model.Player;

/**
 *
 * @author Yamisteven23
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
        "\n**************************************************************"
       +"\n*                                                            *"
       +"\nStranger Things! is a text based role playing "
       +"\ngame from the events in the Netflix original "
       +"\nseries Stranger Things. You will be taking the "
       +"\nrole of 3 children named Mike, Lucas, and Dustin. "
       +"\nOne of thier friends went missing and Mike, Lucas "
       +"\nand Dustin suspect foul play. While investigating "
       +"\nthey cross paths with another child named Eleven who "
       +"\nhas telekinesis powers. She helps Mike, Lucas, and "
       +"\nDustin discover that their friend was taken by a monster! "
       +"\nThey will have to devise a rescue plan to find a way "
       +"\nto defeat the monster while avoiding the government "
       +"\nand the Sheriff. While on your journey you lost Eleven, "
       +"\nbut are still looking for the required items to defeat "
       +"\nthe monster. If the government finds you then you will "
       +"\nbe taken. If the local sheriff finds you then he will "
       +"\nsend you home. As you explore the map you will search "
       +"\nfor the required items to build your master weapon. In "
       +"\nthis game you will start your journey with a flashlight, "
       +"\na shovel, and a backpack. You will move as a team in order "
       +"\nto accomplish your goal of defeating the monster. Throughout "
       +"\nthe map there will be items placed that you can find in order "
       +"\nto make your master weapon. The route you take and rhe weapon "
       +"\nyou make is up to you."
       +"\n*                                                            *"
       +"\n**************************************************************"
        
       /**/
        
        );
    }

    public void displayStartProgramView() {
        
        boolean done = false;
        do{
            String playerName = this.getPlayerName();
            if (playerName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(playerName);
        } while (!done);
    }

    private String getPlayerName() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initalize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //get next line typed by keyboard
            value = value.trim(); //trim off leading and trailing whitespace
            
            if (value.length() < 1){ //value is blank
                System.out.println("\nINvalid value; value cannot be blank");
                continue;
            }
            break; //end the loop
            
        }
        return value; //return the value entered
    }

    private boolean doAction(String playerName) {
        if (playerName.length() < 2){
            System.out.println("\nInvalid player name;"
                + "The name must be greater than one character in length");
            return false;
        
        }
        //call createPlayer() control function
        Player player = GameControl.createPlayer(playerName);
        
        if (player == null){ //if unseccessful
            System.out.println("\nError creating the player.");
            return false;
        }
        //display next view
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println("\n==============================================="
                          +"\n Welcome to Stanger Things! " +player.getName()
                          +"\n We wish you luck!"
                          +"\n==============================================="
                          );
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.displayMainMenuView();
        
    }
    
    
}
