package com.zph.tutorials.designpatterns.component;

/**
 * Created by hujie on 17/2/23.
 */
abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void Add(Component c);
    public abstract void Remove(Component c);
    public abstract void Display(int depth);
}