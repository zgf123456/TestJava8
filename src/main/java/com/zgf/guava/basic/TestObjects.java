package com.zgf.guava.basic;

import com.google.common.base.Objects;

/**
 * Objects 工具，优点是对null做了处理
 * Created by zgf on 17/11/15.
 */
public class TestObjects {
    public static void main(String[] args) {
        System.out.println(Objects.equal(null, null));
        System.out.println(Objects.hashCode(null));
    }
}

