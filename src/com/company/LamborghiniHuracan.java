package com.company;

import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.graphics.Graphics;

import java.awt.event.KeyEvent;

/**
 * Created by lucas.lisboa on 7/18/2017.
 */

    public class LamborghiniHuracan extends GameObject {
    int lives = 5;
    public LamborghiniHuracan() {
        super("LamborghiniHuracan", 120, 160, "lambo hurican.png");
        setRectangleCollider(40, 80);
    }

    @Override
    public void update(float dt) {
        if (InputManager.isPressed(KeyEvent.VK_RIGHT)) {
            float x = getPositionX();
            x += 10;
            setPositionX(x);
        }
        if (InputManager.isPressed(KeyEvent.VK_LEFT)) {
            float x = getPositionX();
            x += -10;
            setPositionX(x);
        }
        if (InputManager.isPressed(KeyEvent.VK_D)) {
            float x = getPositionX();
            x += 10;
            setPositionX(x);
        }
        if (InputManager.isPressed(KeyEvent.VK_A)) {
            float x = getPositionX();
            x += -10;
            setPositionX(x);

        }
        if (InputManager.isTriggered(KeyEvent.VK_SPACE)){
            {
                GameObject bubble = new Bubbles();
                ObjectManager.addGameObject(bubble);
                Graphics.setCollisionDataColor(0,1,0);
                float x = getPositionX();
                bubble.setPosition(x,-30);


            }
        }
    }

    @Override
    public void collisionReaction(GameObject collidedWith) {
        if (collidedWith.getName().equals("EnemyCar")){
            collidedWith.kill();
            lives += -1;
            if (lives <= 0){
                kill();
                GameObject gameOver = new GameOver();
                ObjectManager.addGameObject(gameOver);
            }
        }
        if (collidedWith.getName().equals("DivisionCar")){
            collidedWith.kill();
            lives += -3;
            if (lives <= 0){
                kill();
                GameObject gameOver = new GameOver();
                ObjectManager.addGameObject(gameOver);
            }
        }
        if (collidedWith.getName().equals("Jacob_McPeak")){
            collidedWith.kill();
            lives += -3;
            if (lives <= 0){
                kill();
                GameObject gameOver = new GameOver();
                ObjectManager.addGameObject(gameOver);
            }
        }
        if (collidedWith.getName().equals("Pi")){
            collidedWith.kill();
            lives += 1;
            if (lives <= 0){
                kill();
                GameObject gameOver = new GameOver();
                ObjectManager.addGameObject(gameOver);
            }
        }
    }
}
