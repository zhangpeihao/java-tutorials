package com.zph.tutorials.designpatterns.decorator;

/*
装饰这模式和继承的目的都是扩展对象的功能，但装饰者模式比继承更灵活
通过使用不同的具体装饰类以及这些类的排列组合，设计师可以创造出很多不同行为的组合
装饰者模式有很好地可扩展性

 */
public class DecoratorPattern {
    public static void main(String[] args) {
        // 我要找个人
        IPerson person = new Employee();

        // 可能是个大牛程序员
        Programmer master = new Master(person);
        master.work();
        System.out.println("--------------------");

        // 也可能是个坑货
        Programmer newbie = new Newbie(person);
        newbie.work();
        System.out.println("--------------------");

        // 也有可能这货，有时很牛，有时很坑
        Programmer omg = new Master(new Newbie(person));
        omg.work();
        System.out.println("--------------------");
    }
}
