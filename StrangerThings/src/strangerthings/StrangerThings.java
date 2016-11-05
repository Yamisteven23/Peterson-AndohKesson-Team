/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strangerthings;

import project.strangerThings.model.Location;
import project.strangerThings.model.Player;
import project.strangerThings.model.Question;
import project.strangerThings.model.Scene;
import project.strangerThings.model.Character;
import project.strangerThings.model.Item;
import project.strangerThings.model.Map;
import project.strangerThings.model.Game;
import project.strangerThings.view.StartProgramView;

/**
 *
 * @author Isaac
 */
public class StrangerThings {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        StrangerThings.currentGame = currentGame;
    }

    private static Player player = null;

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        StrangerThings.player = player;
    }

    public static void main(String[] args) {
        //create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();

    }
}
