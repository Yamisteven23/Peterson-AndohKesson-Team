/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.model;

import java.io.Serializable;

/**
 *
 * @author lkedohkess
 */
public class Game implements Serializable{
    private double timePlayed;

    public Game() {
    }

    public double getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(double timePlayed) {
        this.timePlayed = timePlayed;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.timePlayed) ^ (Double.doubleToLongBits(this.timePlayed) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.timePlayed) != Double.doubleToLongBits(other.timePlayed)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "timePlayed=" + timePlayed + '}';
    }

    public void setTimePlayed(String _minutes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
