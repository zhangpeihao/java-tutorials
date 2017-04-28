package com.zph.tutorials.designpatterns.flyweight;

import java.util.Hashtable;

/**
 * Created by hujie on 17/2/23.
 */
public class WordFactory {
    private Hashtable<String, Word> words = new Hashtable<String, Word>();
    private Hashtable<String, Word> numbers = new Hashtable<String, Word>();

    public Word getNormalWord(String wordString) {
        Word word = words.get(wordString);
        if (word == null) {
            word = new NormalWord(wordString);
            words.put(wordString, word);
        }
        return word;
    }

    public Word getPunctuationWord(String wordString) {
        Word word = numbers.get(wordString);
        if (word == null) {
            word = new PunctuationWord(wordString);
            numbers.put(wordString, word);
        }
        return word;
    }
}
