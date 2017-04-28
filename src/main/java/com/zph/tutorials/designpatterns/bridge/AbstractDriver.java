package com.zph.tutorials.designpatterns.bridge;

import com.zph.tutorials.designpatterns.adapter.ICar;

/**
 * Created by hujie on 17/2/21.
 */
public abstract class AbstractDriver {
    protected ICar car;
    public void drive() {
        System.out.print("drive the ");
        car.run();
    }
}
