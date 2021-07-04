package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main5 {
    public static void main(String[] args) {

        Random random = new Random();
        Set<Integer> numberSet = new HashSet<>();


        for (int i = 0; i < 10; i++) {
            numberSet.add(random.nextInt(10));
        }
        System.out.print(numberSet);
    }
    }