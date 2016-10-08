/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strangerthings;

import project.strangerThings.model.Location;
import project.strangerThings.model.Player;
import project.strangerThings.model.Question;
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
        //Question
        Question questionOne = new Question();
        
        questionOne.setQuestion("If I were to pick a dozen apples then give a "
                + "third of it to my sister and then give 2 to my mother how many "
                + "apples would I have left?");
        questionOne.setAnswer("4");
        questionOne.setCorrectAnswer("six,6");
        
        String questionInfo = questionOne.toString();
        System.out.println(questionInfo);
        
        //Location
        Location locationOne = new Location();
        
        locationOne.setRow(5);
        locationOne.setColumn(4);
        locationOne.setVisited(10);
        locationOne.setAmountRemaining(26);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        
        
       
       
    } 
    
    
    
}
