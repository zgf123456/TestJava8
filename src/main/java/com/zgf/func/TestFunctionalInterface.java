package com.zgf.func;

/**
 * 函数式接口，是能有一个抽象方法
 * Created by zgf on 17/11/7.
 */
@FunctionalInterface
public interface TestFunctionalInterface {
    void doSomething(int i); // 抽象方法
    boolean equals(Object obj);  // 非抽象方法，已经在Object中实现
}
