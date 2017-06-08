package com.zgf.java8.newInterfaceMethod.defaultable;

/**
 * Created by zgf on 17/6/8.
 */
public class TestDefaultable {
    public static void main(String[] args) {
        Defaultable defaultable1 = new DefaultableImpl();
        Defaultable defaultable2 = new DefaultableImpl2();

        System.out.println(defaultable1.notRequired());
        System.out.println(defaultable2.notRequired());
    }
}
