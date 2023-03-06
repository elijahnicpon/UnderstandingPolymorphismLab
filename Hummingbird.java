import java.awt.*;
import java.util.Date;

public class Hummingbird extends Bird {

    private int milliLitersSlurpedFromMyMomsHummingBirdFeeder;

    public Hummingbird(boolean isAlive, Date dob, String name,
                       BeakSize beakSize, boolean flightCapable, Color wingColor,
                       int milliLitersSlurpedFromMyMomsHummingBirdFeeder) {
        super(isAlive, dob, name, beakSize, flightCapable, wingColor);
        this.milliLitersSlurpedFromMyMomsHummingBirdFeeder = milliLitersSlurpedFromMyMomsHummingBirdFeeder;
    }


    private void slurp() {
        milliLitersSlurpedFromMyMomsHummingBirdFeeder += 10;
        System.out.println("slurrrrrp. total: " + milliLitersSlurpedFromMyMomsHummingBirdFeeder);
    }

    @Override
    public void fly() {
        System.out.println("flying! (but with wings flapping faster)");
    }
}
