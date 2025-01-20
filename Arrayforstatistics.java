package class1;

import java.util.Arrays;

public class Arrayforstatistics {
	
	    public static void main(String[] args) {
	        int[] data = {5, 9, 4, 7, 9, 0, 9, 2, 11};

	        double mean = calculateMean(data);
	        System.out.println("Mean: " + mean);

	        double median = calculateMedian(data);
	        System.out.println("Median: " + median);

	        double stdDev = calculateStandardDeviation(data, mean);
	        System.out.println("Standard Deviation: " + stdDev);
	    }

	    private static double calculateMean(int[] data) {
	        double sum = 0;
	        for (int num : data) {
	            sum += num;
	        }
	        return sum / data.length;
	    }

	    private static double calculateMedian(int[] data) {
	        Arrays.sort(data);
	        int a = data.length;
	        if (a % 2 == 0) {
	            return (data[a / 2 - 1] + data[a / 2]) / 2.0;
	        } else {
	            return data[a  / 2];
	        }
	    }
	    private static double calculateStandardDeviation(int[] data, double mean) {
	        double sumSquaredDifferences = 0;
	        for (int num : data) {
	            sumSquaredDifferences += Math.pow(num - mean, 2);
	        }
	        return Math.sqrt(sumSquaredDifferences / data.length);
	}
}
