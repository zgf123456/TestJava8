package com.zgf.guava;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * 集合转换
 * Created by zgf on 17/11/15.
 */
public class TestTransform {
    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5);

        System.out.println(ImmutableMultiset.copyOf(Lists.transform(list, new Function<Integer, String>() {
            @Override
            public String apply(Integer input) {
                return (input + 1) + "";
            }
        })));

    }
}
