/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;


import java.util.Scanner;
import project.strangerThings.control.MapControl;

/**
 *
 * @author Isaac
 */
class TheFightView {

    private String displayMessage;
    
    public void displayFightView() {
         
        

        this.displayMessage
                = "\n*****************************************************************"
                + "\n*                                                               *"
                + "\n  You've come face to face with the monster. How many hits do    "
                + "\n  you think you can take?                                        "
                + "\n*****************************************************************";

    }

    private String getAnswer() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initalize to not valid

        while (!valid) {
            System.out.println("\n" + this.displayMessage);

            value = keyboard.nextLine(); //get next line typed by keyboard
            value = value.trim(); //trim off leading and trailing whitespace

            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value; value cannot be blank");
                continue;
            }
            break; //end the loop

        }
        return value; //return the value entered
    }

    void displayFigthView() {

        boolean done = false;
        do {

            String userAnswer = this.getAnswer();
            if (userAnswer.toUpperCase().equals("E")) {
                return;
            }

            done = this.doAction(userAnswer);
        } while (!done);
    }

    private boolean doAction(String userAnswer) {
        long monsterHealth = 70;
        long powerLevel = 40;
        long answer = Long.parseLong(userAnswer);
        long result = MapControl.fightMonster(answer, powerLevel, monsterHealth);

        if (result == 0) {
            System.out.println("\nCongrats! The Locked Opened!"); //Change this eventually
        } else if (result == 2) {
            System.out.println("\nYou put in the number but the lock didn't open!");
            return false;
        } else if (result == -1) {
            System.out.println("\nThis is not a number on a padlock");
            return false;
        } else if (result == -2) {
            System.out.println("\nRandom number 1 is invalid!");
            return false;
        } else if (result == -3) {
            System.out.println("\nRandom number 2 is invalid!");
            return false;
        }

        return true;
    }

}
