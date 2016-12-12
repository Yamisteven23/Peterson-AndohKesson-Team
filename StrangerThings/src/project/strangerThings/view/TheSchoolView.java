/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

import java.util.ArrayList;
import project.strangerThings.model.Item;
import project.strangerThings.model.ItemEnum;
import strangerthings.StrangerThings;

/**
 *
 * @author Yamisteven23
 */
public class TheSchoolView extends View {

    public TheSchoolView() {

        super("\n*********************************************************************"
                + "\n*                                                               *"
                + "\n* You see the school that you go to. Lucas thinks it would      *"
                + "\n* be a good idea to search the school to find a base item       *"
                + "\n* for your weapon. You split up to see what you can find.       *"
                + "\n* these are your results:                                       *"
                + "\n*                                                               *"
                + "\n*  BB- Baseball bat                                             *"
                + "\n*  H- Hockey Stick                                              *"
                + "\n*  G- Golf club                                                 *"
                + "\n*  L- Lacrosse stick                                             *"
                + "\n*  C- Cricket paddle                                            *"
                + "\n*  T- Tennis racket                                             *"
                + "\n*  B- Broom                                                     *"
                + "\n*  D- Drum stick                                                *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*  Choose your weapon wisely                                    *"
                + "\n*****************************************************************");
    }

    @Override
    public boolean doAction(String value) {
        String choice = value.toUpperCase();

        switch (choice) {
            case "B": //Broom
                this.broom();
                break;
            case "H": //Hockey Stick
                this.hockeyStick();
                break;
            case "G": //Golf Club
                this.golfClub();
                break;
            case "L": //Lacrosse Stick
                this.lacrosseStick();
                break;
            case "C": //Cricket Paddle
                this.cricketPaddle();
                break;
            case "BB": //Baseball Bat
                this.baseballBat();
                break;
            case "T": //Tennis Racket
                this.tennisRacket();
                break;
            case "D": //Drum Stick
                this.drumStick();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Please Try again");
                break;
        }
        return true;
    }

    private void broom() {
        ArrayList<Item> inventory = StrangerThings.getCurrentGame().getCurrentCharacter().getInventoryList();
        Item item = StrangerThings.getCurrentGame().getInventory()[ItemEnum.Broom.ordinal()].clone();
        item.setQuantity(1);
        inventory.add(item);
      this.console.println("\n***   broom selected  ***");

    }

    private void hockeyStick() {
        ArrayList<Item> inventory = StrangerThings.getCurrentGame().getCurrentCharacter().getInventoryList();
        Item item = StrangerThings.getCurrentGame().getInventory()[ItemEnum.HockeyStick.ordinal()].clone();
        item.setQuantity(1);
        inventory.add(item);
        this.console.println("\n***   Hockey Stick selected  ***");
    }

    private void golfClub() {
        ArrayList<Item> inventory = StrangerThings.getCurrentGame().getCurrentCharacter().getInventoryList();
        Item item = StrangerThings.getCurrentGame().getInventory()[ItemEnum.GolfClub.ordinal()].clone();
        item.setQuantity(1);
        inventory.add(item);
        this.console.println("\n***   Golf Club selected  ***");
    }

    private void lacrosseStick() {
        ArrayList<Item> inventory = StrangerThings.getCurrentGame().getCurrentCharacter().getInventoryList();
        Item item = StrangerThings.getCurrentGame().getInventory()[ItemEnum.LacrosseStick.ordinal()].clone();
        item.setQuantity(1);
        inventory.add(item);
       this.console.println("\n***   Lacrosse Stick selected  ***");
    }

    private void cricketPaddle() {
        ArrayList<Item> inventory = StrangerThings.getCurrentGame().getCurrentCharacter().getInventoryList();
        Item item = StrangerThings.getCurrentGame().getInventory()[ItemEnum.CricketPaddle.ordinal()].clone();
        item.setQuantity(1);
        inventory.add(item);
        this.console.println("\n***   Cricket Paddle selected  ***");
    }

    private void baseballBat() {
        ArrayList<Item> inventory = StrangerThings.getCurrentGame().getCurrentCharacter().getInventoryList();
        Item item = StrangerThings.getCurrentGame().getInventory()[ItemEnum.BaseballBat.ordinal()].clone();
        item.setQuantity(1);
        inventory.add(item);
        this.console.println("\n***   Baseball Bat selected  ***");
    }

    private void tennisRacket() {
        ArrayList<Item> inventory = StrangerThings.getCurrentGame().getCurrentCharacter().getInventoryList();
        Item item = StrangerThings.getCurrentGame().getInventory()[ItemEnum.TennisRacket.ordinal()].clone();
        item.setQuantity(1);
        inventory.add(item);
        this.console.println("\n***   Tennis Racket selected  ***");
    }

    private void drumStick() {
        ArrayList<Item> inventory = StrangerThings.getCurrentGame().getCurrentCharacter().getInventoryList();
        Item item = StrangerThings.getCurrentGame().getInventory()[ItemEnum.DrumStick.ordinal()].clone();
        item.setQuantity(1);
        inventory.add(item);
        this.console.println("\n***   Drum Stick selected  ***");
    }

}
