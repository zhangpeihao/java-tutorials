package com.zph.tutorials.designpatterns.bridge;

import com.zph.tutorials.designpatterns.adapter.ICar;

/**
 * Created by hujie on 17/2/21.
 */
public class Racer extends AbstractDriver {
    public Racer(ICar car) {
        super();
        this.car = car;
    }
    public void Race() {
        System.out.print("Racer ");
        this.drive();
    }
}
