package com.company;

import edu.digipen.gameobject.GameObject;

/**
 * Created by brandon.velarde on 7/20/2017.
 */
    public class road extends GameObject {
    public road() {
        super("road", 128*10, 128*10, "pixil-layer-Background.png");
    }

    @Override
    public void update(float dt) {
        setPositionY(getPositionY() - 5);

        if(getPositionY() < -128*10)
        {
            setPositionY(128*10);
        }
    }
}
