package com.zph.tutorials.designpatterns.singleton;

/**
 * Created by hujie on 17/2/21.
 */
public class LazySingleton {
    private LazySingleton() {
        System.out.println("LazySingleton()");
    }

    private static LazySingleton instance = null;

    public static LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
