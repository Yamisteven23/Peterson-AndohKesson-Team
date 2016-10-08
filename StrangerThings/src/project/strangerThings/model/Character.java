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
 * @author lkedohkess
 */
public class Character implements Serializable{
    private String name;
    private long numLives;
    private String description;
    private long location;

    public Character() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumLives() {
        return numLives;
    }

    public void setNumLives(long numLives) {
        this.numLives = numLives;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getLocation() {
        return location;
    }

    public void setLocation(long location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + (int) (this.numLives ^ (this.numLives >>> 32));
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + (int) (this.location ^ (this.location >>> 32));
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
        final Character other = (Character) obj;
        if (this.numLives != other.numLives) {
            return false;
        }
        if (this.location != other.location) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", numLives=" + numLives + ", description=" + description + ", location=" + location + '}';
    }

    
    
    
    
}
