package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        List<Integer> transformedList = list1.stream()
                .map(x -> (x % 2 == 0) ? x * x : x)
                .collect(Collectors.toList());

        System.out.println(transformedList);

        System.out.println("páros számok");
        list1.stream()
                .filter(x -> x%2==0).forEach(System.out::println);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        list2.stream()
                .filter(x -> x > 5)
                .forEach(System.out::println);

        

    }
}