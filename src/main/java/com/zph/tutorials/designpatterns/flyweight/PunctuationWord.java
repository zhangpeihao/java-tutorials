package com.zph.tutorials.designpatterns.flyweight;

/**
 * Created by hujie on 17/2/23.
 */
public class PunctuationWord extends Word {
    public PunctuationWord(String word) {
        this.word = word;
    }

    @Override
    public void print(boolean first) {
        System.out.print(this.word);
    }
}
