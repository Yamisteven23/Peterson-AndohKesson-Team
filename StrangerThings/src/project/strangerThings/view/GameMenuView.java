/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

import java.util.Scanner;

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
        ErrorView.display(this.getClass().getName(),
                "\n*** checkInventory() function called +++");
    }

    private void viewMap() {
        ErrorView.display(this.getClass().getName(),
                "\n*** viewMap() function called +++");
    }

    private void manufactureWeapon() {
        ErrorView.display(this.getClass().getName(),
                "\n*** manufactureWeapon() function called +++");
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
         ErrorView.display(this.getClass().getName(),
                 "\n*** saveGame() function called +++");
    }

    private void lookForItems() {
         ErrorView.display(this.getClass().getName(),
                 "\n*** lookForItems() function called +++");
    }
}
