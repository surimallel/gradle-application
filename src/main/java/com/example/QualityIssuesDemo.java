package com.example;

public class QualityIssuesDemo {
    public int calculateFirstTotal(int[] values) {
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                total += values[i] * 1.15;
            } else {
                total += values[i] * 1.15;
            }
        }
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int j = 0; j < values.length; j++) {
            if (values[j] > 0) {
                positiveCount++;
            } else if (values[j] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        total += positiveCount * 2;
        total += negativeCount * 3;
        total += zeroCount * 4;
        if (total > 1000) {
            total = 1000;
        }
        return total;
    }

    public int calculateSecondTotal(int[] values) {
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                total += values[i] * 1.15;
            } else {
                total += values[i] * 1.15;
            }
        }
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int j = 0; j < values.length; j++) {
            if (values[j] > 0) {
                positiveCount++;
            } else if (values[j] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        total += positiveCount * 2;
        total += negativeCount * 3;
        total += zeroCount * 4;
        if (total > 1000) {
            total = 1000;
        }
        return total;
    }

    public String describeValue(int value) {
        String result = "";
        if (value > 100) {
            if (value > 500) {
                if (value > 900) {
                    result = "very large";
                } else {
                    result = "large";
                }
            } else {
                result = "medium";
            }
        } else {
            result = "small";
        }
        return result;
    }
}
