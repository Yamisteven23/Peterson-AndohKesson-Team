/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.view;

import java.util.Scanner;

/**
 *
 * @author Isaac
 */
public class FightMonsterView extends View {

    public FightMonsterView() {
        super(
                "\n*****************************************************************"
                + "\n*                                                               *"
                + "\n* YOU HAVE COME ACROSS THE MONSTER! Do You Want to Run or Fight *"
                + "\n*****************************************************************"
                + "\n*********************************************"
                + "\n*                                           *"
                + "\n*                R-Run                      *"
                + "\n*                F-Fight                    *"
                + "\n*                                           *"
                + "\n*********************************************");

    }

    @Override
    public boolean doAction(String menuOption) {
        if (menuOption.toUpperCase().equals("F")) {
            TheFightView viewFight = new TheFightView();
            viewFight.display();
        } else if (menuOption.toUpperCase().equals("R")) {
            TheRunFromMonsterView viewMonster = new TheRunFromMonsterView();
            viewMonster.display();
        }

        return true;

    }

}
