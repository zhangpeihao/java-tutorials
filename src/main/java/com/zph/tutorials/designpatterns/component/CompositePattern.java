package com.zph.tutorials.designpatterns.component;

/*
1、想要表示对象的部分-整体层次结构。
2、想要客户端忽略组合对象与单个对象的差异，客户端将统一地使用组合结构中的所有对象。
 */
public class CompositePattern {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.Add(new Leaf("Leaf A"));
        root.Add(new Leaf("Leaf B"));

        Composite compX = new Composite("Composite X");
        compX.Add(new Leaf("Leaf XA"));
        compX.Add(new Leaf("Leaf XB"));
        root.Add(compX);

        Composite compXY = new Composite("Composite XY");
        compXY.Add(new Leaf("Leaf XYA"));
        compXY.Add(new Leaf("Leaf XYB"));
        compX.Add(compXY);

        root.Display(1);
    }
}
