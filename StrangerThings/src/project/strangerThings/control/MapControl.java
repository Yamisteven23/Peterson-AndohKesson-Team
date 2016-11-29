/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.control;

import project.strangerThings.model.Map;
import project.strangerThings.model.Scene;
import project.strangerThings.model.SceneType;

/**
 *
 * @author Isaac
 */
public class MapControl {

    

    public static long runFromMonster(long time, long distance) {
        /*
        if (time > 105) then
                Return 0
        if (distance < 400 OR distance > 400) then
                Return -1
        if (time < 60) then
                Return -2
        playerVelocity = distance/time
               
        monsterVelocity = 3.77
                
        getAway = playerVelocity - monsterVelocity
                
                Return 1
        
         END
         */
        if (time > 105) {

            return 0;
        }

        if (distance != 400) {

            return -1;
        }

        if (time < 60) {

            return -2;
        }

        long playerVelocity = distance / time;
        long monsterVelocity = (long) 3.77;
        long getAway = playerVelocity - monsterVelocity;

        return 1;
    }

    public static long fightMonster(long hits, long powerLevel, long monsterHealth) {
        /* 
   IF (hits < 2) THEN 
	RETURN -1
IF (hit > 3) THEN
	RETURN -2
IF (powerLevel < 27) THEN
	RETURN -3
IF (powerLevel > 40) THEN
	RETURN -4
IF (monsterHealth < 0) THEN 
	RETURN -5
IF (monsterHealth > 70) THEN 
RETURN -6
IF (monsterHealth == 0) THEN
	RETURN 1
fightMonster =(hits * powerLevel) - monsterHealth 
IF (fightMonster == monsterHealth || fightMonster > monsterHealth) THEN
	RETURN 1
ELSE 
	RETURN 0
END
 
         */
        if (hits < 2) {
            return -1;
        }

        if (hits > 3) {
            return -2;
        }

        if (powerLevel < 27) {
            return -3;
        }

        if (powerLevel > 40) {
            return -4;
        }

        if (monsterHealth < 0) {
            return -5;
        }

        if (monsterHealth > 70) {
            return -6;
        }

        long powerStrength = (hits * powerLevel);

        long fightMonster = monsterHealth - powerStrength;

        if (monsterHealth < powerStrength) {
            return 1;
        } else {
            return 0;
        }
    }

    //The Shack
    /*Algorithm
theShackTest(rn,rn2,userAnswer)
BEGIN
IF (userAnswer < 1 OR userAnswer >999) THEN
	RETURN -1
IF (rn < 22 OR rn >2000) THEN
	RETURN -2
IF (rn2 < 1 OR rn2 > 10) THEN
	RETURN -3
equation = (rn/2) – rn2
IF (equation does not equal userAnswer) THEN
	RETURN 2
ELSE
	RETURN 0 
END*/
    public static long openTheShack(long rn, long rn2, long userAnswer) {

        if (userAnswer < 1 || userAnswer > 999) {
            return -1;
        }
        if (rn < 22 || rn > 2000) {
            return -2;
        }
        if (rn2 < 0 || rn2 > 10) {
            return -3;
        }
        long equation = (rn / 2) - rn2;

        if (equation != userAnswer) {
            return 2;
        } else {
            return 0;
        }
    }

    public static Map createMap() {
        Map map = new Map(6,6);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        
        return map;
    }

    static void moveCharactersToStartLocation(Map map) {
        System.out.println("\n*** Characters moved to start location");
    }

