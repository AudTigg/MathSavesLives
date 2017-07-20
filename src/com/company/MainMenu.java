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

    }

    @Override
        public void initialize() {
            GameObject startText = new GameObject("StartText", 400, 400, "press_s.png");
            startText.setPositionY(100);
            ObjectManager.addGameObject(startText);

            }

    @Override
    public void update(float v) {
        if (InputManager.isPressed(KeyEvent.VK_S)) {
            GameLevelManager.goToLevel(new Level1());
        }
    }

    @Override
    public void uninitialize() {

    }

}
