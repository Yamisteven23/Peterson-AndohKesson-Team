/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

import project.strangerThings.control.GameControl;
import strangerthings.StrangerThings;

/**
 *
 * @author Yamisteven23
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n----------------------------------"
                + "\n|         Main Menu              |"
                + "\n----------------------------------"
                + "\nN- New Game"
                + "\nR- Restore existing game"
                + "\nH- Help Menu"
                + "\nE- Exit Game"
                + "\n----------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        String choice = value.toUpperCase();

        switch (choice) {
            case "N": //create new game
                this.startNewGame();
                break;
            case "R": //restore existing game
                this.restoreExistingGame();
                break;
            case "H": //Help Menu
                this.helpMenu();
                break;
            case "S": //Secret Shack Menu for testing
                this.goToShack();
                break;
            case "F": //Secret Shack Menu for testing
                this.goFightMonster();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Please Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(StrangerThings.getPlayer());

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();
    }

    private void restoreExistingGame() {
        System.out.println("\n*** restoreExistingGame called ***");
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void goToShack() {
        TheShackView toShack = new TheShackView();
        toShack.display();
    }

    private void goFightMonster() {
        FightMonsterView toMonster = new FightMonsterView();
        toMonster.display();

    }

}
