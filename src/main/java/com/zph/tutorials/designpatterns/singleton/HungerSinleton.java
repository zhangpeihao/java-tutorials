package com.zph.tutorials.designpatterns.singleton;

/**
 * Created by hujie on 17/2/21.
 */
public class HungerSinleton {
    private HungerSinleton() {
        System.out.println("HungerSinleton()");
    }

    private static HungerSinleton instance = new HungerSinleton();

    public static HungerSinleton getInstance() {
        return instance;
    }
}
