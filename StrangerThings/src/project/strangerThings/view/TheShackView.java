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
public class TheShackView extends View {

    public TheShackView() {
        
                super("\n*****************************************************************"
                + "\n*                                                               *"
                + "\n* You are in the forest and you see this shack left in the      *"
                + "\n* middle of nowhere! You think there is something in the shack  *"
                + "\n* that you can add to your weapon. You walk up to the shack,    *"
                + "\n* but when you try to open it you notice that there is a        *"
                + "\n* padlock that prevents you from opening it. Before you feel    *"
                + "\n* that you can't open the shack you notice a note on the        *"
                + "\n* ground. On the outside of the note it reads \"In case I       *"
                + "\n* forget the code\" Do you open the note or will you leave      *"
                + "\n* it be?                                                        *"
                + "\n*****************************************************************"
                + "\n*********************************************"
                + "\n*                                           *"
                + "\n*                Y-Yes                      *"
                + "\n*                N-No                       *"
                + "\n*                                           *"
                + "\n*********************************************");

    }

    

    

    @Override
    public boolean doAction(String menuOption) {
        if (menuOption.toUpperCase().equals("Y")) {
            TheNoteView viewNote = new TheNoteView();
            viewNote.display();
        }

        return true;
    }
}
