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
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
        "\n**************************************************************"
       +"\n*                                                            *"
       +"\nStranger Things! is a text based role playing "
       +"\ngame from the events in the Netflix original "
       +"\nseries Stranger Things. You will be taking the "
       +"\nrole of 3 children named Mike, Lucas, and Dustin. "
       +"\nOne of thier friends went missing and Mike, Lucas "
       +"\nand Dustin suspect foul play. While investigating "
       +"\nthey cross paths with another child named Eleven who "
       +"\nhas telekinesis powers. She helps Mike, Lucas, and "
       +"\nDustin discover that their friend was taken by a monster! "
       +"\nThey will have to devise a rescue plan to find a way "
       +"\nto defeat the monster while avoiding the government "
       +"\nand the Sheriff. While on your journey you lost Eleven, "
       +"\nbut are still looking for the required items to defeat "
       +"\nthe monster. If the government finds you then you will "
       +"\nbe taken. If the local sheriff finds you then he will "
       +"\nsend you home. As you explore the map you will search "
       +"\nfor the required items to build your master weapon. In "
       +"\nthis game you will start your journey with a flashlight, "
       +"\na shovel, and a backpack. You will move as a team in order "
       +"\nto accomplish your goal of defeating the monster. Throughout "
       +"\nthe map there will be items placed that you can find in order "
       +"\nto make your master weapon. The route you take and rhe weapon "
       +"\nyou make is up to you."
       +"\n*                                                            *"
       +"\n**************************************************************"
        
       /**/
        
        );
    }

    public void displayStartProgramView() {
        
        boolean done = false;
        do{
            String playerName = this.getPlayerName();
            if (playerName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(playerName);
        } while (!done);
    }

    private String getPlayerName() {
        System.out.println("\n*** getPlayerName() called ***");
        return "Joe";
    }

    private boolean doAction(String playerName) {
        System.out.println("\n*** doAction() called ***");
        return true;
    }
    
    
}
