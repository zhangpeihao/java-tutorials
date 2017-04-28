package com.zph.tutorials.designpatterns.template;

/**
 * Created by hujie on 17/2/24.
 */
public class Spinach extends Vegetabel {
    protected void prepare() {
        System.out.println("准备好菠菜");
        super.prepare();
    }
    protected void pourOil() {
        System.out.println("倒200毫升油");
    }
    protected void heatOil() {
        System.out.println("加热到4成油温");
    }
    protected void heat(){
        System.out.println("翻炒30秒");
    }

}
