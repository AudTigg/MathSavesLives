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
public class Level1 extends GameLevel {

   float spawnTimer = 1.0f;

    int getRandomValue(int min, int max) {
        Random r = new Random();
        return Math.abs(r.nextInt() % ((max + 1) - min) + min);
    }


    @Override
    public void create() {
        //GameObject obj1 = new GameObject("Object1", 160, 180, "pixil-layer-Background (2).png");
        //ObjectManager.addGameObject(obj1);
        /*GameObject bubble = new GameObject("Bubble", 100, 100, "pixil-layer-Background (1).png");
        ObjectManager.addGameObject(bubble);*/
        // GameObject obj1 = new GameObject("car", 64, 64, "car - Copy.png" );



        GameObject road1 = new road();
        road1.setPositionY(0);

        GameObject road2 = new road();
        road2.setPositionY(128*10-5);

        GameObject road3 = new road();
        road3.setPositionY(128*20-5);


        int i = 0;
        while (i < 1) {
            GameObject enemycar = new EnemyCar();
            ObjectManager.addGameObject(enemycar);

            int lane = getRandomValue(0, 2);

            if (lane == 0) {
                enemycar.setPositionX(-320);
            } else if (lane == 1) {
                enemycar.setPositionX(0);
            } else if (lane == 2) {
                enemycar.setPositionX(320);
            }

            enemycar.setPositionY(300 + i * 300);

            ++i;
        }

        int i1 = 0;
        while (i1 < 1) {
            GameObject divisionCar = new DivisionCar();
            ObjectManager.addGameObject(divisionCar);
            int lane1 = getRandomValue(0, 2);
            if (lane1 == 0) {
                divisionCar.setPositionX(-320);
            } else if (lane1 == 1) {
                divisionCar.setPositionX(0);
            } else if (lane1 == 2) {
                divisionCar.setPositionX(320);
            }

            divisionCar.setPositionY(300 + i1 * 500);
            ++i1;
        }
        int i2 = 0;
        while (i2 < 1) {
            GameObject Pi = new Pi();
            ObjectManager.addGameObject(Pi);
            int lane2 = getRandomValue(0, 2);
            if (lane2 == 0) {
                Pi.setPositionX(-320);
            } else if (lane2 == 1) {
                Pi.setPositionX(0);
            } else if (lane2 == 2) {
                Pi.setPositionX(320);
            }

            Pi.setPositionY(300 + i2 * 1000);
            ++i2;
        }
        GameObject LamborghiniHuracan = new LamborghiniHuracan();
        ObjectManager.addGameObject(LamborghiniHuracan);

        LamborghiniHuracan.setPositionY(-150);


        int i3 = 0;
        while (i3 <1) {
            GameObject Jacob_McPeak = new Jacob_McPeak();
            ObjectManager.addGameObject(Jacob_McPeak);
            int lane3 = getRandomValue(0, 2);
            if (lane3 == 0) {
                Jacob_McPeak.setPositionX(-320);
            } else if (lane3 == 1) {
                Jacob_McPeak.setPositionX(0);
            } else if (lane3 == 2) {
                Jacob_McPeak.setPositionX(320);
            }
            Jacob_McPeak.setPositionY(300 + i3 * 300);
            ++i3;
        }
//        int i = 0;
//        while (i < 10) {
//            GameObject obj1 = new EnemyCar();
//            obj1.setPosition(PFRandom.randomRange(-450, 450), 200 + i * 50);
//            ObjectManager.addGameObject(obj1);
//            ++i;
//        }
    }

    @Override
    public void initialize() {

    }

    @Override
    public void update(float v) {

        //int counter;
        //if(counter >= 5)
        {
            // Create car
          //  counter = 0;
        }

    }

    @Override
    public void uninitialize() {

    }
}
