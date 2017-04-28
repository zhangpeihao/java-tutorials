package com.zph.tutorials.designpatterns.factorymethod;

import com.zph.tutorials.designpatterns.simplefactory.Add;
import com.zph.tutorials.designpatterns.simplefactory.Operation;

/**
 * Created by hujie on 17/2/21.
 */
public class AddFactory implements OperationFactory {
    @Override
    public Operation FactoryMethod() {
        return new Add();
    }
}