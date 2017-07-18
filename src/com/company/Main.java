/**
 * Created by audrey.gruian on 7/17/2017.
 */
package com.company;

import edu.digipen.Game;

import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {
        Object Game;
        Game.initialize(500,500,60, new Level1());
        while(Game.getQuit() == false)
            Game.update();
        Game.destroy();
    }
}

