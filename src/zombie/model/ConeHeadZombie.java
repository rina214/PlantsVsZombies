package zombie.model;

import Game.view.GamePanel;

/**
 * Created by Armin on 6/29/2016.
 */
public class ConeHeadZombie extends Zombie {

    public ConeHeadZombie(GamePanel parent, int lane) {
        super(lane);
        setHealth(1800);
    }
}
