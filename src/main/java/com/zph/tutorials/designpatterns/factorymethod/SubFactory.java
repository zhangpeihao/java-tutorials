package com.zph.tutorials.designpatterns.factorymethod;

import com.zph.tutorials.designpatterns.simplefactory.Operation;
import com.zph.tutorials.designpatterns.simplefactory.Sub;

/**
 * Created by hujie on 17/2/21.
 */
public class SubFactory implements OperationFactory {
    @Override
    public Operation FactoryMethod() {
        return new Sub();
    }
}
