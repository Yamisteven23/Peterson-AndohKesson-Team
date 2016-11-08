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
class TheRunFromMonsterView extends View{

   

   public TheRunFromMonsterView() {
       super(
                "\n*****************************************************************"
                + "\n*                                                               *"
                + "\n  You've decided to run away from the Monster. Without Losing a  "
                + "\n  life, how far do you think you can run 400 meters in seconds?  "
                + "\n  If you run too slow, you would also lose a life. Good Luck!    "
                + "\n*****************************************************************");

    }

   
   @Override
    public boolean doAction(String userAnswer) {
        long distance = 400;
        long monsterVelocity = (long) 3.77;
        long answer = Long.parseLong(userAnswer);
        long result = MapControl.runFromMonster(answer, distance);

        if (result == 0) {
            System.out.println("\nToo Bad! You lost a life."); //Change this eventually
        } 
        else if (result == 1) {
            System.out.println("\nCongrats! You got away from the monster.");
            return false;
        } else if (result == -1) {
            System.out.println("\nInvalid Distance input.");
            return false;
        }else if (result == -2) {
            System.out.println("\nSorry! Too Slow, you lost a Life.");
            return false;
        }
        return true;
    }
      
    
}
