package com.company;

import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevel;
import edu.digipen.level.GameLevelManager;

import java.awt.event.KeyEvent;

/**
 * Created by audrey.gruian on 7/20/2017.
 */
public class MainMenu extends GameLevel {
    @Override
    public void create() {
        GameObject startText = new GameObject("StartText", 500, 500, "press_s.png");
        ObjectManager.addGameObject(startText);
        startText.setPositionY(100);
    }

    @Override
        public void initialize() {
        GameObject startText = new GameObject("StartText", 500, 500, "press_s.png");
        ObjectManager.addGameObject(startText);
        startText.setPositionY(100);
    }

    @Override
    public void update(float v) {
        if (InputManager.isPressed(KeyEvent.VK_S)) {
            GameLevelManager.goToLevel(new ChooseCar());
        }
    }

    @Override
    public void uninitialize() {

    }

}
