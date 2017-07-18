package com.company; /**
 * Created by lucas.lisboa on 7/17/2017.
 */
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevel;

import java.util.Objects;

/**
 * Created by lucas.lisboa on 7/14/2017.
 */
public class Level1 extends GameLevel
{

    @Override
    public void create() {
        //GameObject obj1 = new GameObject("Object1", 160, 180, "pixil-layer-Background (2).png");
        //ObjectManager.addGameObject(obj1);
        /*GameObject bubble = new GameObject("Bubble", 100, 100, "pixil-layer-Background (1).png");
        ObjectManager.addGameObject(bubble);*/
        GameObject enemycar = new EnemyCar();
        ObjectManager.addGameObject(enemycar);

        GameObject divisionCar = new GameObject("divisionCar",120,160,"pixil-layer-Background (4).png");
        ObjectManager.addGameObject(divisionCar);



    }

    @Override
    public void initialize() {

    }

    @Override
    public void update(float v) {
    }

    @Override
    public void uninitialize() {

    }
}
