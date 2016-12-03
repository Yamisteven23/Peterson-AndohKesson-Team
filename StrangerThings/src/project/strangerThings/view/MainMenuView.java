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
                + "\nS- Shack View"
                + "\nF- Fight Monster View"
                + "\nB- School View"
                + "\nP- Pick up items view"
                + "\nX- Exit Game"
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
            case "F": //Secret Fight Monster for testing
                this.goFightMonster();
                break;
            case "B": //Secret Fight Monster for testing
                this.goToSchool();
                break;
            case "P": //Secret Fight Monster for testing
                this.pickItems();
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
        gameMenu.display();
    }

    private void restoreExistingGame() {
        System.out.println("\n*** restoreExistingGame called ***");
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void goToShack() {
        TheShackView toShack = new TheShackView();
        toShack.display();
    }

    private void goFightMonster() {
        FightMonsterView toMonster = new FightMonsterView();
        toMonster.display();

    }

    private void goToSchool() {
        TheSchoolView toSchool = new TheSchoolView();
        toSchool.display();
    }

    private void pickItems() {
        PickUpItemView pickItem = new PickUpItemView();
        pickItem.display();
    }

}
