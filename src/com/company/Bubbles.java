package com.company;

import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;

/**
 * Created by audrey.gruian on 7/19/2017.
 */
public class Bubbles extends GameObject {

    public Bubbles() {
        super("Bubbles", 100, 100, "pixil-layer-Background (1).png");
        setCircleCollider(10);

    }

    @Override
    public void update(float dt) {
        setPositionY(getPositionY() + 3);

    }

    @Override
    public void collisionReaction(GameObject collidedWith) {
  //      if (!collidedWith.getName().equals("LamborghiniHuracan") && !collidedWith.getName().equals("Bubbles")) {
   //         collidedWith.kill();
    //        kill();
       // }
        if (collidedWith.getName().equals("DivisionCar") || collidedWith.getName().equals("EnemyCar")){
            collidedWith.kill();
            kill();
        }
       if (collidedWith.getName().equals("P1")){
           collidedWith.kill();
           kill();
           LamborghiniHuracan player = (LamborghiniHuracan) ObjectManager.getGameObjectByName("LamborghiniHuracan");
           player.lives++;
           System.out.println("test");
           player.score++;

           player.scoreText.Change("player.scoreText");
       }
        if (collidedWith.getName().equals("DivisionCar")) {

            collidedWith.kill();
            LamborghiniHuracan player = (LamborghiniHuracan) ObjectManager.getGameObjectByName("LamborghiniHuracan");
            player.lives -= 7;
            player.livesText.Change("player.livesText");
            if (player.lives <= 0) {
                kill();
                GameObject gameOver = new GameOver();
                ObjectManager.addGameObject(gameOver);
            }
        }
    }
}
