/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

import java.util.Scanner;
import java.awt.Point;
import project.strangerThings.control.GameControl;
import project.strangerThings.control.MapControl;
import project.strangerThings.exceptions.MapControlException;
import project.strangerThings.model.Game;
import strangerthings.StrangerThings;
import project.strangerThings.model.Location;
import project.strangerThings.model.Character;

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
                + "\nX- Exit Menu                     |"
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
        Point location = StrangerThings.getCurrentGame().getCurrentCharacter().getCoordinates();
        double x = location.getX();
        double y = location.getY();
        x -= 1;
        location.setLocation(x, y);
        Character mike = StrangerThings.getCurrentGame().getCurrentCharacter();
        try{
           MapControl.moveCharacterToLocation(mike, location);
       } catch (MapControlException me){
           System.out.println("\n*** having trouble moving tothat location");
       }
    }

    private void south() {
        Point location = StrangerThings.getCurrentGame().getCurrentCharacter().getCoordinates();
        double x = location.getX();
        double y = location.getY();
        x += 1;
        location.setLocation(x, y);
        Character mike = StrangerThings.getCurrentGame().getCurrentCharacter();
        try{
           MapControl.moveCharacterToLocation(mike, location);
       } catch (MapControlException me){
           System.out.println("\n*** having trouble moving tothat location");
       }
           
        
          }

    private void east() {
        Point location = StrangerThings.getCurrentGame().getCurrentCharacter().getCoordinates();
        double x = location.getX();
        double y = location.getY();
        y += 1;
        location.setLocation(x, y);
        Character mike = StrangerThings.getCurrentGame().getCurrentCharacter();
        try{
           MapControl.moveCharacterToLocation(mike, location);
       } catch (MapControlException me){
           System.out.println("\n*** having trouble moving tothat location");
       }
    }

    private void west() {
        Point location = StrangerThings.getCurrentGame().getCurrentCharacter().getCoordinates();
        double x = location.getX();
        double y = location.getY();
        y -= 1;
        location.setLocation(x, y);
        Character mike = StrangerThings.getCurrentGame().getCurrentCharacter();
        try{
           MapControl.moveCharacterToLocation(mike, location);
       } catch (MapControlException me){
           System.out.println("\n*** having trouble moving tothat location");
       }
    }
}
