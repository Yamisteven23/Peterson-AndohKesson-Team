/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strangerthings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import project.strangerThings.model.Location;
import project.strangerThings.model.Player;
import project.strangerThings.model.Question;
import project.strangerThings.model.Scene;
import project.strangerThings.model.Character;
import project.strangerThings.model.Item;
import project.strangerThings.model.Map;
import project.strangerThings.model.Game;
import project.strangerThings.view.ErrorView;
import project.strangerThings.view.StartProgramView;

/**
 *
 * @author Isaac
 */
public class StrangerThings {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        StrangerThings.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        StrangerThings.player = player;
    }

    public static void main(String[] args) {
        //create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        
        try {
            
            StrangerThings.inFile = new BufferedReader(new InputStreamReader(System.in));
            StrangerThings.outFile = new PrintWriter(System.out, true);
            String filePath = "log.txt";
            StrangerThings.logFile = new PrintWriter(filePath);
            startProgramView.display();
        } catch (Throwable te){
            System.err.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
         finally {
            try {
                if (StrangerThings.inFile != null)
                StrangerThings.inFile.close();
                
                if (StrangerThings.outFile != null)
                    StrangerThings.outFile.close();
                
                if (StrangerThings.logFile != null)
                    StrangerThings.logFile.close();
            } catch (IOException ex) {
                ErrorView.display("Stranger Things",
                        "\n*** Error closing files");
                return;
            }
            
        }
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        StrangerThings.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        StrangerThings.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        StrangerThings.logFile = logFile;
    }
    
}
