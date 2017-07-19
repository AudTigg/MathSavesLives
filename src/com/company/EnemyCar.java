package com.company;

import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

import java.awt.event.KeyEvent;

/**
 * Created by lucas.lisboa on 7/18/2017.
 */
public class EnemyCar extends GameObject {
    public EnemyCar() {
        super("EnemyCar", 60, 140, "car - Copy.png");
        setRectangleCollider(30,70);
    }



    @Override
    public void update(float dt) {
        setPositionY(getPositionY() - 2);
        // setRotation(getRotation() + 3);
       /* if(InputManager.isPressed(KeyEvent.VK_LEFT)){
            float x = getPositionX();
            x+= -3;
            setPositionX(x);
        }
        if (InputManager.isPressed(KeyEvent.VK_RIGHT)){
            float x = getPositionX();
            x += 3;
            setPositionX(x);*/
        }
    }