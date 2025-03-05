import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        double[] array1 = {99.1,142.0,85.0,85.1,84.6,94.3,124.9,98.0,101.0,102.5};
        ArrayList<Double> t1 = new ArrayList<>();
        for (double n:array1) t1.add(n);
        WeatherData w1 = new WeatherData(t1);
        w1.cleanData(85.0, 120.0);
        System.out.println(w1.getTemps());

        double[] array2 = {100.5,98.5,102.0,103.9,87.5,105.2,90.3,94.8,109.1,102.1,107.4,93.2};
        ArrayList<Double> t2 = new ArrayList<>();
        for (double n:array2) t2.add(n);
        WeatherData w2 = new WeatherData(t2);
        System.out.println(w2.longestHeatWave(100.5));
        System.out.println(w2.longestHeatWave(95.2));        
    }
}