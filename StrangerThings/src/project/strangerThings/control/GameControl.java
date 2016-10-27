/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.control;

import project.strangerThings.model.Player;
import strangerthings.StrangerThings;

/**
 *
 * @author Yamisteven23
 */
public class GameControl {

    public static Player createPlayer(String playerName) {
        if (playerName == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(playerName);
        
        StrangerThings.setPlayer(player);
        
        return player;
    
    }
    
}
