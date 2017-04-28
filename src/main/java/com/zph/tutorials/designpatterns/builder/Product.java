package com.zph.tutorials.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hujie on 17/2/21.
 */
public class Product {
    List<String> parts = new ArrayList<String>();

    public void AddPart(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("============== 产品创建 ==============");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
