package com.zph.tutorials.designpatterns.simplefactory;

/*
优点
简单工厂模式的工厂类是整个模式的关键。其中包含了必要的逻辑判断，根据外部信息，决定究竟应该创建哪个具体类的对象。
通过使用简单工厂模式，用户无需了解对象如何创建的，只要传入必要信息就可以了。
缺点

工厂类集中了所有实例的创建逻辑，违背了高内聚责任分配原则。
随着系统中具体产品类不断增多，势必要不断修改工厂类，不易维护和扩展。同时，这也违背了开放封闭原则。
*/
public class SimpleFactoryPattern {
    public static void main(String[] args) {
        int numA = 10;
        int numB = 3;
        int result = 0;
        Operation oper = OperationFactory.CreateOperation('+');
        oper.numA = numA;
        oper.numB = numB;
        result = oper.getResult();
        System.out.println(numA + " + " + numB + " = " + result);
    }
}