package com.zph.tutorials.designpatterns.adapter;

/*
Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 */
public class AdapterPattern {
    public static void main(String[] args) {
        ICar car;
        car = new Ferrari();
        car.run();
        car = new Chevrolet();
        car.run();
        car = new TractorAdapter();
        car.run();
    }
}
