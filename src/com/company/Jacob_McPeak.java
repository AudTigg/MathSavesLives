package com.company;

import edu.digipen.gameobject.GameObject;

/**
 * Created by lucas.lisboa on 7/20/2017.
 */
public class Jacob_McPeak extends GameObject {
    public Jacob_McPeak() {
        super ("Jacob_McPeak", 60, 140, "car - Copy.png");
        setRectangleCollider(30, 70);
    }

    float counter = 0;

    @Override
    public void update(float dt){
        counter += dt;
        System.out.println(counter);
        setPositionY(getPositionY() -counter);

    }
}
