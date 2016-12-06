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
public class MoveView extends View {

    public MoveView() {
        super("\n"
                + "\n----------------------------------"
                + "\n|         Move Menu              |"
                + "\n---------------------------------|"
                + "\nN- North                         |"
                + "\nS- South                         |"
                + "\nE- East                          |"
                + "\nW- West                          |"
                + "\nX- Exit Game                     |"
                + "\n----------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        String choice = value.toUpperCase();

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
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Please Try again");
                break;
        }
        return false;
    }

    private void north() {
        this.console.println(
                "\n*** north() function called +++");
    }

    private void south() {
        this.console.println(
                "\n*** south() function called +++");
    }

    private void east() {
        this.console.println(
                "\n*** east() function called +++");
    }

    private void west() {
        this.console.println(
                "\n*** west() function called +++");
    }
}
