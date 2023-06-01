package com.getUser.getUserAPI.OtherSolutions;

import java.util.ArrayList;
import java.util.List;

public class SeriesAndSumSolution {

    public static void main(String[] args) {
        int n = 10; // Specify the number of terms in the series
        printSeriesAndSum(n);
    }

    public static void printSeriesAndSum(int n) {
        if (n % 2 != 0) {
            System.out.println("input should be even");
        }
        else{
            int a = 1;
            int b = 1;
            int c = 8;
            int d = 9;
            List<Integer> fibSeries = new ArrayList<>();
            fibSeries.add(a);
            fibSeries.add(c);
            fibSeries.add(b);
            fibSeries.add(d);
            for (int i = 0; i < (n/2) - 2; i++ ){
                fibSeries.add(a+b);
                fibSeries.add(d+a);
                d = d+a;
                a = a+b;
                b = a-b;
            }
            System.out.println(fibSeries);
            System.out.println("Sum: " + fibSeries.stream().mapToInt(Integer::intValue).sum());
        }
    }

}
/*
 *   1   1   2   3   5   8   13
 *   8   9   10  12  15  20  28
 *   a=2  a=3
 *  b=1     b=2
 *
 * */



