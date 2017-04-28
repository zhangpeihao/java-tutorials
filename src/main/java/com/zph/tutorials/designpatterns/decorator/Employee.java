package com.zph.tutorials.designpatterns.decorator;

/**
 * Created by hujie on 17/2/22.
 */
public class Employee implements IPerson {
    @Override
    public void work() {
        System.out.println("Employee work");
    }
}
