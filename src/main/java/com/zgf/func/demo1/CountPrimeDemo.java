package com.zgf.func.demo1;

import java.util.stream.IntStream;

/**
 * Created by zgf on 17/11/7.
 */
public class CountPrimeDemo {
    public static void main(String[] args) {
        // 我们希望可以统计一个1~1000000内所有的质数的数量

        // 串行流的写法
        long s1 = System.currentTimeMillis();
        long count1 = IntStream.rangeClosed(1, 1000000) //
                .filter(PrimeUtil::isPrime) //
//                .forEach(x -> System.out.println(x + ","));
                .count();
        long s2 = System.currentTimeMillis();

        // 并行流的写法
        long count2 = IntStream.rangeClosed(1, 1000000) //
                .parallel() // 并行化
                .filter(PrimeUtil::isPrime) //
//                .forEach(x -> System.out.println(x + ","));
                .count();
        long s3 = System.currentTimeMillis();

        System.out.println(count1 + ", " + (s2 - s1) + "ms");
        System.out.println(count2 + ", " + (s3 - s2) + "ms");
    }


}
