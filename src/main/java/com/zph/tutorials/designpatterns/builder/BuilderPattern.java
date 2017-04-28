package com.zph.tutorials.designpatterns.builder;

/*
 创建一个复杂对象的算法，这个算法应当独立于对象的组成部分以及它们的装配方式。
 构建过程必须允许构建对象时有不同的表示。
 */
public class BuilderPattern {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        director.construct(builder);
        Product product = builder.getResult();
        product.show();
    }
}
