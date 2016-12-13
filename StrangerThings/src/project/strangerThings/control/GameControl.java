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
import project.strangerThings.model.ItemEnum;
import project.strangerThings.view.ErrorView;

/**
 *
 * @author Yamisteven23
 */
public class GameControl {
    
    public static Player createPlayer(String playerName) {
        if (playerName == null) {
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
        
        Item[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Character currentCharacters = GameControl.createNewCharacter(inventoryList);
        game.setCurrentCharacter(currentCharacters);
        
        ArrayList<Item> backpack = new ArrayList<>();
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        try {
            MapControl.moveCharactersToStartLocation(map);
        } catch (MapControlException me) {
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
    
    private static Character createNewCharacter(Item[] gameInventory) {
        //create array of characters, create playable character, set name etc, create new inventory list (arraylist), add flashlight 
        //and shovel,assign playable character to position 0 in character list, create monster, set values, assign monsters to position 1 to character list
        //return character list

        Character mike = new Character();
        mike.setDescription("Mike");
        mike.setNumLives(3);
        ArrayList<Item> inventoryList = new ArrayList<>();
        
        Item item = gameInventory[ItemEnum.Shovel.ordinal()].clone();
        item.setQuantity(1);
        inventoryList.add(item);
        
        item = gameInventory[ItemEnum.Flashlight.ordinal()].clone();
        item.setQuantity(1);
        inventoryList.add(item);
        
        mike.setInventoryList(inventoryList);
        StrangerThings.getPlayer().setPlayingCharacter(mike);
        mike.setCoordinates(new Point(0, 0));
        return mike;
    }
    
    private static void assignItemsToLocations(Map map) {
        Location[][] locations = map.getLocations();
        
        Item[] inventoryList = StrangerThings.getCurrentGame().getInventory();
        
        Item[] locationItems = locations[0][1].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.Nail.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.Thorn.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.SharpMetal.ordinal()];
        
        locationItems = locations[0][2].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.BarbedWire.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.Staples.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Nail.ordinal()];
        
        locationItems = locations[0][4].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.GlassShard.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.SharpMetal.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Thorn.ordinal()];
        
        locationItems = locations[0][5].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.Dust.ordinal()];
        
        locationItems = locations[1][0].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.BarbedWire.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.GlassShard.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Staples.ordinal()];
        
