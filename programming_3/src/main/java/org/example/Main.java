package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list1.stream().map(x -> x +1 ).forEach(System.out::println);

        list1.stream()
                .map(x -> {if ( x % 2 == 0) return x + 1; else return x;}).forEach(System.out::println);


    }
}