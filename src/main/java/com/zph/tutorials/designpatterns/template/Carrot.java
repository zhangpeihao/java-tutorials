package com.zph.tutorials.designpatterns.template;

/**
 * Created by hujie on 17/2/24.
 */
public class Carrot extends Vegetabel{
    protected void prepare() {
        System.out.println("准备好胡萝卜");
        super.prepare();
    }
    protected void pourOil() {
        System.out.println("倒100毫升油");
    }
    protected void heatOil() {
        System.out.println("加热到7成油温");
    }
    protected void heat(){
        System.out.println("翻炒90秒");
    }
}
