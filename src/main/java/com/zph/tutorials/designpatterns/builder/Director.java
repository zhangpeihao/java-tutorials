package com.zph.tutorials.designpatterns.builder;

/**
 * Created by hujie on 17/2/21.
 */
public class Director {
    public void construct(Builder builder) {
        builder.buildPartC();
        builder.buildPartA();
        builder.buildPartB();
    }
}
