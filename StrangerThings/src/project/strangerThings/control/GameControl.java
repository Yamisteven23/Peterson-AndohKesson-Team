/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.control;

import project.strangerThings.model.Game;
import project.strangerThings.model.Item;
import project.strangerThings.model.Location;
import project.strangerThings.model.Map;
import project.strangerThings.model.Player;
import project.strangerThings.model.Scene;
import project.strangerThings.model.SceneType;
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

    public static void createNewGame(Player player) {
        Game game = new Game();
        StrangerThings.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Character[] currentCharacter = GameControl.createNewCharacter();
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveCharactersToStartLocation(map);
        
    }


    static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.forest3.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.sheriff.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.forest4.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.shack.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.forest2.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.forest4.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.forest2.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.forest3.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.forest3.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.school.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.junkyard.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.forest2.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.forest4.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.forest3.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.government.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.forest3.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.forest.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.forest2.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.monster.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.forest2.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.forest3.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.forest4.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.government.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.forest4.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.forest2.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.forest4.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.forest2.ordinal()]);
       
    }

    private static Character[] createNewCharacter() {
        //create array of characters, create playable character, set name etc, create new inventory list (arraylist), add flashlight 
        //and shovel,assign playable character to position 0 in character list, create monster, set values, assign monsters to position 1 to character list
        //return character list
        System.out.println("\n**** new Character called ***");
        return null;
    }
    
}
