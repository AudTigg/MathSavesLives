package com.company;

import edu.digipen.gameobject.GameObject;

/**
 * Created by lucas.lisboa on 7/18/2017.
 */
public class EnemyCar extends GameObject {
    public EnemyCar() {
        super("EnemyCar", 120, 160, "pixil-layer-Background (2).png");
        setScaleY(-1);
    }

    @Override
    public void update(float dt) {
        // setRotation(getRotation() + 3);
    }
}
