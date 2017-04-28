package com.zph.tutorials.designpatterns.template;

/**
 * Created by hujie on 17/2/24.
 */
public class TemplatePattern {
    public static void main(String[] args) {
        Spinach spinach = new Spinach();
        spinach.cook();
        Carrot carrot = new Carrot();
        carrot.cook();
    }
}
