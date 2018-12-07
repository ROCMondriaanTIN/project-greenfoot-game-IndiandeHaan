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
    }

    @Override
    public void act() {
        int x = getX();
        int y = getY();
    }
}
