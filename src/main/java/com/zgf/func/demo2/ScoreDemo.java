package com.zgf.func.demo2;

import java.util.ArrayList;

/**
 * 分数计算DEMO
 * Created by zgf on 17/11/7.
 */
public class ScoreDemo {
    public static void main(String[] args) {
        ArrayList<String> scores = new ArrayList<>();
        scores.add("100");
        scores.add("90");
        scores.add("80");
        scores.add("70");
        scores.add("60");

        // 最高分
        int maxScore = scores.parallelStream().mapToInt(Integer::parseInt).max().getAsInt();
        System.out.println(maxScore);

        // 最低分
        int minScore = scores.parallelStream().mapToInt(Integer::parseInt).min().getAsInt();
        System.out.println(minScore);

        // 平均分
        double avgScore = scores.parallelStream().mapToInt(Integer::parseInt).average().getAsDouble();
        System.out.println(avgScore);
    }
}
