package com.company;

import edu.digipen.gameobject.GameObject;

/**
 * Created by lucas.lisboa on 7/18/2017.
 */
public class Pi extends GameObject{

    public Pi() {
        super("P1", 60, 60, "pixil-layer-Background (3).png ");
        setRectangleCollider(30, 30);
    }

    @Override
    public void update(float dt) {
        setPositionY(getPositionY() - 2);
    }
}
