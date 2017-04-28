package com.zph.tutorials.designpatterns.bridge;

import com.zph.tutorials.designpatterns.adapter.Chevrolet;
import com.zph.tutorials.designpatterns.adapter.Ferrari;
import com.zph.tutorials.designpatterns.adapter.TractorAdapter;

/**
 * Created by hujie on 17/2/21.
 */
public class BridgePattern {
    public static void main(String[] args) {
        new Racer(new Ferrari()).Race();
        new Salariat(new Chevrolet()).toWork();
        new Farmer(new TractorAdapter()).Reap();
    }
}
