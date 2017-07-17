/**
 * Created by lucas.lisboa on 7/17/2017.
 */
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevel;

import java.util.Objects;

/**
 * Created by lucas.lisboa on 7/14/2017.
 */
public class Level1 extends GameLevel
{

    @Override
    public void create() {
        GameObject obj1 = new GameObject("Object1", 25, 45, "pixil-layer-Background (2).png");
        ObjectManager.addGameObject(obj1);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void update(float v) {

    }

    @Override
    public void uninitialize() {

    }
}
