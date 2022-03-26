package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> filter = new ArrayList<>();
        for (int x : intList) {
            if (x % 2 == 0 && x > 0) {
                filter.add(x);
            }
        }
        Collections.sort(filter);
        for (Integer result : filter) {
            System.out.print(result + " ");
        }
    }
}
