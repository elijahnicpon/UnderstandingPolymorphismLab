import java.awt.*;
import java.util.Date;
import java.util.Random;

public class Hawk extends Bird {
    private int verminKilled;

    public Hawk(boolean isAlive, Date dob, String name,                         //Animal
                BeakSize beakSize, boolean flightCapable, Color wingColor,      //Bird
                int verminKilled) {                                             //Hawk
        super(isAlive, dob, name, beakSize, flightCapable, wingColor);
        this.verminKilled = verminKilled;
    }

    public void killVermin() {
        int randomInt = (int) Math.random() * 5;
        verminKilled += randomInt;
        System.out.println(getName() + " murdered " + randomInt + " vermin");
    }

    @Override
    public void fly() {
        System.out.println("flying! (but with wings flapping faster)");
    }
}
