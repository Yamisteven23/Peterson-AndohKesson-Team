/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.control;

import java.awt.Point;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import project.strangerThings.exceptions.GameControlException;
import project.strangerThings.model.Game;
import project.strangerThings.model.Item;
import project.strangerThings.model.Location;
import project.strangerThings.model.Map;
import project.strangerThings.model.Player;
import project.strangerThings.model.Scene;
import project.strangerThings.model.SceneType;
import strangerthings.StrangerThings;
import project.strangerThings.model.Character;
import project.strangerThings.exceptions.MapControlException;
import project.strangerThings.view.ErrorView;

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
        
        ArrayList<Item> backpack = new ArrayList<>();
                    
        Map map = MapControl.createMap();
        game.setMap(map);
        
        try { 
           MapControl.moveCharactersToStartLocation(map);}
        catch (MapControlException me) {
                   ErrorView.display("GameControl", 
                           "\n*** Error with the map ***");
        }
          
       
        
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
        Character[] characters = new Character[1];
        
        Character mike = new Character();
        mike.setDescription("Mike");
        mike.setNumLives(3);
        ArrayList<Item> inventoryList = new ArrayList<>();
        inventoryList.add(Item.Shovel);
        inventoryList.add(Item.Flashlight);
        mike.setInventoryList(inventoryList);
        characters[0] = mike;
        StrangerThings.getPlayer().setPlayingCharacter(mike);
        mike.setCoordinates(new Point(0,0));
        return characters;
    }
    private static void assignItemsToLocations(Map map){
        Location[][] locations = map.getLocations();
        
           Item[] items = locations[0][1].getPlacedItems();
           items[0] = Item.Nail;
           items[1] = Item.Thorn;
           items[2] = Item.SharpMetal;
           
          items = locations[0][2].getPlacedItems();
          items[0] = Item.BarbedWire;
          items[1] = Item.Staples;
          items[2] = Item.Nail;
          
          items = locations[0][4].getPlacedItems();
          items[0] = Item.GlassShard;
          items[1] = Item.SharpMetal;
          items[2] = Item.Thorn;
          
          items = locations[0][5].getPlacedItems();
          items[0] = Item.Dust;
          
          items = locations[1][0].getPlacedItems();
          items[0] = Item.BarbedWire;
          items[1] = Item.GlassShard;
          items[2] = Item.Staples;
          
          items = locations[1][1].getPlacedItems();
          items[0] = Item.GlassShard;
          items[1] = Item.SharpMetal;
          items[2] = Item.Thorn;
          
          items = locations[1][2].getPlacedItems();
          items[0] = Item.Nail;
          items[1] = Item.Thorn;
          items[2] = Item.SharpMetal;
          
          items = locations[1][3].getPlacedItems();
          items[0] = Item.BarbedWire;
          items[1] = Item.GlassShard;
          items[2] = Item.Staples;
          
          items = locations[1][4].getPlacedItems();
          items[0] = Item.BarbedWire;
          items[1] = Item.Staples;
          items[2] = Item.Nail;
          
          items = locations[1][5].getPlacedItems();
          items[0] = Item.Nail;
          items[1] = Item.Thorn;
          items[2] = Item.SharpMetal;
          
          items = locations[2][0].getPlacedItems();
          items[0] = Item.BarbedWire;
          items[1] = Item.Staples;
          items[2] = Item.Nail;
          
          items = locations[2][2].getPlacedItems();
          items[0] = Item.Nail;
          items[1] = Item.Thorn;
          items[2] = Item.SharpMetal;
          
          items = locations[2][3].getPlacedItems();
          items[0] = Item.GlassShard;
          items[1] = Item.SharpMetal;
          items[2] = Item.Thorn;
          items[3] = Item.GlassShard;
          items[4] = Item.SharpMetal;
          items[5] = Item.Thorn;
          items[6] = Item.GlassShard;
          items[7] = Item.SharpMetal;
          items[8] = Item.Thorn;
          items[9] = Item.Thorn;
          items[10] = Item.Thorn;
          
          items = locations[2][4].getPlacedItems();
          items[0] = Item.Nail;
          items[1] = Item.Thorn;
          items[2] = Item.SharpMetal;
          
          items = locations[2][5].getPlacedItems();
          items[0] = Item.BarbedWire;
          items[1] = Item.GlassShard;
          items[2] = Item.Staples;
          
          items = locations[3][0].getPlacedItems();
          items[0] = Item.GlassShard;
          items[1] = Item.SharpMetal;
          items[2] = Item.Thorn;
          
          items = locations[3][1].getPlacedItems();
          items[0] = Item.Nail;
          items[1] = Item.Thorn;
          items[2] = Item.SharpMetal;
          
          items = locations[3][2].getPlacedItems();
          items[0] = Item.BarbedWire;
          items[1] = Item.Staples;
          items[2] = Item.Nail;
          
          items = locations[3][3].getPlacedItems();
          items[0] = Item.Nail;
          items[1] = Item.Thorn;
          items[2] = Item.SharpMetal;
                    
          items = locations[3][5].getPlacedItems();
          items[0] = Item.BarbedWire;
          items[1] = Item.Staples;
          items[2] = Item.Nail;
          
          items = locations[4][0].getPlacedItems();
          items[0] = Item.Nail;
          items[1] = Item.Thorn;
          items[2] = Item.SharpMetal;
          
          items = locations[4][1].getPlacedItems();
          items[0] = Item.BarbedWire;
          items[1] = Item.GlassShard;
          items[2] = Item.Staples;
                               
          items = locations[4][3].getPlacedItems();
          items[0] = Item.BarbedWire;
          items[1] = Item.GlassShard;
          items[2] = Item.Staples;
             
          items = locations[4][4].getPlacedItems();
          items[0] = Item.BarbedWire;
          items[1] = Item.Staples;
          items[2] = Item.Nail;
              
          items = locations[4][5].getPlacedItems();
          items[0] = Item.GlassShard;
          items[1] = Item.SharpMetal;
          items[2] = Item.Thorn;
                             
          items = locations[5][1].getPlacedItems();
          items[0] = Item.GlassShard;
          items[1] = Item.SharpMetal;
          items[2] = Item.Thorn;
          
          items = locations[5][2].getPlacedItems();
          items[0] = Item.BarbedWire;
          items[1] = Item.GlassShard;
          items[2] = Item.Staples;
          
          items = locations[5][3].getPlacedItems();
          items[0] = Item.Nail;
          items[1] = Item.Thorn;
          items[2] = Item.SharpMetal;
          
          items = locations[5][4].getPlacedItems();
          items[0] = Item.GlassShard;
          items[1] = Item.SharpMetal;
          items[2] = Item.Thorn;
          
          items = locations[5][5].getPlacedItems();
          items[0] = Item.BarbedWire;
          items[1] = Item.GlassShard;
          items[2] = Item.Staples;
    }

    public static void saveGame(Game currentGame, String filePath) throws GameControlException {
       
        try( FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame); //write the game object out to file
        }
        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) throws GameControlException {
        
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); // read the game object from file
        }
       catch(Exception e) {
            throw new GameControlException(e.getMessage());
       }
    //close the output file
    StrangerThings.setCurrentGame(game); //save
    } 
}