    private static Scene[] createScenes() {
         Scene[] scenes = new Scene[SceneType.values().length];
         
         Scene startScene = new Scene();
         startScene.setDescription(
           "Now that your have grouped up with your friends it is time to start "
         + "your investigation of the disappearance of your friend Will.The three "
         + "of you decide that you need to search for supplies to defeat the monster.");
         startScene.setMapSymbol("ST");
         scenes[SceneType.start.ordinal()] = startScene;
         
         Scene finishScene = new Scene();
         finishScene.setDescription(
           "Congrats! You defeated the monster and found your firend Will! You meet "
         + "up with Will at his house to have him tell you what happened. He tells "
         + "you this crazy story of when he was at the lake and the monster came "
         + "behind him. He was able to escape, but he was stuck in the monster's "
         + "lair until you came to save him. He thanks you all for your valient efforts.");
         finishScene.setMapSymbol("FN");
         scenes[SceneType.finish.ordinal()] = finishScene;
         
         //continue
         
         Scene forestScene = new Scene();
         forestScene.setDescription(
           "All you see is trees around you. You decide to split up but stay close "
         + "together so you don't get lost from each other. When you group back together "
         + "you gather everything you three found useful for a weapon. You find a nail, "
         + "a sharp thorn, and metal shard. which do you take?");
         forestScene.setMapSymbol("^");
         scenes[SceneType.forest.ordinal()] = forestScene;
         
         Scene governmentScene = new Scene();
         governmentScene.setDescription(
           "Oh no! the government has found you. They take you in a room seperately "
         + "and scare you to your wits. You take a day to shake it off, but you lose "
         + "a life.");
         governmentScene.setMapSymbol("G");
         scenes[SceneType.government.ordinal()] = governmentScene;
         
         Scene sheriffScene = new Scene();
         sheriffScene.setDescription(
           "You look to your right and you see the local sheriff's car pull up "
         + "next to you. He gets out of the car and scolds you for being out late "
         + "and tells you to get in the car. He takes each of you home. You lose "
         + "a life.");
         sheriffScene.setMapSymbol("**");
         scenes[SceneType.sheriff.ordinal()] = sheriffScene;
         
         Scene monsterScene = new Scene();
         monsterScene.setDescription(
           "Finally the search for the monster is over. You will decide to fight "
         + "the monster or to try and run away");
         monsterScene.setMapSymbol("M");
         scenes[SceneType.monster.ordinal()] = monsterScene;
         
         Scene shackScene = new Scene();
         shackScene.setDescription(
           "As you are walking in the forest you come across a shack. It looks like "
         + "there can be something in there that can be used for your weapon");
         shackScene.setMapSymbol("|^|");
         scenes[SceneType.shack.ordinal()] = shackScene;
         
         Scene schoolScene = new Scene();
         schoolScene.setDescription(
           "During your travels you come across your school. You feel like you "
         + "can find a good base item for your master weapon");
         schoolScene.setMapSymbol("S");
         scenes[SceneType.school.ordinal()] = schoolScene;
                
         Scene junkyardScene = new Scene();
         junkyardScene.setDescription(
           "You come across a junkyard. You look around and see that there is a "
         + "lot of garbage around but you think that there could be items around here "
         + "that you could use for your weapon. Your groups splits up and finds "
         + "3 shards of glass, 5 thorns, and 3 shards of metal. What do you take?");
         junkyardScene.setMapSymbol("J");
         scenes[SceneType.junkyard.ordinal()] = junkyardScene;
         
         Scene forest2Scene = new Scene();
         forest2Scene.setDescription(
           "You look around you and you see trees. You hear a twig snap and you think "
         + "that the monster may be near. After waiting a couple of seconds you think "
         + "the sound was just in your head. You split up to find items for your weapon "
         + "your group finds a line of barbed wire, a shard of glass, and a staple. "
         + "what do you take?");
         forest2Scene.setMapSymbol("^^");
         scenes[SceneType.forest2.ordinal()] = forest2Scene;
         
         Scene forest3Scene = new Scene();
         forest3Scene.setDescription(
           "As you go deeper in the forest you feel a dark feeling around you "
         + "you still decide to split up and your group finds a staple, a line of "
         + "barbed wire, and a nail. What do you take?");
         forest3Scene.setMapSymbol("^^^");
         scenes[SceneType.forest3.ordinal()] = forest3Scene;
         
         Scene forest4Scene = new Scene();
         forest4Scene.setDescription(
           "You feel as though you are walking in a circle and going no where. "
         + "You think you have seen the tree in front of you before and the bush "
         + "to the right. But you continue on anyways and search for items for your "
         + "weapon. Your group finds a shard of glass, a shard of metal, and a sharp "
         + "thorn. What do you take?");
         forest4Scene.setMapSymbol("^|^");
         scenes[SceneType.forest4.ordinal()] = forest4Scene;
         
         return scenes;
    }
}
