package com.company;

import edu.digipen.gameobject.GameObject;

/**
 * Created by audrey.gruian on 7/19/2017.
 */
public class Bubbles extends GameObject {
    public Bubbles(){
        super("Bubbles", 100, 100, "pixil-layer-Background (1).png");
        setRectangleCollider(40,80);
    }
}
