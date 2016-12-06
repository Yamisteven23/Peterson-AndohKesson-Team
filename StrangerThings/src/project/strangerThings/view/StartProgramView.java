/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

import project.strangerThings.control.GameControl;
import project.strangerThings.model.Player;

/**
 *
 * @author Yamisteven23
 */
public class StartProgramView extends View {

    public StartProgramView() {
        super("\n*****************************************************************"
                + "\n*                                                               *"
                + "\n* Stranger Things! is a text based role playing                 *"
                + "\n* game from the events in the Netflix original                  *"
                + "\n* series Stranger Things. You will be taking the                *"
                + "\n* role of 3 children named Mike, Lucas, and Dustin.             *"
                + "\n* One of thier friends went missing and Mike, Lucas             *"
                + "\n* and Dustin suspect foul play. While investigating             *"
                + "\n* they cross paths with another child named Eleven who          *"
                + "\n* has telekinesis powers. She helps Mike, Lucas, and            *"
                + "\n* Dustin discover that their friend was taken by a monster!     *"
                + "\n* They will have to devise a rescue plan to find a way          *"
                + "\n* to defeat the monster while avoiding the government           *"
                + "\n* and the Sheriff. While on your journey you lost Eleven,       *"
                + "\n* but are still looking for the required items to defeat        *"
                + "\n* the monster. If the government finds you then you will        *"
                + "\n* be taken. If the local sheriff finds you then he will         *"
                + "\n* send you home. As you explore the map you will search         *"
                + "\n* for the required items to build your master weapon. In        *"
                + "\n* this game you will start your journey with a flashlight,      *"
                + "\n* a shovel, and a backpack. You will move as a team in order    *"
                + "\n* to accomplish your goal of defeating the monster. Throughout  *"
                + "\n* the map there will be items placed that you can find in order *"
                + "\n* to make your master weapon. The route you take and rhe weapon *"
                + "\n* you make is up to you.                                        *"
                + "\n*                                                               *"
                + "\n*****************************************************************"
                + "\n                                                                 "
                + "\n                                                                 "
                + "\n                                                                 "
                + "\n                                                                 "
                + "\nPlease enter your name:                                          "
        );
    }

    @Override
    public boolean doAction(String value) {
        if (value.length() < 2) {
            ErrorView.display(this.getClass().getName(),
                    "\nInvalid player name;"
                    + "The name must be greater than one character in length");
            return false;

        }
        //call createPlayer() control function
        Player player = GameControl.createPlayer(value);

        if (player == null) { //if unseccessful
            ErrorView.display(this.getClass().getName(), 
                    "\nError creating the player.");
            return false;
        }
        //display next view
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        this.console.println("\n==============================================="
                + "\n Welcome to Stanger Things! " + player.getName()
                + "\n We wish you luck!"
                + "\n==============================================="
        );
        MainMenuView mainMenuView = new MainMenuView();

        mainMenuView.display();

    }

}


