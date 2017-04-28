package com.zph.tutorials.designpatterns.simplefactory;

/**
 * Created by hujie on 17/2/21.
 */
// 工厂角色，简单工厂模式的核心，它负责实现创建所有实例的内部逻辑
class OperationFactory {
    public static Operation CreateOperation (char operate) {
        Operation oper = null;
        switch(operate) {
            case '+':
                oper = new Add();
                break;
            case '-':
                oper = new Sub();
                break;
            case '*':
                oper = new Mul();
                break;
            case '/':
                oper = new Div();
                break;
            default:
                break;
        }
        return oper;
    }
}
