package com.zph.tutorials.designpatterns.bridge;

import com.zph.tutorials.designpatterns.adapter.ICar;

/**
 * Created by hujie on 17/2/21.
 */
public class Farmer extends AbstractDriver {
    public Farmer(ICar car) {
        super();
        this.car = car;
    }
    public void Reap() {
        System.out.print("Farmer ");
        this.drive();
    }
}
