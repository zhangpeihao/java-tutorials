package com.zph.tutorials.designpatterns.facade;

/**
 * Created by hujie on 17/2/23.
 */
public class Facade {
    private Class1 one = new Class1();
    private Class2 two = new Class2();
    private Class3 three = new Class3();

    public void op1() {
        System.out.println("Facade op1()");
        one.op1();
    }

    public void op2() {
        System.out.println("Facade op2()");
        two.op2();
    }

    public void op3() {
        System.out.println("Facade op3()");
        three.op3();
    }

    public void Method() {
        System.out.println("Facade Method()");
        three.op3();
        two.op2();
        one.op1();
    }
}
