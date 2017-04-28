package com.zph.tutorials.designpatterns.bridge;

import com.zph.tutorials.designpatterns.adapter.ICar;

/**
 * Created by hujie on 17/2/21.
 */
public class Salariat extends AbstractDriver {
    public Salariat(ICar car) {
        super();
        this.car = car;
    }
    public void toWork() {
        System.out.print("Salariat ");
        this.drive();
    }
}
