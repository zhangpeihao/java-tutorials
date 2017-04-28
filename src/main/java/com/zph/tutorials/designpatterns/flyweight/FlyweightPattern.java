package com.zph.tutorials.designpatterns.flyweight;

import java.util.ArrayList;

/*
有些应用程序得益于在其整个设计过程中采用对象技术，但简单化的实现代价极大。
使用面向对象的抽象化，可能会造成庞大的对象群，造成空间的巨大消耗，而影响性能。

在文档编辑器例子中如果一个字符对应一个对象，那么一篇文档所要容纳的对象将是非常的庞大耗费大量的内存。
而实际组成文档的字符是有限的，是由这些字符不同的组合和排列得到的。
所以需要共享，将基本的字符进行共享，将使得字符对象变得有限。
 */
public class FlyweightPattern {
    public static void main(String[] args) {
        ArrayList<Word> words = new ArrayList<Word>(100);
        WordFactory factory = new WordFactory();
        words.add(factory.getNormalWord("I"));
        words.add(factory.getNormalWord("am"));
        words.add(factory.getNormalWord("a"));
        words.add(factory.getNormalWord("soldier"));
        words.add(factory.getPunctuationWord(","));
        words.add(factory.getNormalWord("I"));
        words.add(factory.getNormalWord("am"));
        words.add(factory.getNormalWord("a"));
        words.add(factory.getNormalWord("warrior"));
        words.add(factory.getPunctuationWord("!"));
        boolean first = true;
        for (Word word : words) {
            word.print(first);
            first = false;
        }
    }
}
