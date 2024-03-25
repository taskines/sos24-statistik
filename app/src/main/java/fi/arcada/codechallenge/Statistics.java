package fi.arcada.codechallenge;

public class Statistics {
    public static double calcMean(double[] data) {
        double sum = 0;
        for (double value : data) {
            sum += value;
        }
        return sum / data.length;
    }

}

