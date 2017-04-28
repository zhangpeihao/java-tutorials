package com.zph.tutorials.designpatterns.builder;

/**
 * Created by hujie on 17/2/21.
 */
public interface Builder {
    public void buildPartA();
    public void buildPartB();
    public void buildPartC();
    public Product getResult();
}
