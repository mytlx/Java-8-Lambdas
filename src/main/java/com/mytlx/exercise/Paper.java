package com.mytlx.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;

/**
 * 草纸
 *
 * @author TLX
 * @version 1.0.0
 * @date 2020.11.18 17:36
 */
public class Paper {

    // public Map<Integer, Double> parallelDiceRolls(int N) {
    //     double fraction = 1.0 / N;
    //     return IntStream.range(0, N)
    //             .parallel()
    //             .mapToObj(twoDiceThrows())
    //             .collect(groupingBy(side -> side, summingDouble(n -> fraction)));
    //
    // }

    private static int addIntegers(List<Integer> values) {
        return values.parallelStream()
                .mapToInt(i -> i)
                .sum();
    }

    public static double[] parallelInitialize(int size) {
        double[] values = new double[size];
        Arrays.parallelSetAll(values, i -> i);
        return values;
    }

    /**
     * 计算简单滑动平均数
     *
     * @param values 输入数据
     * @param n 窗口大小
     * @return 滑动窗口平均数
     */
    public static double[] simpleMovingAverage(double[] values, int n) {
        double[] sums = Arrays.copyOf(values, values.length);
        Arrays.parallelPrefix(sums, Double::sum);
        int start = n - 1;
        return IntStream
                .range(start, sums.length)
                .mapToDouble(i -> {
                    double prefix = i == start ? 0 : sums[i - n];
                    return (sums[i] - prefix) / n;
                })
                .toArray();
    }

    public static void main(String[] args) {
        // System.out.println(addIntegers(Arrays.asList(1, 2, 3, 4, 5)));


        double[] doubles = parallelInitialize(5);
        Arrays.stream(doubles).forEach(System.out::println);
    }
}
