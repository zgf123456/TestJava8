package com.zgf.guava.basic;

import com.google.common.base.Preconditions;

/**
 * 前置条件
 * Created by zgf on 17/11/15.
 */
public class TestPreconditions {
    public static void main(String[] args) {
//        Object obj = null;
//        Object o = Preconditions.checkNotNull(obj);

//        Preconditions.checkArgument(1 > 2);
//        Preconditions.checkArgument(1 > 2, "ADSFADSFAS");

//        Preconditions.checkState(1 > 2, "dsafdasf");

//        Preconditions.checkElementIndex(5, 4);

//        Preconditions.checkPositionIndex(6, 5);

        Preconditions.checkPositionIndexes(5, 6, 2);
    }

}

