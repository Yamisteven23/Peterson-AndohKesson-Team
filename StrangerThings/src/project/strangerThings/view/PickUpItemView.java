/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

/**
 *
 * @author Isaac
 */
public class PickUpItemView extends View{

    public PickUpItemView() {
        
         super("\n*****************************************************************"
                + "\n*                                                               *"
                + "\n* To continue to manufacture your weapon to defeat the monster, *"
                + "\n* you can decide to pick any or all items in this location.     *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*                                                               *"
                + "\n*  N- Nails                                                     *"
                + "\n*  B- Barbed Wire                                               *"
                + "\n*  G- Glass shards                                              *"
                + "\n*  T- Thorns                                                    *"
                + "\n*  R- Rocks                                                     *"
                + "\n*  S- Sharpened piece of metal                                  *"
                + "\n*  A- All items.                                                *"
                + "\n*                                                               *"
                + "\n*****************************************************************");
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
            case "R": //Rocks
                this.rocks();
                break;
            case "S": //Sharpened Piece of Metal
                this.sharpenedPieceOfMetal();
                break;
            case "A": //Select all items in location
                this.allItems();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Please Try again");
                break;
        }
        return true;
    }

    private void nails() {
        System.out.println("\n***   nails has been added to your weapon  ***");
    }

    private void barbedWire() {
        System.out.println("\n***   barbed Wire has been added to your weapon  ***");
    }

    private void glassShards() {
        System.out.println("\n***   glass shards has been added to your weapon  ***");
    }

    private void thorns() {
        System.out.println("\n***   thorns has been added to your weapon  ***");
    }

    private void rocks() {
        System.out.println("\n***   rocks has been added to your weapon  ***");
    }

    private void sharpenedPieceOfMetal() {
        System.out.println("\n***   sharpened piece of Metal has been added to your weapon  ***");
    }

    private void allItems() {
        System.out.println("\n***   all items has been added to your weapon  ***");
    }

    
}
