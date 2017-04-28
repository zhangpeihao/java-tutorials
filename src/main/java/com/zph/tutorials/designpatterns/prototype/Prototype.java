package com.zph.tutorials.designpatterns.prototype;

/**
 * Created by hujie on 17/2/21.
 */
public class Prototype implements Cloneable {
    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}