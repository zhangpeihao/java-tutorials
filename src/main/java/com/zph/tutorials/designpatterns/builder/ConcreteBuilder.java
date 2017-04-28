package com.zph.tutorials.designpatterns.builder;

/**
 * Created by hujie on 17/2/21.
 */
public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.AddPart("部件A");
    }

    @Override
    public void buildPartB() {
        product.AddPart("部件B");
    }

    @Override
    public void buildPartC() {
        product.AddPart("部件C");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
