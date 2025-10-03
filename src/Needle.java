import java.util.*;

public class Needle {

    private Random generator;

    public Needle() {
        generator = new Random();
    }

    public double runExperiment(int totalDrops) {
        int hits = 0;

        for (int i = 0; i < totalDrops; i++) {
            double y_low = generator.nextDouble() * 2.0;
            double alpha = generator.nextDouble() * 180.0;
            double alphaRadians = Math.toRadians(alpha);
            double y_high = y_low + Math.sin(alphaRadians);

            if (y_high >= 2.0) {
                hits++;
            }
        }

        if (hits == 0) {
            return 0.0;
        }

        return (double) totalDrops / hits;
    }
}
