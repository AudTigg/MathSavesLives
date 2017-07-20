/**
 * Created by audrey.gruian on 7/17/2017.
 */
package com.company;

import edu.digipen.Game;
import edu.digipen.InputManager;

import java.awt.event.KeyEvent;

public class Main{
public static void main(String[] args) {
        Game.initialize(500, 500, 60, new MainMenu());
        while (Game.getQuit() == false)
            Game.update();
        Game.destroy();
    //this is so we can push

    }
}

