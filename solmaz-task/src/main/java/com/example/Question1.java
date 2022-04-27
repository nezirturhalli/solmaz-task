package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {

        Integer[] num = {2, 5, 3, 8, 9, 12, 3, 9, 4, 7, 6};

        int min = Collections.min(Arrays.asList(num)); // find min number
        int max = Collections.max(Arrays.asList(num)); // find max number

        Predicate<Integer> ifEven = i -> i % 2 == 0; // checking  division by 2
        Predicate<Integer> ifOdd = ifEven.negate(); // checking  inverse of the division by 2

        int sumEvenNumbers = Arrays.stream(num).filter(ifEven).mapToInt(i -> i).sum(); // sum of even numbers
        int sumOddNumbers = Arrays.stream(num).filter(ifOdd).mapToInt(i -> i).sum(); // sum of odd numbers

        System.out.println("Min Number= " + min);
        System.out.println("Max Number= " + max);
        System.out.println("Sum of Even Numbers= " + sumEvenNumbers);
        System.out.println("Sum of Odd Numbers= " + sumOddNumbers);

        //  duplicate numbers - solution with Stream Api
        Arrays.stream(num).filter(i -> Collections.frequency(List.of(num), i) > 1)
                .collect(Collectors.toSet()).forEach(System.out::println);

    }
}
