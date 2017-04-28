package com.zph.tutorials.designpatterns.proxy;

/**
 * Created by hujie on 17/2/23.
 */
public class ProxyPattern {
    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.sell("iPhone");
    }
}
