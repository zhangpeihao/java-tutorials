package com.zph.tutorials.designpatterns.decorator;

/**
 * Created by hujie on 17/2/22.
 */
public class Master extends Programmer {
    public Master(IPerson person) {
        super(person);
    }
    @Override
    public void code() {
        super.code();
        System.out.println("Master fill");
    }
}
