package com.company;

public class grades {
    public double averageOfArray(int[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;
    }
}
