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
    private int row;
    private int column;
    private boolean visited;
    private long amountRemaining;
    private Item[] placedItems = new Item[3];
    private Scene scene;
    private Character character;
    private Question questionScene;

    public Location() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
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

    public Item[] getPlacedItems() {
        return placedItems;
    }

    public void setPlacedItems(Item[] placedItems) {
        this.placedItems = placedItems;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Question getQuestionScene() {
        return questionScene;
    }

    public void setQuestionScene(Question questionScene) {
        this.questionScene = questionScene;
    }

   
    
}
