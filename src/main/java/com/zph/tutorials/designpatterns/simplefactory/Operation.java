package com.zph.tutorials.designpatterns.simplefactory;

/**
 * Created by zhangpeihao on 17/2/21.
 */
// Product角色，所有实例所共有的公共接口
public abstract class Operation {
    public int numA;
    public int numB;
    public abstract int getResult();
}
