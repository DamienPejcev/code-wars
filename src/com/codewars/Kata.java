package com.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static String highAndLow(String numbers) {
        String[] myNums = numbers.split(" ");
        List<Integer> numsAsInt = new ArrayList<>();

        for (String num : myNums) {
            numsAsInt.add(Integer.parseInt(num));
        }

        Collections.sort(numsAsInt);

        if (numsAsInt.size() == 1) {
            return numsAsInt.get(0) + " " + numsAsInt.get(0);
        } else if (numsAsInt.get(0) < 0) {
            return numsAsInt.get(numsAsInt.size() - 1) + " " + numsAsInt.get(0);
        } else {
            return numsAsInt.get(numsAsInt.size() - 1) + " " + numsAsInt.get(0);
        }
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("5 4 9 8"));
    }
}