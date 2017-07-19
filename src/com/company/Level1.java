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
int getRandomValue(int min, int max){
    Random r = new Random();
    return r.nextInt() * ((max + 1) - min) + min;
}



    @Override
    public void create() {
        //GameObject obj1 = new GameObject("Object1", 160, 180, "pixil-layer-Background (2).png");
        //ObjectManager.addGameObject(obj1);
        /*GameObject bubble = new GameObject("Bubble", 100, 100, "pixil-layer-Background (1).png");
        ObjectManager.addGameObject(bubble);*/
        // GameObject obj1 = new GameObject("car", 64, 64, "car - Copy.png" );


        GameObject enemycar = new EnemyCar();
        ObjectManager.addGameObject(enemycar);

        int lane = getRandomValue(0, 2);
        if (lane == 0) {
            enemycar.setPositionX(-40);
        }
        else if (lane == 1) {
            enemycar.setPositionX(0);
        }
        else if (lane == 2) {
            enemycar.setPositionX(40);
        }

        enemycar.setPositionY(300);

        GameObject divisionCar = new DivisionCar();
        ObjectManager.addGameObject(divisionCar);
        int lane1 = getRandomValue(0, 2);
        if (lane1 == 0) {
            divisionCar.setPositionX(-40);
        }
else if (lane1 == 1) {
            divisionCar.setPositionX(0);
        }
        else if (lane1 == 2) {
            divisionCar.setPositionX(40);
        }
        divisionCar.setPositionY(300);
        GameObject Pi = new Pi();
        ObjectManager.addGameObject(Pi);
        int lane2 = getRandomValue(0, 2);
        if (lane2 == 0) {
            Pi.setPositionX(-40);
        }
        else if (lane2 == 1) {
            Pi.setPositionX(0);
        }
        else if (lane2 == 2) {
            Pi.setPositionX(40);
        }

        Pi.setPositionY(300);

        GameObject LamborghiniHuracan = new LamborghiniHuracan();
        ObjectManager.addGameObject(LamborghiniHuracan);

        LamborghiniHuracan.setPositionY(-150);

//        int i = 0;
//        while (i < 10) {
//            GameObject obj1 = new EnemyCar();
//            obj1.setPosition(PFRandom.randomRange(-450, 450), 200 + i * 50);
//            ObjectManager.addGameObject(obj1);
//            ++i;
//        }

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
