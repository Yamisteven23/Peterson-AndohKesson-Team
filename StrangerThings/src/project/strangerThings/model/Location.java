/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.model;

import java.io.Serializable;

/**
 *
 * @author Yamisteven23
 */
public class Location implements Serializable{
    private long row;
    private long column;
    private long visited;
    private long amountRemaining;

    public Location() {
    }

    public long getRow() {
        return row;
    }

    public void setRow(long row) {
        this.row = row;
    }

    public long getColumn() {
        return column;
    }

    public void setColumn(long column) {
        this.column = column;
    }

    public long getVisited() {
        return visited;
    }

    public void setVisited(long visited) {
        this.visited = visited;
    }

    public long getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(long amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.row ^ (this.row >>> 32));
        hash = 37 * hash + (int) (this.column ^ (this.column >>> 32));
        hash = 37 * hash + (int) (this.visited ^ (this.visited >>> 32));
        hash = 37 * hash + (int) (this.amountRemaining ^ (this.amountRemaining >>> 32));
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        return this.amountRemaining == other.amountRemaining;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", amountRemaining=" + amountRemaining + '}';
    }

   
    
}
