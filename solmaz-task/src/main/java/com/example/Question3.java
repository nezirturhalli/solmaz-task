package com.example;

import java.util.Arrays;

public class Question3 {
    static int[] getProductsOfAllIntsExpectAtIndex(int[] arr) {
        int result = Arrays.stream(arr).reduce(1, (i, j) -> i * j); // multiply all numbers
        return Arrays.stream(arr).map(i -> (result / i)).toArray(); //  divide multiply result by its index
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 4};
        System.out.println(Arrays.toString(getProductsOfAllIntsExpectAtIndex(arr))); // convert result to string
    }

}
