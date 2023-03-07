import java.awt.*;
import java.util.Date;

public class Main {



    public static void main(String[] args) {
        Animal hawk1 = new Hawk(true, new Date(), "Hockey", BeakSize.LARGE, true, Color.red, 5);
        System.out.println(hawk1.toString());
    }
}
