package com.zph.tutorials.designpatterns.facade;

/*
1、外观模式为复杂子系统提供了一个简单接口，并不为子系统添加新的功能和行为。
2、外观模式实现了子系统与客户之间的松耦合关系。
3、外观模式没有封装子系统的类，只是提供了简单的接口。 如果应用需要，它并不限制客户使用子系统类。因此可以再系统易用性与通用性之间选择。
4、外观模式注重的是简化接口，它更多的时候是从架构的层次去看整个系统，而并非单个类的层次。
 */
public class FacadePattern {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.Method();

        facade.op1();
    }
}
