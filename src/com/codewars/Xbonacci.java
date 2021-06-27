package com.codewars;

import java.util.Arrays;

public class Xbonacci {

    public static double[] tribonacci(double[] s, int n) {

        double[] result = new double[n];

        double n1 = s[0];
        double n2 = s[1];
        double n3 = s[2];
        double n4 = 0;

        for (int i = 0; i < n; i++) {
            result[i] = n1;
            n4 = n1 + n2 + n3;
            n1 = n2;
            n2 = n3;
            n3 = n4;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double[]{0.0, 0.0, 1.0}, 10)));
    }
}
