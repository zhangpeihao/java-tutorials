package com.zph.tutorials.designpatterns.flyweight;

/**
 * Created by hujie on 17/2/23.
 */
public class NormalWord extends Word {
    private String word;

    public NormalWord(String word) {
        super();
        this.word = word;
    }
    @Override
    public void print(boolean first) {
        if (!first) {
            System.out.print(" ");
        }
        System.out.print(this.word);
    }
}
