package com.zgf.guava.basic;

import com.google.common.base.Function;

import javax.annotation.Nullable;
import java.util.Optional;

/**
 *
 * Optional，避免null，快速失败
 * Created by zgf on 17/11/15.
 */
public class TestOptional {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();
        System.out.println(empty.isPresent());

        Optional<Integer> o1 = Optional.ofNullable(5);
        System.out.println(o1.isPresent());
        System.out.println(o1.get());

        // 映射
        System.out.println(o1.map(new Function<Integer, String>() {
            @Nullable
            @Override
            public String apply(@Nullable Integer interger) {
                return interger.toString();
            }
        }));

    }
}
