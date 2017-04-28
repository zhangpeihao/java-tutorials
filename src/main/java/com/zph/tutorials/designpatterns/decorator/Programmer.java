package com.zph.tutorials.designpatterns.decorator;

/**
 * Created by hujie on 17/2/22.
 */
public abstract class Programmer implements IPerson {
    private IPerson person;

    public Programmer(IPerson person) {
        this.person = person;
    }

    @Override
    public void work() {
        if (this.person != null) {
            this.person.work();
        }
        System.out.println("Programmer work");
        this.code();
    }

    public void code() {
        System.out.println("Programmer code");
    }
}
