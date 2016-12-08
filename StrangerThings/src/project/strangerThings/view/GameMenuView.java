/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

import java.util.Scanner;
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
                + "\nL- Look for items                |"
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
            case "L": //Look for items
                this.lookForItems();
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
        this.console.println(
              "\n*** checkInventory() function called +++");
    }

    private void viewMap() {
        Location[][] locations = StrangerThings.getCurrentGame().getMap().getLocations();
        System.out.println("\n       Portal to the Upside Down");
        System.out.println("\n     0     1     2     3     4     5");
        System.out.print("   -----------------------------------");
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
           System.out.print("\n-------------------------------------");
        }
     
    }

    private void manufactureWeapon() {
         this.console.println(
                "\n*** manufactureWeapon() function called +++");
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
          this.console.println(
                 "\n*** saveGame() function called +++");
    }

    private void lookForItems() {
          this.console.println(
                 "\n*** lookForItems() function called +++");
    }
}
