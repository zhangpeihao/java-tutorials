package com.zph.tutorials.primefinder;

/**
 * Created by zhangpeihao on 17/4/24.
 * 质数查找例子
 */
public class PrimeFinder {
    private int max;
    private PrimeItem first;

    private PrimeFinder(int max) {
        this.max = max;
        this.first = new PrimeItem(2);
    }

    private class PrimeItem {
        int value;
        PrimeItem next;

        public PrimeItem(int value) {
            this.value = value;
        }
    }

    private int run() {
        PrimeItem tail = this.first;
        int count = 1;

        MAIN_LOOP:
        for (int i = 3; i < this.max; i++) {
            PrimeItem item = this.first;
            int sqrt = (int)Math.ceil(Math.sqrt((double)i));
            while (item.value <= sqrt) {
                if (i % item.value == 0) {
                    continue MAIN_LOOP;
                }
                if (item.next != null) {
                    item = item.next;
                } else {
                    break;
                }
            }
            // New prime
            PrimeItem next = new PrimeItem(i);
            tail.next = next;
            tail = next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        long startAt = System.nanoTime();
        int max = 1000000;
        PrimeFinder finder = new PrimeFinder(max);
        int count = finder.run();
        System.out.printf("%d, cost %.3fms%n", count, (double)(System.nanoTime() - startAt) / 1000000.0);
    }
}
