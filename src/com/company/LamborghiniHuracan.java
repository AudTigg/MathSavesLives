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
    static int score = 0;
    SpriteText scoreText = new SpriteText("score " + score, 40, SpriteText.Alignment.CENTER,20, 550,500);
    float lives = 10;
    SpriteText livesText = new SpriteText("score " + score, 40, SpriteText.Alignment.CENTER,20, -550,500);
    public LamborghiniHuracan(String texturePath) {
        super("LamborghiniHuracan", 180, 220, texturePath);
        setRectangleCollider(40, 80);
    }
    private float shootDelayMax = 1;
    private float shootDelay = 1;
    @Override
    public void update(float dt) {
        scoreText.Change("Score "+ score);
        livesText.Change("Lives "+ (int)lives);
        shootDelay -= dt;
        if (InputManager.isPressed(KeyEvent.VK_RIGHT)) {
            float x = getPositionX();
            x += 5;
            setPositionX(x);
            float xx = getPositionX();
            if (xx <= -500) {
                setPositionX(0);
            }
            if (xx >= 500) {
                setPositionX(0);
            }
        }
        if (InputManager.isPressed(KeyEvent.VK_LEFT)) {
            float x = getPositionX();
            x += -5;
            setPositionX(x);
            float xx = getPositionX();
            if (xx <= -500) {
                setPositionX(0);
            }
            if (xx >= 500) {
                setPositionX(0);
            }
        }
        if (InputManager.isPressed(KeyEvent.VK_D)) {
            float x = getPositionX();
            x += 5;
            setPositionX(x);
            float xx = getPositionX();
            if (xx <= -500) {
                setPositionX(0);
            }
            if (xx >= 500) {
                setPositionX(0);
            }
        }
        if (InputManager.isPressed(KeyEvent.VK_A)) {
            float x = getPositionX();
            x += -5;
            setPositionX(x);

        }
        if (InputManager.isPressed(KeyEvent.VK_SPACE) && shootDelay <= 0) {
            {
                GameObject bubble = new Bubbles();
                ObjectManager.addGameObject(bubble);
                Graphics.setCollisionDataColor(0, 1, 0);
                float x = getPositionX();
                bubble.setPosition(x, -30);
                shootDelay = shootDelayMax;
            }
        }
    }

    @Override
    public void collisionReaction(GameObject collidedWith) {
        if (collidedWith.getName().equals("EnemyCar")) {
            collidedWith.kill();
            lives += -1;
            if (lives <= 0) {
                kill();
                GameObject gameOver = new GameOver();
                ObjectManager.addGameObject(gameOver);
            }
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
        if (collidedWith.getName().equals("P1")) {
            collidedWith.kill();
            lives++;
            if (lives <= 0) {
                kill();
                GameObject gameOver = new GameOver();
                ObjectManager.addGameObject(gameOver);
            }
        }
        if (collidedWith.getName().equals("Jacob_McPeak")) {
            collidedWith.kill();
            lives += -3;
            if (lives <= 0) {
                kill();
                GameObject gameOver = new GameOver();
                ObjectManager.addGameObject(gameOver);
            }
        }
    }
}

