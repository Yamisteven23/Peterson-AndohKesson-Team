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
public class MoveView {

    private final String menu;

    void displayMenu() {
        //Menu should print out N-North, E- East, S-South, and W-West
        boolean done = false;
        do {

            String moveMenu = this.getMoveMenu();
            if (moveMenu.toUpperCase().equals("X")) {
                return;
            }

            done = this.doAction(moveMenu);
        } while (!done);
    }

    public MoveView() {
        this.menu = "\n"
                + "\n----------------------------------"
                + "\n|         Move Menu              |"
                + "\n---------------------------------|"
                + "\nN- North                         |"
                + "\nS- South                         |"
                + "\nE- East                          |"
                + "\nW- West                          |"
                + "\nX- Exit Game                     |"
                + "\n----------------------------------";
    }

    private String getMoveMenu() {
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

    private boolean doAction(String moveMenu) {
        String choice = moveMenu.toUpperCase();

        switch (choice) {
            case "N": //Move North
                this.north();
                break;
            case "S": //Move South
                this.south();
                break;
            case "E": //Move East
                this.east();
                break;
            case "W": //Move West
                this.west();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Please Try again");
                break;
        }
        return false;
    }

    private void north() {
        System.out.println("\n*** north() function called +++");
    }

    private void south() {
        System.out.println("\n*** south() function called +++");
    }

    private void east() {
        System.out.println("\n*** east() function called +++");
    }

    private void west() {
        System.out.println("\n*** west() function called +++");
    }
}
