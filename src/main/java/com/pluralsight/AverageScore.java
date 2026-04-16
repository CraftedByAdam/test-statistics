package com.pluralsight;

public class AverageScore {
    public static void main(String[] args) {
        int[] testScore = {67, 73, 89, 25, 98, 100, 92, 62, 71, 10};

        int total = 0;

        for (int score : testScore) {
            total += score;
        }
        System.out.println(total);
    }
}
