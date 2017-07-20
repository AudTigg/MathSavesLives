package com.company;

import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;

/**
 * Created by lucas.lisboa on 7/18/2017.
 */
public class DivisionCar extends GameObject {
    public DivisionCar(){
        super("DivisionCar", 80, 140, "pixil-layer-Background (4).png");
        setRectangleCollider(40, 70);
    }
    @Override
    public void update(float dt) {
        setPositionY(getPositionY() - 2);
    }
    @Override
    public void collisionReaction(GameObject collidedWith){
        if(collidedWith.getName().equals("Bubbles"))
        {
            collidedWith.kill();
            kill();
        }
    }
}
