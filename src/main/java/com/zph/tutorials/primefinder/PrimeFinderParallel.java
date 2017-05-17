package com.zph.tutorials.primefinder;

import java.util.stream.IntStream;

/**
 * Created by zhangpeihao on 17/5/17.
 * @since 1.8
 */
public class PrimeFinderParallel {
    private static boolean isPrime(int number) {
        int sqrt = (int)Math.ceil(Math.sqrt((double)number));
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long startAt = System.nanoTime();
        int max = 10000000;
        long count = IntStream.range(1, max).parallel().filter(PrimeFinderParallel::isPrime).count();
        System.out.printf("%d, cost %.3fms%n", count, (double)(System.nanoTime() - startAt) / 1000000.0);
    }
}
