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
        ErrorView.display(this.getClass().getName(),
                "\n*** north() function called +++");
    }

    private void south() {
        ErrorView.display(this.getClass().getName(),
                "\n*** south() function called +++");
    }

    private void east() {
        ErrorView.display(this.getClass().getName(),
                "\n*** east() function called +++");
    }

    private void west() {
       ErrorView.display(this.getClass().getName(),
               "\n*** west() function called +++");
    }
}
