package com.zph.tutorials.designpatterns.adapter;

/**
 * Created by hujie on 17/2/21.
 */
public class TractorAdapter implements ICar {
    private Tractor tractor = new Tractor();

    public void run() {
        tractor.crawl();
    }
}
