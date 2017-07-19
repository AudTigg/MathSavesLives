package com.company;

import edu.digipen.gameobject.GameObject;

/**
 * Created by audrey.gruian on 7/19/2017.
 */
public class Bubbles extends GameObject {
    public Bubbles(){
        super("Bubbles", 20, 20, "pixil-layer-Background.png");
        setRectangleCollider(10,10);
    }
}
