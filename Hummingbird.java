import java.awt.*;
import java.util.Date;

public class Hummingbird extends Bird {

    private int nectarConsumed;

    public Hummingbird(boolean isAlive, Date dob, String name,
                       BeakSize beakSize, boolean flightCapable, Color wingColor,
                       int milliLitersSlurpedFromMyMomsHummingBirdFeeder) {
        super(isAlive, dob, name, beakSize, flightCapable, wingColor);
        this.nectarConsumed = milliLitersSlurpedFromMyMomsHummingBirdFeeder;
    }

    // TODO 2.3.1: Implement makeNoise() here.



    // TODO 4.2: Override the `toString()` method here.



    private void slurp() {
        nectarConsumed += 10;
        System.out.println("slurrrrrp. total nectar consumed: " + nectarConsumed + "ml");
    }

    @Override
    public void fly() {
        System.out.println("flying! (but with wings flapping faster)");
    }
}
