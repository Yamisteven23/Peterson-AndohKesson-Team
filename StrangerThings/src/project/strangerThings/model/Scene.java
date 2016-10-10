/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Yamisteven23
 */
public class Scene implements Serializable{
    private String description;
    private String mapSymbol;

    public Scene() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.description);
        hash = 83 * hash + Objects.hashCode(this.mapSymbol);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return Objects.equals(this.mapSymbol, other.mapSymbol);
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", mapSymbol=" + mapSymbol + '}';
    }
    
    
    
}
