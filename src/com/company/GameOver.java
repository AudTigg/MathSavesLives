package com.company;

import edu.digipen.Game;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;

/**
 * Created by lucas.lisboa on 7/19/2017.
 */
public class GameOver extends GameObject {
    public GameOver() {
        super("GameOver", 500, 500, "download.png");
        setRectangleCollider(0, 0);
    }
}