        locationItems = locations[1][1].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.GlassShard.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.SharpMetal.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Thorn.ordinal()];
        
        locationItems = locations[1][2].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.Nail.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.Thorn.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.SharpMetal.ordinal()];
        
        locationItems = locations[1][3].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.BarbedWire.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.GlassShard.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Staples.ordinal()];
        
        locationItems = locations[1][4].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.BarbedWire.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.Staples.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Nail.ordinal()];
        
        locationItems = locations[1][5].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.Nail.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.Thorn.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.SharpMetal.ordinal()];
        
        locationItems = locations[2][0].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.BarbedWire.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.Staples.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Nail.ordinal()];
        
        locationItems = locations[2][2].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.Nail.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.Thorn.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.SharpMetal.ordinal()];
        
        locationItems = locations[2][3].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.GlassShard.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.SharpMetal.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Thorn.ordinal()];
        locationItems[3] = inventoryList[ItemEnum.GlassShard.ordinal()];
        locationItems[4] = inventoryList[ItemEnum.SharpMetal.ordinal()];
        locationItems[5] = inventoryList[ItemEnum.Thorn.ordinal()];
        locationItems[6] = inventoryList[ItemEnum.GlassShard.ordinal()];
        locationItems[7] = inventoryList[ItemEnum.SharpMetal.ordinal()];
        locationItems[8] = inventoryList[ItemEnum.Thorn.ordinal()];
        locationItems[9] = inventoryList[ItemEnum.Thorn.ordinal()];
        locationItems[10] = inventoryList[ItemEnum.Thorn.ordinal()];
        
        locationItems = locations[2][4].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.Nail.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.Thorn.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.SharpMetal.ordinal()];
        
        locationItems = locations[2][5].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.BarbedWire.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.GlassShard.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Staples.ordinal()];
        
        locationItems = locations[3][0].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.GlassShard.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.SharpMetal.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Thorn.ordinal()];
        
        locationItems = locations[3][1].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.Nail.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.Thorn.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.SharpMetal.ordinal()];
        
        locationItems = locations[3][2].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.BarbedWire.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.Staples.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Nail.ordinal()];
        
        locationItems = locations[3][3].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.Nail.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.Thorn.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.SharpMetal.ordinal()];
        
        locationItems = locations[3][5].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.BarbedWire.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.Staples.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Nail.ordinal()];
        
        locationItems = locations[4][0].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.Nail.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.Thorn.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.SharpMetal.ordinal()];
        
        locationItems = locations[4][1].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.BarbedWire.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.GlassShard.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Staples.ordinal()];
        
        locationItems = locations[4][3].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.BarbedWire.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.GlassShard.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Staples.ordinal()];
        
        locationItems = locations[4][4].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.BarbedWire.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.Staples.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Nail.ordinal()];
        
        locationItems = locations[4][5].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.GlassShard.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.SharpMetal.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Thorn.ordinal()];
        
        locationItems = locations[5][1].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.GlassShard.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.SharpMetal.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Thorn.ordinal()];
        
        locationItems = locations[5][2].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.BarbedWire.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.GlassShard.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Staples.ordinal()];
        
        locationItems = locations[5][3].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.Nail.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.Thorn.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.SharpMetal.ordinal()];
        
        locationItems = locations[5][4].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.GlassShard.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.SharpMetal.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Thorn.ordinal()];
        
        locationItems = locations[5][5].getPlacedItems();
        locationItems[0] = inventoryList[ItemEnum.BarbedWire.ordinal()];
        locationItems[1] = inventoryList[ItemEnum.GlassShard.ordinal()];
        locationItems[2] = inventoryList[ItemEnum.Staples.ordinal()];
    }
    
    public static void saveGame(Game currentGame, String filePath) throws GameControlException {
        
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame); //write the game object out to file
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
    
    public static void getSavedGame(String filePath) throws GameControlException {
        
        Game game = null;
        
        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); // read the game object from file
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        //close the output file
        StrangerThings.setCurrentGame(game); //save
    }
    
    public static Item[] createInventoryList() {
        
        Item[] inventoryList = new Item[17];
        
        Item item;
        
        item = new Item("Shovel", "This is a shovel that Lucas brought with him. Use it to find items", "Start Item", 0, 1);
        inventoryList[0] = item;
        item = new Item("Flashlight", "This is a flashlight that Mike brought with him so you can see in the dark", "Start Item", 0, 1);
        inventoryList[1] = item;
        item = new Item("Baseball Bat", "This is a baseball bat from the school", "Base Item", 5, 1);
        inventoryList[2] = item;
        item = new Item("Hockey Stick", "This is a hockey stick from the school", "Base Item", 5, 1);
        inventoryList[3] = item;
        item = new Item("Golf Club", "This is a golf club from the school", "Base Item", 5, 1);
        inventoryList[4] = item;
        item = new Item("Lacrosse Stick", "This a lacrosse stick found on the field of the school", "Base Item", 5, 1);
        inventoryList[5] = item;
        item = new Item("Cricket Paddle", "This is a cricket paddle found at the school", "Base Item", 5, 1);
        inventoryList[6] = item;
        item = new Item("Tennis Racket", "This is a tennis racket found on the court at the school", "Base Item", 3, 1);
        inventoryList[7] = item;
        item = new Item("Broom", "This is a broom found in the janitor's closet at the school", "Base Item", 4, 1);
        inventoryList[8] = item;
        item = new Item("Drum Stick", "This is a drum stick found in the band room at the school", "Base Item", 1, 1);
        inventoryList[9] = item;
        item = new Item("Nail", "This is a rusty nail that you found in the forest", "Addition Item", 1, 15);
        inventoryList[10] = item;
        item = new Item("Barbed Wire", "This is some barbed wire you found near a fence at the park", "Addition Item", 1, 13);
        inventoryList[11] = item;
        item = new Item("Glass Shard", "This is some glass you found on the ground", "Addition Item", 1, 16);
        inventoryList[12] = item;
        item = new Item("Thorn", "This is a thorn that you found at a rose bush in the forest", "Addition Item", 1, 20);
        inventoryList[13] = item;
        item = new Item("Sharp shard of metal", "This is a sharp shard of metal you found on the ground", "Addition Item", 1, 18);
        inventoryList[14] = item;
        item = new Item("Staples", "These are some used staples you found on the ground", "Addition Item", 1, 13);
        inventoryList[15] = item;
        item = new Item("Dust", "This is the magic dust you found in the shed that boosts your master weapon", "Addition Item", 10, 1);
        inventoryList[16] = item;
        return inventoryList;
    }
    
    public static long createWeapon(Character character) {
        ArrayList<Item> inventory = character.getInventoryList();
        long total = 0;
        for (Item item : inventory) {
            total += item.getPower();
        }
        Game game = StrangerThings.getCurrentGame();
        game.setPowerLevel(game.getPowerLevel() + total);
        return total;
    }
    
    public static void checkLives(Long numLives) {
        Long livesLeft = numLives;
        
        if (livesLeft > 0) {
            return;
        } else {
            System.out.println("\nSorry you lost all your lives. Game over!");
        }
        System.exit(0);
    }
}
