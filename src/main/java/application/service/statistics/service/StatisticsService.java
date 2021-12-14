package application.service.statistics.service;

public class StatisticsService implements Calculations {
    @Override
    public double calculateMedian(double[] arr) {
        double[] values;
        double temp;
        double median;
        values = arr;
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] > values[j]) {
                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }
        if (values.length % 2 == 0) {
            median = (values[values.length / 2] + values[values.length / 2 - 1]) / 2;
            return median;
        } else return ((double) values[values.length / 2]);
    }
    @Override
    public double calculateSum(double[] arr) {
        double[] values;
        values = arr;
        double total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        return total;
    }

    @Override
    public double calculateAverage(double[] arr) {
        double[] values;
        values = arr;
        double total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        return total / values.length;
    }
}
