package com.company; // Push
/** // Push
 * Created by lucas.lisboa on 7/17/2017. // Push
 */ // Push
 // Push
import edu.digipen.gameobject.GameObject; // Push
import edu.digipen.gameobject.ObjectManager; // Push
import edu.digipen.graphics.Graphics; // Push
import edu.digipen.level.GameLevel; // Push
import edu.digipen.math.PFRandom; // Push
 // Push
import java.util.Random; // Push
//this is so we can push // Push
 // Push
/** // Push
 * Created by lucas.lisboa on 7/14/2017. // Push
 */ // Push
public class Level1 extends GameLevel { // Push
 // Push
   float spawnTimer = 1.0f; // Push
 // Push
    int getRandomValue(int min, int max) { // Push
        Random r = new Random(); // Push
        return Math.abs(r.nextInt() % ((max + 1) - min) + min); // Push
    } // Push
 // Push
 // Push
    @Override // Push
    public void create() { // Push
        //GameObject obj1 = new GameObject("Object1", 160, 180, "pixil-layer-Background (2).png"); // Push
        //ObjectManager.addGameObject(obj1); // Push
        /*GameObject bubble = new GameObject("Bubble", 100, 100, "pixil-layer-Background (1).png"); // Push
        ObjectManager.addGameObject(bubble);*/ // Push
        // GameObject obj1 = new GameObject("car", 64, 64, "car - Copy.png" ); // Push
 // Push
        int i = 0; // Push
        while (i < 1) { // Push
            GameObject enemycar = new EnemyCar(); // Push
            ObjectManager.addGameObject(enemycar); // Push
 // Push
            int lane = getRandomValue(0, 2); // Push
 // Push
            if (lane == 0) { // Push
                enemycar.setPositionX(-320); // Push
            } else if (lane == 1) { // Push
                enemycar.setPositionX(0); // Push
            } else if (lane == 2) { // Push
                enemycar.setPositionX(320); // Push
            } // Push
 // Push
            enemycar.setPositionY(300 + i * 300); // Push
 // Push
            ++i; // Push
        } // Push
 // Push
        int i1 = 0; // Push
        while (i1 < 1) { // Push
            GameObject divisionCar = new DivisionCar(); // Push
            ObjectManager.addGameObject(divisionCar); // Push
            int lane1 = getRandomValue(0, 2); // Push
            if (lane1 == 0) { // Push
                divisionCar.setPositionX(-320); // Push
            } else if (lane1 == 1) { // Push
                divisionCar.setPositionX(0); // Push
            } else if (lane1 == 2) { // Push
                divisionCar.setPositionX(320); // Push
            } // Push
 // Push
            divisionCar.setPositionY(300 + i1 * 500); // Push
            ++i1; // Push
        } // Push
        int i2 = 0; // Push
        while (i2 < 1) { // Push
            GameObject Pi = new Pi(); // Push
            ObjectManager.addGameObject(Pi); // Push
            int lane2 = getRandomValue(0, 2); // Push
            if (lane2 == 0) { // Push
                Pi.setPositionX(-320); // Push
            } else if (lane2 == 1) { // Push
                Pi.setPositionX(0); // Push
            } else if (lane2 == 2) { // Push
                Pi.setPositionX(320); // Push
            } // Push
 // Push
            Pi.setPositionY(300 + i2 * 1000); // Push
            ++i2; // Push
        } // Push
        GameObject LamborghiniHuracan = new LamborghiniHuracan(); // Push
        ObjectManager.addGameObject(LamborghiniHuracan); // Push
 // Push
        LamborghiniHuracan.setPositionY(-150); // Push
 // Push
 // Push
        int i3 = 0; // Push
        while (i3 <1) { // Push
            GameObject Jacob_McPeak = new Jacob_McPeak(); // Push
            ObjectManager.addGameObject(Jacob_McPeak); // Push
            int lane3 = getRandomValue(0, 2); // Push
            if (lane3 == 0) { // Push
                Jacob_McPeak.setPositionX(-320); // Push
            } else if (lane3 == 1) { // Push
                Jacob_McPeak.setPositionX(0); // Push
            } else if (lane3 == 2) { // Push
                Jacob_McPeak.setPositionX(320); // Push
            } // Push
            Jacob_McPeak.setPositionY(300 + i3 * 300); // Push
            ++i3; // Push
        } // Push
//        int i = 0;
//        while (i < 10) {
//            GameObject obj1 = new EnemyCar();
//            obj1.setPosition(PFRandom.randomRange(-450, 450), 200 + i * 50);
//            ObjectManager.addGameObject(obj1);
//            ++i;
//        }
    }

    @Override// Push
    public void initialize() {// Push
// Push
    }// Push
// Push
    @Override// Push
    public void update(float v) {// Push
// Push
        int counter = 0;
        if(counter >= 5)
        {
           GameObject EnemyCar = new EnemyCar();// Push
            ObjectManager.addGameObject(EnemyCar);// Push
            counter = 0;// Push
        }// Push
// Push
    }// Push
// Push
    @Override// Push
    public void uninitialize() {// Push
// Push
    }// Push
}
