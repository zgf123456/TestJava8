package com.zgf.func;

/**
 * Created by zgf on 17/11/7.
 */
public interface TestDefaultMethod {
    void eat();

    default void run() {
        System.out.println("method run");
    }

    public static void main(String[] args) {

    }
}

