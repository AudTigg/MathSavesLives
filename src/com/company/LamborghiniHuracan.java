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
    public LamborghiniHuracan() {
        super("LamborghiniHuracan", 120, 160, "lambo hurican.png");
        setRectangleCollider(40, 80);
    }

    @Override
    public void update(float dt) {
        if (InputManager.isPressed(KeyEvent.VK_RIGHT)) {
            float x = getPositionX();
            x += 3;
            setPositionX(x);
        }
        if (InputManager.isPressed(KeyEvent.VK_LEFT)) {
            float x = getPositionX();
            x += -3;
            setPositionX(x);
        }
        if (InputManager.isPressed(KeyEvent.VK_D)) {
            float x = getPositionX();
            x += 3;
            setPositionX(x);
        }
        if (InputManager.isPressed(KeyEvent.VK_A)) {
            float x = getPositionX();
            x += -3;
            setPositionX(x);

        }
        if (InputManager.isPressed(KeyEvent.VK_SPACE)){
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
        Graphics.setDrawCollisionData(true);
        ObjectManager.;

    }
}
