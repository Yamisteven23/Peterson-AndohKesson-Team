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
public class GameMenuView {

    private String menu;

    public void displayGameMenuView() {

        boolean done = false;
        do {

            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E")) {
                return;
            }

            done = this.doAction(menuOption);
        } while (!done);
    }

    public GameMenuView() {
        this.menu = "\n"
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
                + "\nE- Exit Game                     |"
                + "\n----------------------------------";
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initalize to not valid

        while (!valid) {
            System.out.println("\n" + this.menu);

            value = keyboard.nextLine(); //get next line typed by keyboard
            value = value.trim(); //trim off leading and trailing whitespace

            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value; value cannot be blank");
                continue;
            }
            break; //end the loop

        }
        return value; //return the value entered
    }

    private boolean doAction(String menuOption) {
        String choice = menuOption.toUpperCase();

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
                this.checkInventory();
                break;
            case "W": //Make Weapon
                this.manufactureWeapon();
                break;
            case "L": //Look for items
                this.checkInventory();
                break;
            case "H": //Help Menu
                this.helpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Please Try again");
                break;
        }
        return false;
    }

    private void move() {
        MoveView moveMenu = new MoveView();
        moveMenu.displayMenu();
    }

    private void checkInventory() {
        System.out.println("\n*** checkInventory() function called +++");
    }

    private void viewMap() {
        System.out.println("\n*** viewMap() function called +++");
    }

    private void manufactureWeapon() {
        System.out.println("\n*** manufactureWeapon() function called +++");
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }
}
