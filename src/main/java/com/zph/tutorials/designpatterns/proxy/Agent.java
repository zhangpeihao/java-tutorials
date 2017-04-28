package com.zph.tutorials.designpatterns.proxy;

/**
 * Created by hujie on 17/2/23.
 */
public class Agent implements ISeller {
    private Manufacturer manufacturer;

    public Agent() {
        this.manufacturer = new Manufacturer();
    }
    @Override
    public void sell(String goods) {
        System.out.println("Agent sell " + goods);
        this.manufacturer.sell(goods);
    }
}
