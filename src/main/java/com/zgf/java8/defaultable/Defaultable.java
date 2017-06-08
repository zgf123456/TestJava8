package com.zgf.java8.defaultable;

/**
 * Created by zgf on 17/6/8.
 * <p>
 * 接口默认方法
 */
public interface Defaultable {
    default String notRequired() {
        return "defualt impl";
    }

}
