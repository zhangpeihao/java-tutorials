package com.zph.tutorials.designpatterns.simplefactory;

/**
 * Created by zhangpeihao on 17/2/21.
 */
// ConcreteProduct 角色，实现 Product 中的接口
public class Add extends Operation {
    @Override
    public int getResult() {
        return numA + numB;
    }
}
