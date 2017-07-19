package com.company;

import edu.digipen.gameobject.GameObject;

/**
 * Created by audrey.gruian on 7/19/2017.
 */
public class Bubbles extends GameObject {
    public Bubbles(){
        super("Bubbles", 20, 20, "pixil-layer-Background.png");
        setCircleCollider(10);

    }
    @Override
    public void update(float dt) {
        setPositionY(getPositionY() + 2);

    }
    @Override
    public void collisionReaction(GameObject collidedWith) {
        if(!collidedWith.getName().equals("LamborghiniHuracan") && !collidedWith.getName().equals("Bubbles"))
        {
            collidedWith.kill();
            kill();
        }
        if (collidedWith.getName().equals("DivisionCar") || collidedWith.getName().equals("EnemyCar") || collidedWith.getName().equals("Pi")){
            collidedWith.kill();
            kill();
        }
    }
}
