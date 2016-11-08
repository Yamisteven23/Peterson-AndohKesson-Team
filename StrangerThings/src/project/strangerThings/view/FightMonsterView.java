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
public class FightMonsterView {

    private String displayMessage;

    public FightMonsterView() {
        this.displayMessage
                = "\n*****************************************************************"
                + "\n*                                                               *"
                + "\n* YOU HAVE COME ACROSS THE MONSTER! Do You Want to Run or Fight *"
                + "\n*****************************************************************"
                + "\n*********************************************"
                + "\n*                                           *"
                + "\n*                R-Run                      *"
                + "\n*                F-Fight                    *"
                + "\n*                                           *"
                + "\n*********************************************";

    }

    public String getMenuOption() {
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

    private boolean doAction(String menuOption) {
        if (menuOption.toUpperCase().equals("F")) {
            TheFightView viewFight = new TheFightView();
            viewFight.displayFightView();
        }

        else if(menuOption.toUpperCase().equals("R")){
              TheRunFromMonsterView viewMonster = new TheRunFromMonsterView();
              viewMonster.displayTheRunFromMonsterView();
                }

        return true;

    }

    

}
