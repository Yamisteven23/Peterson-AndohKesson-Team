/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

import java.util.Scanner;

/**
 *
 * @author Yamisteven23
 */
public class HelpMenuView {
    private String menu;

    void displayMenu() {
       boolean done = false;
        do{
        
        String helpMenuOption = this.getHelpMenuOption();
        if (helpMenuOption.toUpperCase().equals("E"))
            return;
        
        done = this.doAction(helpMenuOption);
        } while (!done);
    }

    public HelpMenuView() {
        this.menu = "\n"
                    +"\n----------------------------------"
                    +"\n|         Help Menu              |"
                    +"\n----------------------------------"
                    +"\nG- Goal of the Game"
                    +"\nS- Backstory of Stranger Things"
                    +"\nM- How to Move"
                    +"\nL- List of inventory on map"
                    +"\nB- How to manufacture upgraded weapons"
                    +"\nE-Exit"
                    +"\n----------------------------------";
    }

   private String getHelpMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initalize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine(); //get next line typed by keyboard
            value = value.trim(); //trim off leading and trailing whitespace
            
            if (value.length() < 1){ //value is blank
                System.out.println("\nInvalid value; value cannot be blank");
                continue;
            }
            break; //end the loop
            
        }
        return value; //return the value entered
    }

    private boolean doAction(String helpMenuOption) {
       String choice = helpMenuOption.toUpperCase();
        //change
        switch (choice){
            case "G": //create new game
                this.goalOfGame();
                break;
            case "S": //restore existing game
                this.backstory();
                break;
            case "M": //Help Menu
                this.howToMove();
                break;
            case "L": //Help Menu
                this.inventoryList();
                break;
            case "B": //Help Menu
                this.upgradeWeapon();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Please Try again");
                break;
        }
        return false;
    }

    private void goalOfGame() {
        System.out.println(
        "\n*****************************************************************"
       +"\n*                                                               *"
       +"\n* The three main characters Mike, Dustin, and Lucas are out on  *"
       +"\n* an adventure because they lost \"Eleven\". They are out in    *"
       +"\n* the woods with the monster, other creatures, and many         *"
       +"\n* obstacles such as government officals and the Sheriff. You    *"
       +"\n* will explore the map seeking required items in order to       *"
       +"\n* destroy the monster while avoiding the sheriff and the        *"
       +"\n* government. Using simple commands you will move your          *"
       +"\n* characters in order to complete the tasks that are needed     *"
       +"\n* to complete the game. Take one wrong turn you lose a life     *"
       +"\n* or the game will be over. You have three lives. Use them      *"
       +"\n* wisely and good luck on your adventure!                       *"
       +"\n*****************************************************************"
        
        
        );
    }

    private void backstory() {
        System.out.println(
        "\n*****************************************************************"
       +"\n*                                                               *"
       +"\n* Stranger Things is an American science fiction horror web     *"
       +"\n* television series created by the Duffer Brothers. The plot    *"
       +"\n* follows the disappearance of a young boy, and a telekinetic   *"
       +"\n* girl who helps his friends in their search. While the boy's   *"
       +"\n* older brother, his mother, and the town police sheriff start  *"
       +"\n* their own investigations.                                     *"
       +"\n*****************************************************************"
        
        
        );
    }

    private void howToMove() {
        System.out.println(
        "\n*****************************************************************"
       +"\n*                                                               *"
       +"\n* Stranger Things! is a text based role playing                 *"
       +"\n* game from the events in the Netflix original                  *"
       +"\n* series Stranger Things. You will be taking the                *"
       +"\n* role of 3 children named Mike, Lucas, and Dustin.             *"
       +"\n* One of thier friends went missing and Mike, Lucas             *"
       +"\n* and Dustin suspect foul play. While investigating             *"
       +"\n* they cross paths with another child named Eleven who          *"
       +"\n* has telekinesis powers. She helps Mike, Lucas, and            *"
       +"\n* Dustin discover that their friend was taken by a monster!     *"
       +"\n* They will have to devise a rescue plan to find a way          *"
       +"\n* to defeat the monster while avoiding the government           *"
       +"\n* and the Sheriff. While on your journey you lost Eleven,       *"
       +"\n* but are still looking for the required items to defeat        *"
       +"\n* the monster. If the government finds you then you will        *"
       +"\n* be taken. If the local sheriff finds you then he will         *"
       +"\n* send you home. As you explore the map you will search         *"
       +"\n* for the required items to build your master weapon. In        *"
       +"\n* this game you will start your journey with a flashlight,      *"
       +"\n* a shovel, and a backpack. You will move as a team in order    *"
       +"\n* to accomplish your goal of defeating the monster. Throughout  *"
       +"\n* the map there will be items placed that you can find in order *"
       +"\n* to make your master weapon. The route you take and rhe weapon *"
       +"\n* you make is up to you.                                        *"
       +"\n*                                                               *"
       +"\n*****************************************************************"
        
       /**/
        
        );
    }

    private void inventoryList() {
        System.out.println(
        "\n*****************************************************************"
       +"\n*                                                               *"
       +"\n* Stranger Things! is a text based role playing                 *"
       +"\n* game from the events in the Netflix original                  *"
       +"\n* series Stranger Things. You will be taking the                *"
       +"\n* role of 3 children named Mike, Lucas, and Dustin.             *"
       +"\n* One of thier friends went missing and Mike, Lucas             *"
       +"\n* and Dustin suspect foul play. While investigating             *"
       +"\n* they cross paths with another child named Eleven who          *"
       +"\n* has telekinesis powers. She helps Mike, Lucas, and            *"
       +"\n* Dustin discover that their friend was taken by a monster!     *"
       +"\n* They will have to devise a rescue plan to find a way          *"
       +"\n* to defeat the monster while avoiding the government           *"
       +"\n* and the Sheriff. While on your journey you lost Eleven,       *"
       +"\n* but are still looking for the required items to defeat        *"
       +"\n* the monster. If the government finds you then you will        *"
       +"\n* be taken. If the local sheriff finds you then he will         *"
       +"\n* send you home. As you explore the map you will search         *"
       +"\n* for the required items to build your master weapon. In        *"
       +"\n* this game you will start your journey with a flashlight,      *"
       +"\n* a shovel, and a backpack. You will move as a team in order    *"
       +"\n* to accomplish your goal of defeating the monster. Throughout  *"
       +"\n* the map there will be items placed that you can find in order *"
       +"\n* to make your master weapon. The route you take and rhe weapon *"
       +"\n* you make is up to you.                                        *"
       +"\n*                                                               *"
       +"\n*****************************************************************"
        
       /**/
        
        );
    }

    private void upgradeWeapon() {
        System.out.println(
        "\n*****************************************************************"
       +"\n*                                                               *"
       +"\n* Stranger Things! is a text based role playing                 *"
       +"\n* game from the events in the Netflix original                  *"
       +"\n* series Stranger Things. You will be taking the                *"
       +"\n* role of 3 children named Mike, Lucas, and Dustin.             *"
       +"\n* One of thier friends went missing and Mike, Lucas             *"
       +"\n* and Dustin suspect foul play. While investigating             *"
       +"\n* they cross paths with another child named Eleven who          *"
       +"\n* has telekinesis powers. She helps Mike, Lucas, and            *"
       +"\n* Dustin discover that their friend was taken by a monster!     *"
       +"\n* They will have to devise a rescue plan to find a way          *"
       +"\n* to defeat the monster while avoiding the government           *"
       +"\n* and the Sheriff. While on your journey you lost Eleven,       *"
       +"\n* but are still looking for the required items to defeat        *"
       +"\n* the monster. If the government finds you then you will        *"
       +"\n* be taken. If the local sheriff finds you then he will         *"
       +"\n* send you home. As you explore the map you will search         *"
       +"\n* for the required items to build your master weapon. In        *"
       +"\n* this game you will start your journey with a flashlight,      *"
       +"\n* a shovel, and a backpack. You will move as a team in order    *"
       +"\n* to accomplish your goal of defeating the monster. Throughout  *"
       +"\n* the map there will be items placed that you can find in order *"
       +"\n* to make your master weapon. The route you take and rhe weapon *"
       +"\n* you make is up to you.                                        *"
       +"\n*                                                               *"
       +"\n*****************************************************************"
        
       /**/
        
        );
    }
    
}
