/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

import java.util.ArrayList;
import java.util.Scanner;
import project.strangerThings.control.GameControl;
import project.strangerThings.model.Item;
import strangerthings.StrangerThings;
import project.strangerThings.model.Location;

/**
 *
 * @author Yamisteven23
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n----------------------------------"
                + "\n|         Game Menu              |"
                + "\n---------------------------------|"
                + "\nM- Move                          |"
                + "\nI- Inventory                     |"
                + "\nV- View Map                      |"
                + "\nS- Save Game                     |"
                + "\nH- Help Menu                     |"
                + "\nW- Manufacture Weapon            |"
                + "\nX- Exit Game                     |"
                + "\n----------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        String choice = value.toUpperCase();

        switch (choice) {
            case "M": //Move
                this.move();
                break;
            case "I": //Inventory
                this.checkInventory();
                break;
            case "V": //View Map
                this.viewMap();
                break;
            case "S": //Save Game
                this.saveGame();
                break;
            case "W": //Make Weapon
                this.manufactureWeapon();
                break;
            case "H": //Help Menu
                this.helpMenu();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Please Try again");
                break;
        }
        return false;
    }

    private void move() {
        MoveView moveMenu = new MoveView();
        moveMenu.display();
    }

    private void checkInventory() {
       ArrayList<Item> inventory = StrangerThings.getCurrentGame().getPlayer().getPlayingCharacter().getInventoryList();
       for (int i = 0; i < inventory.size(); i++){
           Item items = inventory.get(i);
        System.out.println("\n\tItem: " + items.getName() +
                           "\n\tQuanity: " + items.getQuantity());
        }
    }

    private void viewMap() {
        Location[][] locations = StrangerThings.getCurrentGame().getMap().getLocations();
        System.out.println("\n       Portal to the Upside Down");
        System.out.println("\n     0     1     2     3     4     5");
        System.out.print("   ---------------------------------- ");
        for (int i = 0; i < 6; i++){
            System.out.print("\n " + i);
                 for (int j= 0; j < 6; j++){
                 System.out.print("|");
                 Location location = locations[i][j];
                 if (location.getVisited()){
                System.out.print(location.getScene().getMapSymbol());
            } else{
                System.out.print(" ?? ");
            }
            System.out.print("|");
            
        }
           System.out.print("\n   ----------------------------------");
        }
     
    }

    private void manufactureWeapon() {
        
        GameControl.createWeapon(StrangerThings.getCurrentGame().getCurrentCharacter());
         
        long power = StrangerThings.getCurrentGame().getPowerLevel();
                
        this.console.println("\n\tWeapon created. Power level: " + power);
                                   
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
          this.console.println("\n\nEnter the file path for the file where the game is to be saved.");
      String filePath = this.getInput();
      
      try{
          //save the game to the specified file
          GameControl.saveGame(StrangerThings.getCurrentGame(), filePath);
      } catch (Exception ex){
          ErrorView.display("MainMenuView", ex.getMessage());
      }
    }
}
