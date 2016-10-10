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
public class Map implements Serializable{
    private long columnCount;
    private long rowCount;

    public Map() {
    }

    public long getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(long columnCount) {
        this.columnCount = columnCount;
    }

    public long getRowCount() {
        return rowCount;
    }

    public void setRowCount(long rowCount) {
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
    
    
    
}
