/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Yamisteven23
 */
public class TheShackView {
    
    public TheShackView(){
        this.displayTheShack();
    }

    void displayTheShack() {
        System.out.println(
        "\n*****************************************************************"
       +"\n*                                                               *"
       +"\n* You are in the forest and you see this shack left in the      *"
       +"\n* middle of nowhere! You think there is something in the shack  *"
       +"\n* that you can add to your weapon. You walk up to the shack,    *"
       +"\n* but when you try to open it you notice that there is a        *"
       +"\n* padlock that prevents you from opening it. Before you feel    *"
       +"\n* that you can't open the shack you notice a note on the        *"
       +"\n* ground. On the outside of the note it reads \"In case I       *"
       +"\n* forget the code\" Do you open the note or will you leave      *"
       +"\n* it be?                                                        *"
       +"\n*****************************************************************");
        
           this.pickUptheNote();
        
    }

    private void pickUptheNote() {
        System.out.println(
        "\n*********************************************"
       +"\n*                                           *"
       +"\n*                Y-Yes                      *"
       +"\n*                N-No                       *"
       +"\n*                                           *"
       +"\n*********************************************");        
        
       Scanner keyboard = new Scanner(System.in);
            String noteOption = "";
            noteOption = keyboard.nextLine(); //get next line typed by keyboard
            noteOption = noteOption.trim(); //trim off leading and trailing whitespace
            
        if (noteOption.toUpperCase().equals("N")){
            return;
        }
        else if (noteOption.toUpperCase().equals("Y")){
            this.readTheNote();
        }
        else {
            System.out.println("\nPlease enter a valid answer!");
        }
        
        
        
        
    }

    private void readTheNote() {
        
        Random rn = new Random();
        long rn2 = 5;
        System.out.println(
        "\n*****************************************************************"
       +"\n*                                                               *"
       +"\n  A man has " +rn+ " apples. He gives half of them to his mom   "
       +"\n  and then gives " +rn2+ " to his brother. How many apples does "
       +"\n  he have left?                                                 "
       +"\n*                                                               *"
       +"\n*****************************************************************");
       //String userAnswer ="". ;kal
       
    }

}

    

