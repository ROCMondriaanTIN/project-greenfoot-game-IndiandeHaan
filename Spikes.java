public class Spikes extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;

    public Spikes(String image) {
        super();
        setImage(image);
        getImage().mirrorHorizontally();
        walkRange = 0;
        firstAct = true;
        speed = 0;
    }

    @Override
    public void act() {
        int x = getX();
        int y = getY();

        if (firstAct) {
            firstAct = false;
            xMin = x - walkRange / 2;
            xMax = x + walkRange / 2;
        }

        velocityX = speed;
        applyVelocity();
    }
}
