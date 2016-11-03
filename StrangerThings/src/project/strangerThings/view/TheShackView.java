/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

import java.util.Scanner;

/**
 *
 * @author Yamisteven23
 */
public class TheShackView {

    private String displayMessage;

    public TheShackView() {
        this.displayMessage
                = "\n*****************************************************************"
                + "\n*                                                               *"
                + "\n* You are in the forest and you see this shack left in the      *"
                + "\n* middle of nowhere! You think there is something in the shack  *"
                + "\n* that you can add to your weapon. You walk up to the shack,    *"
                + "\n* but when you try to open it you notice that there is a        *"
                + "\n* padlock that prevents you from opening it. Before you feel    *"
                + "\n* that you can't open the shack you notice a note on the        *"
                + "\n* ground. On the outside of the note it reads \"In case I       *"
                + "\n* forget the code\" Do you open the note or will you leave      *"
                + "\n* it be?                                                        *"
                + "\n*****************************************************************"
                + "\n*********************************************"
                + "\n*                                           *"
                + "\n*                Y-Yes                      *"
                + "\n*                N-No                       *"
                + "\n*                                           *"
                + "\n*********************************************";

    }

    public void displayShackView() {

        boolean done = false;
        do {

            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("N")) {
                return;
            }

            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
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
        if (menuOption.toUpperCase().equals("Y")) {
            TheNoteView viewNote = new TheNoteView();
            viewNote.displayNoteView();
        }

        return true;
    }
}
