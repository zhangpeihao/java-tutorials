package com.zph.tutorials.designpatterns.proxy;

/**
 * Created by hujie on 17/2/23.
 */
public class Manufacturer implements ISeller {
    @Override
    public void sell(String goods) {
        System.out.println("Manufacturer sell " + goods);
    }
}
