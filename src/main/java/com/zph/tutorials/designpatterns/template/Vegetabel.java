package com.zph.tutorials.designpatterns.template;

/**
 * Created by hujie on 17/2/24.
 */
public abstract class Vegetabel {
    public void cook() {
        System.out.println("开始炒菜");
        prepare();
        pourOil();
        heatOil();
        pourVegetable();
        heat();
        finish();
    }
    protected void prepare() {
        System.out.println("点火");
    }
    protected abstract void pourOil();
    protected abstract void heatOil();
    private void pourVegetable() {
        System.out.println("导入食材");
    }
    protected abstract void heat();
    private void finish() {
        System.out.println("出锅");
    }
}
