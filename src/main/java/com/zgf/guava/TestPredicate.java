package com.zgf.guava;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;

import java.util.Collection;

/**
 * predicate 谓词，是从来筛选集合的
 * <p>
 * Created by zgf on 17/11/15.
 */
public class TestPredicate {
    public static void main(String[] args) {

        ImmutableList<Integer> intList = ImmutableList.of(1, 2, 3, 4, 5);

        Collection<Integer> filter = Collections2.filter(intList, new Predicate<Integer>() {
            @Override
            public boolean apply(Integer input) {
                return input % 2 == 0;
            }
        });
        System.out.println(filter);

        // 使用预定义谓词
        System.out.println(Collections2.filter(intList, Predicates.alwaysFalse()));
        System.out.println(Collections2.filter(intList, Predicates.alwaysTrue()));
        System.out.println(Collections2.filter(intList, Predicates.notNull()));
    }
}
