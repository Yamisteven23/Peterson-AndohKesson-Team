/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

import java.util.Random;
import java.util.Scanner;
import project.strangerThings.control.MapControl;

/**
 *
 * @author Yamisteven23
 */
public class TheNoteView extends View {

    private long rn;
    private long rn2;

    public TheNoteView() {
        super();
        Random randomGenerator = new Random();
        this.rn2 = (long) randomGenerator.nextInt(11);
        this.rn = (long) randomGenerator.nextInt(1979) + 22;

        this.displayMessage = "\n*****************************************************************"
                + "\n*                                                               *"
                + "\n  A man has " + this.rn + " apples. He gives half of them to his mom   "
                + "\n  and then gives " + this.rn2 + " to his brother. How many apples does "
                + "\n  he have left?                                                 "
                + "\n*                                                               *"
                + "\n*****************************************************************";

    }

    @Override
    public boolean doAction(String value) {
        long answer = 0;
       try{ answer = Long.parseLong(value);
        } catch (NumberFormatException nf){
            ErrorView.display(this.getClass().getName(),
                    "\n*** Please enter a valid number ");
        }
        long result = MapControl.openTheShack(this.rn, this.rn2, answer);

        if (result == 0) {
            this.console.println("\nCongrats! The Locked Opened!"); //Change this eventually
        } else if (result == 2) {
            ErrorView.display(this.getClass().getName(),
                    "\nYou put in the number but the lock didn't open!");
            return false;
        } else if (result == -1) {
            ErrorView.display(this.getClass().getName(),
                    "\nThis is not a number on a padlock");
            return false;
        } else if (result == -2) {
            ErrorView.display(this.getClass().getName(),
                    "\nRandom number 1 is invalid!");
            return false;
        } else if (result == -3) {
            ErrorView.display(this.getClass().getName(),
                    "\nRandom number 2 is invalid!");
            return false;
        }

        return true;
    }

}
