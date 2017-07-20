package com.company;

import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;

/**
 * Created by audrey.gruian on 7/19/2017.
 */
public class Bubbles extends GameObject {
    int lives = 5;
    public Bubbles() {
        super("Bubbles", 20, 20, "pixil-layer-Background.png");
        setCircleCollider(10);

    }

    @Override
    public void update(float dt) {
        setPositionY(getPositionY() + 2);

    }

    @Override
    public void collisionReaction(GameObject collidedWith) {
        if (!collidedWith.getName().equals("LamborghiniHuracan") && !collidedWith.getName().equals("Bubbles")) {
            collidedWith.kill();
            kill();
        }
        if (collidedWith.getName().equals("DivisionCar") || collidedWith.getName().equals("EnemyCar")){
            collidedWith.kill();
            kill();
        }
       if (collidedWith.getName().equals("Pi")){
           collidedWith.kill();
           kill();
           lives += +1;
       }
        if (collidedWith.getName().equals("DivisionCar")) {
            collidedWith.kill();
            lives += -2;
            if (lives <= 0) {
                kill();
                GameObject gameOver = new GameOver();
                ObjectManager.addGameObject(gameOver);
            }
        }
    }
}
