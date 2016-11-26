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
public enum Item implements Serializable {
    Shovel("Shovel","This is a shovel that Lucas brought with him. Use it to find items","Start Item",0,1),
    Flashlight("Flashlight","This is a flashlight that Mike brought with him so you can see in the dark","Start Item",0,1),
    BaseballBat("Baseball Bat", "This is a baseball bat from the school", "Base Item", 5, 1),
    HockeyStick("Hockey Stick", "This is a hockey stick from the school", "Base Item", 5, 1),
    GolfClub("Golf Club", "This is a golf club from the school", "Base Item", 5, 1),
    LacrosseStick("Lacrosse Stick", "This a lacrosse stick found on the field of the school", "Base Item", 5, 1),
    CricketPaddle("Cricket Paddle", "This is a cricket paddle found at the school", "Base Item", 5, 1),
    TennisRacket("Tennis Racket", "This is a tennis racket found on the court at the school", "Base Item", 3, 1),
    Broom("Broom", "This is a broom found in the janitor's closet at the school", "Base Item", 4, 1),
    DrumStick("Drum Stick", "This is a drum stick found in the band room at the school","Base Item", 1, 1),
    Nail("Nail", "This is a rusty nail that you found in the forest", "Addition Item", 1, 15),
    BarbedWire("Barbed Wire", "This is some barbed wire you found near a fence at the park", "Addition Item", 1, 13),
    GlassShard("Glass Shard", "This is some glass you found on the ground", "Addition Item", 1, 16),
    Thorn("Thorn", "This is a thorn that you found at a rose bush in the forest","Addition Item", 1, 20),
    SharpMetal("Sharp shard of metal","This is a sharp shard of metal you found on the ground","Addition Item", 1,18),
    Staples("Staples","These are some used staples you found on the ground","Addition Item", 1,13),
    Dust("Dust","This is the magic dust you found in the shed that boosts your master weapon","Addition Item", 10,1);

    private final String name;
    private final String description;
    private final String type;
    private final long power;
    private final long quantity;

    Item(String name, String description, String type, long power, long quantity) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.power = power;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public long getPower() {
        return power;
    }

    public long getQuantity() {
        return quantity;
    }

}
