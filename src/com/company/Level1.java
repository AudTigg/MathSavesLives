package com.company;
/**
 * Created by lucas.lisboa on 7/17/2017.
 */
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.graphics.Graphics;
import edu.digipen.level.GameLevel;
import edu.digipen.math.PFRandom;

import java.util.Random;

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
Random r = new Random(5);
        enemycar.setPositionY(300);
        enemycar.setPositionX(60);

        GameObject divisionCar = new DivisionCar();
        ObjectManager.addGameObject(divisionCar);

        divisionCar.setPositionY(300);

        GameObject LamborghiniHuracan = new LamborghiniHuracan();
        ObjectManager.addGameObject(LamborghiniHuracan);

        LamborghiniHuracan.setPositionY(-150);

        int i = 0;
        while (i < 10) {
            GameObject obj1 = new EnemyCar();
            obj1.setPosition(PFRandom.randomRange(-450, 450), 200 + i * 50);
            ObjectManager.addGameObject(obj1);
            ++i;
        }
        GameObject Pi = new Pi();
        ObjectManager.addGameObject(Pi);
        Pi.setPositionY(150);
        Pi.setPositionX(-30);

        Graphics.setDrawCollisionData(true);
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
