
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Coins extends Collectables {
    private int coins;
    
    
    public Coins(String image) {
        super();
        setImage(image);
        coins = 1;
    }    
    @Override
    public void act() {
        for (Actor enemy : getIntersectingObjects(Coins.class )) {
            if (enemy != null) {
                getMyWorld.removeObject(this);
           }
        }
    }
    public int getWidth() {
        return getImage().getWidth();
    }
    public int getHeight() {
        return getImage().getHeight();
    }
}
