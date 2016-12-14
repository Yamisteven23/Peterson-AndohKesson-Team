/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

import java.util.ArrayList;
import project.strangerThings.model.Item;
import project.strangerThings.model.Character;
import project.strangerThings.model.Item;
import project.strangerThings.model.ItemEnum;
import strangerthings.StrangerThings;
import project.strangerThings.control.MapControl;
/**
 *
 * @author Isaac
 */
public class PickUpItemView extends View{

    public PickUpItemView(String name) {
        
        if (name == "Forest"){
            System.out.println("\n*****************************************************************"
                + "\n*                                                               *"
                + "\n* To continue to manufacture your weapon to defeat the monster, *"
                + "\n* you can decide which item to pick from this location.         *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*  N- Nails                                                     *"
                + "\n*  T- Thorns                                                    *"
                + "\n*  S- Sharpened piece of metal                                  *"
                + "\n*                                                               *"
                + "\n*****************************************************************");
        } else if (name == "Junkyard"){
            System.out.println("\n*****************************************************************"
                + "\n*                                                               *"
                + "\n* To continue to manufacture your weapon to defeat the monster, *"
                + "\n* you can decide which item to pick from this location.         *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*  G- Glass shards                                              *"
                + "\n*  T- Thorns                                                    *"
                + "\n*  S- Sharpened piece of metal                                  *"
                + "\n*                                                               *"
                + "\n*****************************************************************");
        } else if (name == "Forest2"){
            System.out.println("\n*****************************************************************"
                + "\n*                                                               *"
                + "\n* To continue to manufacture your weapon to defeat the monster, *"
                + "\n* you can decide which item to pick from this location.         *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*  B- Barbed Wire                                               *"
                + "\n*  G- Glass shards                                              *"
                + "\n*  SS- Staples                                                  *"
                + "\n*                                                               *"
                + "\n*****************************************************************");
        } else if (name == "Forest3"){
            System.out.println("\n*****************************************************************"
                + "\n*                                                               *"
                + "\n* To continue to manufacture your weapon to defeat the monster, *"
                + "\n* you can decide which item to pick from this location.         *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*  N- Nails                                                     *"
                + "\n*  B- Barbed Wire                                               *"
                + "\n*  SS- Staples                                                  *"
                + "\n*                                                               *"
                + "\n*****************************************************************");
        } else {
            System.out.println("\n*****************************************************************"
                + "\n*                                                               *"
                + "\n* To continue to manufacture your weapon to defeat the monster, *"
                + "\n* you can decide which item to pick from this location.         *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*  G- Glass shards                                              *"
                + "\n*  T- Thorns                                                    *"
                + "\n*  SS- Staples                                                  *"
                + "\n*                                                               *"
                + "\n*****************************************************************");
        }
        
     /*    super("\n*****************************************************************"
                + "\n*                                                               *"
                + "\n* To continue to manufacture your weapon to defeat the monster, *"
                + "\n* you can decide which item to pick from this location.         *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*  N- Nails                                                     *"
                + "\n*  B- Barbed Wire                                               *"
                + "\n*  G- Glass shards                                              *"
                + "\n*  T- Thorns                                                    *"
                + "\n*  S- Sharpened piece of metal                                  *"
                + "\n*  SS- Staples                                                  *"
                + "\n*                                                               *"
                + "\n*****************************************************************");*/
    }

    @Override
    public boolean doAction(String value) {
        String choice = value.toUpperCase();

        switch (choice) {
            case "N": //Nails
                this.nails();
                break;
            case "B": //Barbed Wire
                this.barbedWire();
                break;
            case "G": //Glass Shards
                this.glassShards();
                break;
            case "T": //Thorns
                this.thorns();
                break;
            case "S": //Sharpened Piece of Metal
                this.sharpenedPieceOfMetal();
                break;
            case "SS": //Staples
                this.Staples();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Please Try again");
                break;
        }
        return true;
    }

    private void nails() {
        ArrayList<Item> inventory = StrangerThings.getCurrentGame().getCurrentCharacter().getInventoryList();
        Item item = StrangerThings.getCurrentGame().getInventory()[ItemEnum.Nail.ordinal()].clone();
        item.setQuantity(1);
        inventory.add(item);
        this.console.println("\n***   nails has been added");
    }

    private void barbedWire() {
        ArrayList<Item> inventory = StrangerThings.getCurrentGame().getCurrentCharacter().getInventoryList();
        Item item = StrangerThings.getCurrentGame().getInventory()[ItemEnum.BarbedWire.ordinal()].clone();
        item.setQuantity(1);
        inventory.add(item);
        this.console.println("\n***   barbed Wire has been added");
    }

    private void glassShards() {
        ArrayList<Item> inventory = StrangerThings.getCurrentGame().getCurrentCharacter().getInventoryList();
        Item item = StrangerThings.getCurrentGame().getInventory()[ItemEnum.GlassShard.ordinal()].clone();
        item.setQuantity(1);
        inventory.add(item);
        this.console.println("\n***   glass shards has been added");
    }

    private void thorns() {
        ArrayList<Item> inventory = StrangerThings.getCurrentGame().getCurrentCharacter().getInventoryList();
        Item item = StrangerThings.getCurrentGame().getInventory()[ItemEnum.Thorn.ordinal()].clone();
        item.setQuantity(1);
        inventory.add(item);
        this.console.println("\n***   thorns has been added");
    }

   private void sharpenedPieceOfMetal() {
       ArrayList<Item> inventory = StrangerThings.getCurrentGame().getCurrentCharacter().getInventoryList();
        Item item = StrangerThings.getCurrentGame().getInventory()[ItemEnum.SharpMetal.ordinal()].clone();
        item.setQuantity(1);
        inventory.add(item);
        this.console.println("\n***   sharpened piece of Metal has been added");
    }

    private void Staples() {
        ArrayList<Item> inventory = StrangerThings.getCurrentGame().getCurrentCharacter().getInventoryList();
        Item item = StrangerThings.getCurrentGame().getInventory()[ItemEnum.Staples.ordinal()].clone();
        item.setQuantity(1);
        inventory.add(item);
        this.console.println("\n*** Staples added ");
    }

    
}
