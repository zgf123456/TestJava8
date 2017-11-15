package com.zgf.func.demo3;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by zgf on 17/11/7.
 */
public class ParalleSortDemo {
    public static void main(String[] args) {
        int[] arr = new int[100];

        Random r = new Random();
        Arrays.parallelSetAll(arr, (i) -> r.nextInt(100));
        System.out.println(Arrays.toString(arr));

        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
