import java.util.ArrayList;

public class WeatherData {
    /** Guaranteed not to be null and to contain only non-null entries */
    private ArrayList<Double> temperatures;

    public WeatherData(ArrayList<Double> temps) {
        temperatures = temps;
    }

    public ArrayList<Double> getTemps() {
        return temperatures;
    }

    /**
    * Cleans the data by removing from temperatures all values that are less than
    * lower and all values that are greater than upper, as described in part (a)
    */
    public void cleanData(double lower, double upper) {
        for (int i=temperatures.size()-1;i>=0;i--) {
            if (temperatures.get(i)<lower||temperatures.get(i)>upper) temperatures.remove(i);
        }
    }

    /**
    * Returns the length of the longest heat wave found in temperatures, as described in
    * part (b)
    * Precondition: There is at least one heat wave in temperatures based on threshold.
    */
    public int longestHeatWave(double threshold) {
        int longestStreak = 0;
        int currStreak = 0;
        for (int i=0;i<temperatures.size();i++) {
            if (temperatures.get(i)>threshold) currStreak++;
            else {
                if (currStreak>longestStreak) longestStreak = currStreak;
                currStreak = 0;
            }
        }
        return longestStreak;
    }
}