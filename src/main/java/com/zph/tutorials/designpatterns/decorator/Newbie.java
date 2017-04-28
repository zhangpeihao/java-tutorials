package com.zph.tutorials.designpatterns.decorator;

/**
 * Created by hujie on 17/2/22.
 */
public class Newbie extends Programmer {
    public Newbie(IPerson person) {
        super(person);
    }
    @Override
    public void code() {
        super.code();
        System.out.println("Newbie dig");
    }
}
