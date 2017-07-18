package com.company;

import edu.digipen.gameobject.GameObject;

/**
 * Created by lucas.lisboa on 7/18/2017.
 */
public class DivisionCar extends GameObject {
    public DivisionCar() {
        super("DivisionCar", 120, 160, "pixil-layer-Background (4).png");
        setScaleY(-1);
    }
    @Override
        public void update(float dt) {
        setPositionY(getPositionY() - 3);
        }

}
