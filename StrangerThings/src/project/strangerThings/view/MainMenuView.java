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
                + "\nN- New Game                      |"
                + "\nR- Restore existing game         |"
                + "\nH- Help Menu                     |"
                + "\nS- Save Game                     |"
                + "\nX- Exit Game                     |"
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
            case "S": //Save Game
                this.savegame();
                break;    
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Please Try again");
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
         this.console.println(
                "\n\nEnter the file path for the file where the game is to be saved.");
         String filePath = this.getInput();
         
         try{
             //start a saved game
             GameControl.getSavedGame(filePath);
         } catch (Exception ex) {
             ErrorView.display("MainMenuView", ex.getMessage());
         }
         
         //display the game menu
         GameMenuView gameMenu = new GameMenuView();
         gameMenu.display();
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void savegame() {
      // prompt for and get the name os the file to save the game in
      this.console.println("\n\nEnter the file path for the file where the game is to be saved.");
      String filePath = this.getInput();
      
      try{
          //save the game to the specified file
          GameControl.saveGame(StrangerThings.getCurrentGame(), filePath);
      } catch (Exception ex){
          ErrorView.display("MainMenuView", ex.getMessage());
      }
    }

}
