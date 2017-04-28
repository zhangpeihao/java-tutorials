package com.zph.tutorials.designpatterns.simplefactory;

/**
 * Created by hujie on 17/2/21.
 */
public class Div extends Operation {
    @Override
    public int getResult() {
        if (numB == 0) {
            System.out.println("ERROR!");
            return -1;
        }
        return numA / numB;
    }
}
