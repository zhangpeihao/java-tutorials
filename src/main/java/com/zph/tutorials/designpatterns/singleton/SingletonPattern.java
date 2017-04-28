package com.zph.tutorials.designpatterns.singleton;

/**
 * Created by hujie on 17/2/21.
 */
public class SingletonPattern {
    public static void main(String[] args) {
        HungerSinleton.getInstance();
        LazySingleton.getInstance();
        SyncSingleton.getInstance();
    }
}
