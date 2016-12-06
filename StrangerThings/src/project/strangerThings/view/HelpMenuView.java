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
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n----------------------------------"
                + "\n|         Help Menu              |"
                + "\n----------------------------------"
                + "\nG- Goal of the Game"
                + "\nB- Backstory of Stranger Things"
                + "\nM- How to Move"
                + "\nL- List of inventory on map"
                + "\nU- How to manufacture upgraded weapons"
                + "\nX-Exit"
                + "\n----------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        String choice = value.toUpperCase();
        //change
        switch (choice) {
            case "G": //Goal of the Game
                this.goalOfGame();
                break;
            case "B": //Backstory of TV show
                this.backstory();
                break;
            case "M": //how to move
                this.howToMove();
                break;
            case "L": //inventory list
                this.inventoryList();
                break;
            case "U": //how to manufacture upgraded weaponssteve

                this.upgradeWeapon();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Please Try again");
                break;
        }
        return false;
    }

    private void goalOfGame() {
        this.console.println(
                "\n*****************************************************************"
                + "\n*                                                               *"
                + "\n* The three main characters Mike, Dustin, and Lucas are out on  *"
                + "\n* an adventure because they lost \"Eleven\". They are out in    *"
                + "\n* the woods with the monster, other creatures, and many         *"
                + "\n* obstacles such as government officals and the Sheriff. You    *"
                + "\n* will explore the map seeking required items in order to       *"
                + "\n* destroy the monster while avoiding the sheriff and the        *"
                + "\n* government. Using simple commands you will move your          *"
                + "\n* characters in order to complete the tasks that are needed     *"
                + "\n* to complete the game. Take one wrong turn you lose a life     *"
                + "\n* or the game will be over. You have three lives. Use them      *"
                + "\n* wisely and good luck on your adventure!                       *"
                + "\n*                                                               *"
                + "\n*****************************************************************"
        );
    }

    private void backstory() {
        this.console.println(
                "\n*****************************************************************"
                + "\n*                                                               *"
                + "\n* Stranger Things is an American science fiction horror web     *"
                + "\n* television series created by the Duffer Brothers. The plot    *"
                + "\n* follows the disappearance of a young boy, and a telekinetic   *"
                + "\n* girl who helps his friends in their search. While the boy's   *"
                + "\n* older brother, his mother, and the town police sheriff start  *"
                + "\n* their own investigations.                                     *"
                + "\n*                                                               *"
                + "\n*****************************************************************"
        );
    }

    private void howToMove() {
        this.console.println(
                "\n*****************************************************************"
                + "\n*                                                               *"
                + "\n* The characters will all be moving together as a team one      *"
                + "\n* space at a time. When prompted you will be asked to enter     *"
                + "\n* N for north, E for East, S for south or W for west.           *"
                + "\n*                                                               *"
                + "\n*****************************************************************"
        );
    }

    private void inventoryList() {
        this.console.println(
                "\n*****************************************************************"
                + "\n*                                                               *"
                + "\n* The list of inventory on the map shows you what items         *"
                + "\n* you have on the map on the locations you have visited         *"
                + "\n* to make weapons.                                              *"
                + "\n*                                                               *"
                + "\n*****************************************************************"
        );
    }

    private void upgradeWeapon() {
        this.console.println(
                "\n*****************************************************************"
                + "\n*                                                               *"
                + "\n* Throughout the game, objects for making weapons will be       *"
                + "\n* at randomized places on the map. You are to gather as many    *"
                + "\n* objects as possible without getting caught by the sheriff,    *"
                + "\n* government and monster. The more objects you have, the more   *"
                + "\n* powerful your weapon becomes.                                 *"
                + "\n*                                                               *"
                + "\n*****************************************************************"
        );
    }

}
