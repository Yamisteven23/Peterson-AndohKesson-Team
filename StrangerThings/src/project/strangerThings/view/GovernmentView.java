/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;
import project.strangerThings.control.GameControl;
import strangerthings.StrangerThings;
import project.strangerThings.model.Character;


/**
 *
 * @author Yamisteven23
 */
public class GovernmentView {

    public GovernmentView() {
        System.out.println("Oh no! the government has found you. They take you in a room seperately "
                + "\nand scare you to your wits. You take a day to shake it off, but you lose "
                + "\na life.");
        Long numLives = StrangerThings.getCurrentGame().getCurrentCharacter().getNumLives();
        Character mike = StrangerThings.getCurrentGame().getCurrentCharacter();
        numLives -= 1;
        GameControl.checkLives(numLives);
        mike.setNumLives(numLives);
    }

      
   
    
}
