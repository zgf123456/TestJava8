package com.zgf.func;

import java.util.Arrays;
import java.util.function.IntConsumer;

/**
 * 一步一步走入函数式编程
 * Created by zgf on 17/11/7.
 */
public class StepBy {
    static int[] arr = {1, 4, 3, 6, 5, 7, 2, 9};

    public static void main(String[] args) {
        // java8以前的写法
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();

        // java8流式写法 + 匿名内部类
        Arrays.stream(arr).forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.print(value);
            }
        });
        System.out.println();

        // java8流式写法 + lambada写法
        Arrays.stream(arr).forEach(x -> {
            System.out.print(x);
        });
        System.out.println();


        // java8流式写法 + 方法引用推导
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
    }
}
