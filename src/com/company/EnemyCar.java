package com.company;

import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

import java.awt.event.KeyEvent;

/**
 * Created by lucas.lisboa on 7/18/2017.
 */
public class EnemyCar extends GameObject {
    public EnemyCar() {
        super("EnemyCar", 120, 160, "car-Copy.png");
        setRectangleCollider(40,80);
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