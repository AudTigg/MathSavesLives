package com.company;

import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.graphics.Graphics;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;
import edu.digipen.math.Vec2;

import java.awt.event.KeyEvent;

/**
 * Created by audrey.gruian on 7/21/2017.
 */
public class ChooseCar extends GameLevel {
    @Override
    public void create() {
        GameObject welcome = new GameObject("welcome", 300,300, "welcome.png");
        ObjectManager.addGameObject(welcome);
        welcome.setPositionY(100);
        welcome.setPositionX(-300);

        GameObject toMath = new GameObject("toMath", 300, 300, "to-math.png");
        ObjectManager.addGameObject(toMath);
        toMath.setPositionY(100);
        toMath.setPositionX(-40);

        GameObject saveslive = new GameObject("saveslive", 300, 300, "saves-live.png");
        ObjectManager.addGameObject(saveslive);
        saveslive.setPositionY(100);
        saveslive.setPositionX(200);

        GameObject s = new GameObject("s", 300, 300, "s.png");
        ObjectManager.addGameObject(s);
        s.setPositionY(100);
        s.setPositionX(500);

        GameObject chooseCar = new GameObject("chooseCar", 300, 300, "choose-your-car.png");
        ObjectManager.addGameObject(chooseCar);
        chooseCar.setPositionY(0);

        GameObject fordGT = new GameObject("fordGT", 300, 300, "ford GT.png");
        ObjectManager.addGameObject(fordGT);
        fordGT.setPositionY(-200);
        fordGT.setPositionX(-400);

        GameObject bugatticyron = new GameObject("bugatticyron", 300, 300, "bugatti cyron.png");
        ObjectManager.addGameObject(bugatticyron);
        bugatticyron.setPositionY(-200);
        bugatticyron.setPositionX(400);

        GameObject lambohuracan = new GameObject("lambohuracan", 250, 250, "lambo hurican.png");
        ObjectManager.addGameObject(lambohuracan);
        lambohuracan.setPositionY(-200);
        lambohuracan.setPositionX(0);

        GameObject created = new GameObject("created", 250, 250, "created.png");
        ObjectManager.addGameObject(created);
        created.setPositionY(-500);
        created.setPositionX(-500);

        GameObject by_audrey = new GameObject("by_audrey", 250, 250, "by-audrey.png");
        ObjectManager.addGameObject(by_audrey);
        by_audrey.setPositionY(-500);
        by_audrey.setPositionX(-300);

        GameObject brandon = new GameObject("brandon", 250, 250, "brandon.png");
        ObjectManager.addGameObject(brandon);
        brandon.setPositionY(-500);
        brandon.setPositionX(-30);

        GameObject andlucas = new GameObject("andlucas", 250, 250, "and-lucas.png");
        ObjectManager.addGameObject(andlucas);
        andlucas.setPositionY(-500);
        andlucas.setPositionX(170);

        GameObject penguin = new GameObject("penguin", 250, 250, "PENguin1234.png");
        ObjectManager.addGameObject(penguin);
        penguin.setPositionY(-500);
        penguin.setPositionX(410);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void update(float v) {
        if(InputManager.isMouseButtonTriggered(0)) {
            Vec2 screenPos = InputManager.getMousePosition();
            Vec2 pos = Graphics.screenToWorldPoint(screenPos);

            System.out.println(pos);
            float x = pos.getX();
            float y = pos.getY();

            if (x > -463 && x < -307) {
                GameLevelManager.goToLevel(new Level1("ford GT.png"));
            }
            if (x > -160 && x < 60) {
                GameLevelManager.goToLevel(new Level1("lambo hurican.png"));}
            if (x > 307 && x < 463) {
                GameLevelManager.goToLevel(new Level1("bugatti cyron.png"));}
        }


    }

    @Override
    public void uninitialize() {

    }
}
