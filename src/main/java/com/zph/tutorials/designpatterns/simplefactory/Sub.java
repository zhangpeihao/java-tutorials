package com.zph.tutorials.designpatterns.simplefactory;

/**
 * Created by hujie on 17/2/21.
 */
public class Sub extends Operation {
    @Override
    public int getResult() {
        return numA - numB;
    }
}

