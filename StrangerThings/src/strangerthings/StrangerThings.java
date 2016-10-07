/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strangerthings;

import project.strangerThings.model.Player;
import project.strangerThings.model.Scene;

/**
 *
 * @author Isaac
 */
public class StrangerThings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Player playerOne = new Player();
       
       playerOne.setName("Enock");
       playerOne.setBestTime(7.00);
       
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo);
       
       //Scene
       Scene sceneOne = new Scene();
       
       sceneOne.setDescription("You are in the forest. You hear a noise but it "
               + "becomes faint and you ignore it. There may be some useful items"
               + " around here");
       sceneOne.setMapSymbol("^^");
       
       String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
       
       
    } 
    
    
}
