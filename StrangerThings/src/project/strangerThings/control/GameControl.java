/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.control;

import project.strangerThings.model.Player;

/**
 *
 * @author Yamisteven23
 */
public class GameControl {

    public static Player createPlayer(String playerName) {
        System.out.println("\n***createPlayer called ***");
        return new Player();
    }
    
}
