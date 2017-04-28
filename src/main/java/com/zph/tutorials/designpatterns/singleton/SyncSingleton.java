package com.zph.tutorials.designpatterns.singleton;

/**
 * Created by hujie on 17/2/21.
 */
public class SyncSingleton {
    private SyncSingleton() {
        System.out.println("Singleton()");
    }

    private static SyncSingleton instance = null;

    public static SyncSingleton getInstance() {
        if (null == instance) {
            synchronized(SyncSingleton.class) {
                if (null == instance) {
                    instance = new SyncSingleton();
                }
            }
        }
        return instance;
    }
}
