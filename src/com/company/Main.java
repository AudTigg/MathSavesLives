/**
 * Created by audrey.gruian on 7/17/2017.
 */
package com.company;

import edu.digipen.Game;

import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {
        /* write your code here */
        Game.initialize(30,50,60, Level);
        while(Game.getQuit() == false)
            Game.update();
        Game.destroy();
    }
}

