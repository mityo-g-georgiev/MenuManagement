package com.company;

import java.text.Collator;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> arrInt = new ArrayList<>();
        arrInt.add(1);
        arrInt.add(2);
        arrInt.add(3);
        arrInt.add(4);
        arrInt.add(5);
        System.out.println(arrInt.stream().min(Comparator.comparing(x -> x > 0)).get());
        System.out.println(arrInt.stream().max(Comparator.comparing(x -> x > 4)).get());



    }
}
