package com.zgf.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaseTest {
    public static void main(String[] args) {
//        BaseTest.testCollect();
//        BaseTest.testFileter();
//        BaseTest.testMap();
//        BaseTest.testFlatMap();
        BaseTest.testMaxAndMin();
    }

    /**
     * 过滤，惰性求值
     */
    public static void testFileter() {
        List<Integer> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0) //
                .filter(num -> num > 5) //
                .collect(Collectors.toList());
        System.out.println(collect);
    }


    /**
     * 收集，及时求值
     */
    public static void testCollect() {
        Long collect1 = Stream.of("a", "b", "c").collect(Collectors.counting());
        String collect2 = Stream.of("a", "b", "c").collect(Collectors.joining(","));
        System.out.println(collect1);
        System.out.println(collect2);
    }

    /**
     * 值映射，惰性求值
     */
    public static void testMap() {
        List<String> collect = Stream.of("a", "b", "hello") //
                .map(x -> x.toUpperCase()) //
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    /**
     * 将多个Stream连接成一个Stream，惰性求值
     */
    public static void testFlatMap() {
        List<Integer> collect = Stream.of(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6)) //
                .flatMap(numbers -> numbers.stream()) //
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void testMaxAndMin() {
        Integer max = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0) //
                .max(Comparator.comparing(x -> x)) //
                .get();
        System.out.println(max);

        Integer min = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0) //
                .min(Comparator.comparing(x -> x)) //
                .get();
        System.out.println(min);
    }

}
