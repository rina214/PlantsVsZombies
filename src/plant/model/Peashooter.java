package plant.model;

import Pea.model.Pea;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Armin on 6/25/2016.
 */
public class Peashooter extends Plant {

    public Timer shootTimer;


    public Peashooter(int x, int y) {
        super(x, y);
        shootTimer = new Timer(2000, (ActionEvent e) -> {
            //System.out.println("SHOOT");
            if (getGp().getLaneZombies().get(y).size() > 0) {
                getGp().getLanePeas().get(y).add(new Pea(y, 103 + this.getX() * 100));
            }
        });
        shootTimer.start();
    }

    @Override
    public void stop() {
        shootTimer.stop();
    }

}