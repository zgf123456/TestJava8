package com.zgf.func;

import java.util.Arrays;

/**
 * 函数式编程范式
 * 命令式(Declarative)
 * 申明式(imperative)
 * Created by zgf on 17/11/7.
 */
public class TestFunc {
    public static void main(String[] args) {
//        TestFunc.imperative();
//        TestFunc.declarative();
        TestFunc.lessCode();
    }

    /**
     * 更少的代码
     */
    public static void lessCode() {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9, 10};
        // 传统的处理方式
        for (int i : arr) {
            if (i % 2 != 0) {
                i++;
            }
            System.out.print(i + ",");
        }
        System.out.println();

        // 函数式的写法
        Arrays.stream(arr).map((x) -> x % 2 == 0 ? x : x + 1).forEach(System.out::print);
    }


    /**
     * 命令式写法
     */
    public static void declarative() {
        int[] ary = {1, 3, 4, 5, 6, 0, 2};
        for (int i : ary) {
            System.out.print(i);
        }
        System.out.println();
    }

    /**
     * 申明式写法
     */
    public static void imperative() {
        int[] ary = {1, 3, 4, 5, 6, 0, 2};
        Arrays.stream(ary).map((x) -> x = x + 1).forEach(System.out::print);
        System.out.println();
        // 不变模式，数组内容不会变化
        Arrays.stream(ary).forEach(System.out::print);
        System.out.println();
    }
}
