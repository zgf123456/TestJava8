package com.zgf.guava;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

import java.util.ArrayList;

/**
 * 排序
 * Created by zgf on 17/11/15.
 */
public class TestOrdering {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = Lists.newArrayList(30, 20, 60, 80, 10);

        System.out.println(Ordering.natural().sortedCopy(numbers));

        System.out.println(Ordering.natural().reverse().sortedCopy(numbers));

        System.out.println(Ordering.natural().min(numbers));

        System.out.println(Ordering.natural().max(numbers));

        ArrayList<Integer> numbers1 = Lists.newArrayList(30, 20, 60, 80, null, 10);

        System.out.println(Ordering.natural().nullsLast().sortedCopy(numbers1));

        System.out.println(Ordering.natural().nullsFirst().sortedCopy(numbers1));
    }
}
