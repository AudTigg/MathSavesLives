/**
 * Created by audrey.gruian on 7/17/2017.
 */
package com.company;

import edu.digipen.Game;

public class Main {

    public static void main(String[] args) {

        Game.initialize(500, 500, 60, new Level1());
        while(Game.getQuit() == false)
            Game.update();
        Game.destroy();
    }
}

