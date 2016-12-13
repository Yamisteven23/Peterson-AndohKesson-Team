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
public class SheriffView{

    public SheriffView() {
        System.out.println("You look to your right and you see the local sheriff's car pull up "
                + "\nnext to you. He gets out of the car and scolds you for being out late "
                + "\nand tells you to get in the car. He takes each of you home. You lose "
                + "\na life.");
        Long numLives = StrangerThings.getCurrentGame().getCurrentCharacter().getNumLives();
        Character mike = StrangerThings.getCurrentGame().getCurrentCharacter();
        numLives -= 1;
        GameControl.checkLives(numLives);
        mike.setNumLives(numLives);
    }

    
    
   
    
}
