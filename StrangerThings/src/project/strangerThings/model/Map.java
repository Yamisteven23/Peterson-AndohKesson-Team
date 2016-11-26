/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.model;

import java.io.Serializable;
import project.strangerThings.model.Location;

/**
 *
 * @author lkedohkess
 */
public class Map implements Serializable{
    private int columnCount;
    private int rowCount;
    private Location[][] locations;

    public Map() {
    }
    
    public Map(int rowCount, int columnCount){
        if (columnCount < 1 || rowCount < 1){
            System.out.println("The number of rows and columns must be > zero");
             return;
        }
       this.columnCount = columnCount;
       this.rowCount = rowCount;
       
       this.locations = new Location[rowCount][columnCount];
       
       for (int row = 0; row < rowCount; row++){
           for (int column = 0; column < columnCount; column++){
               Location location = new Location();
               location.setColumn(column);
               location.setRow(row);
               location.setVisited(false);
               
               locations[row][column] = location;
           }
       }
           
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (int) (this.columnCount ^ (this.columnCount >>> 32));
        hash = 83 * hash + (int) (this.rowCount ^ (this.rowCount >>> 32));
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
        final Map other = (Map) obj;
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (this.rowCount != other.rowCount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "columnCount=" + columnCount + ", rowCount=" + rowCount + '}';
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] location) {
        this.locations = location;
    }

    
    
    
    
}
