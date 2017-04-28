package com.zph.tutorials.designpatterns.factorymethod;

import com.zph.tutorials.designpatterns.simplefactory.Operation;

/**
 * Created by hujie on 17/2/21.
 */
public class FactoryMethodPattern {
    public static void main(String[] args) {
        OperationFactory factory = new SubFactory();
        Operation oper = factory.FactoryMethod();
        oper.numA = 3;
        oper.numB = 2;
        double result = oper.getResult();
        System.out.println("result = " + result);
    }
}
