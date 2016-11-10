/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

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
                System.out.println("\n*** Invalid selection *** Please Try again");
                break;
        }
        return true;
    }

    private void broom() {
        System.out.println("\n***   broom selected  ***");

    }

    private void hockeyStick() {
        System.out.println("\n***   Hockey Stick selected  ***");
    }

    private void golfClub() {
        System.out.println("\n***   Golf Club selected  ***");
    }

    private void lacrosseStick() {
        System.out.println("\n***   Lacrosse Stick selected  ***");
    }

    private void cricketPaddle() {
        System.out.println("\n***   Cricket Paddle selected  ***");
    }

    private void baseballBat() {
        System.out.println("\n***   Baseball Bat selected  ***");
    }

    private void tennisRacket() {
        System.out.println("\n***   Tennis Racket selected  ***");
    }

    private void drumStick() {
        System.out.println("\n***   Drum Stick selected  ***");
    }

}
