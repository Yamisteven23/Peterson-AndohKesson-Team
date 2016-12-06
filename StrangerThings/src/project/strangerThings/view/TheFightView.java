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
class TheFightView extends View {

    

    public TheFightView() {

        super(
                "\n*****************************************************************"
                + "\n*                                                               *"
                + "\n  You've come face to face with the monster. How many hits do    "
                + "\n  you think you can take?                                        "
                + "\n*****************************************************************");

    }

    
    @Override
    public boolean doAction(String userAnswer) {
        long monsterHealth = 70;
        long powerLevel = 40;
        long answer = Long.parseLong(userAnswer);
        long result = MapControl.fightMonster(answer, powerLevel, monsterHealth);

        if (result == 0) {
            ErrorView.display(this.getClass().getName(),
                    "\nSorry, You Lost a Life!"); //Change this eventually
        } else if (result == 1) {
            this.console.println("\nVictory! You defeated the monster");
            return false;
        } else if (result == -1) {
            ErrorView.display(this.getClass().getName(),
                    "\nSorry, not enough hits to defeat the monster. You Lost a Life.");
            return false;
        } else if (result == -2) {
            ErrorView.display(this.getClass().getName(),
                    "\nSorry its impossible to swing that many times! You Lost a Life");
            return false;
        } else if (result == -3) {
            ErrorView.display(this.getClass().getName(),
                    "\nSorry, not enough power Level to defeat the monster. You Lost a Life.");
            return false;
        } else if (result == -4) {
            ErrorView.display(this.getClass().getName(),
                    "\nSorry, Invalid power Level input");
            return false;
        } else if (result == -5) {
            ErrorView.display(this.getClass().getName(),
                    "\nSorry, Invalid Monster Health input");
            return false;
        } else if (result == -6) {
            ErrorView.display(this.getClass().getName(),
                    "\nSorry, Monster Health can not be more than 70.");
            return false;
        }
        return true;
    }

}
