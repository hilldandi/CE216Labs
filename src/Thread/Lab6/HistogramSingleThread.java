package Thread.Lab6;

import java.io.*;
import java.util.*;

public class HistogramSingleThread {
    public static void main(String[] args) throws IOException {
        String[] files = {"num01.txt", "num02.txt", "num03.txt", "num04.txt"};

        for (String file : files) {
            calculateAndPrintHistogram(file);
        }
    }

    private static void calculateAndPrintHistogram(String filename) throws IOException {
        int[] histogram = new int[1000]; // Belirli bir aralıkta değerlere sahip olduğunu varsayıyoruz.
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;

        while ((line = reader.readLine()) != null) {
            int number = Integer.parseInt(line.trim());
            int index = number / 100;
            if (index < histogram.length) {
                histogram[index]++;
            }
        }
        reader.close();

        System.out.println("File: " + filename);
        for (int i = 0; i < histogram.length; i++) {
            if (histogram[i] > 0) {
                System.out.printf("%d-%d: %d values%n", i * 100, (i + 1) * 100 - 1, histogram[i]);
            }
        }
    }
}
