package com.zph.tutorials.designpatterns.component;

/**
 * Created by hujie on 17/2/23.
 */
class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void Add(Component c) {
        System.out.println("Can not add to a leaf");
    }

    @Override
    public void Remove(Component c) {
        System.out.println("Can not remove from a leaf");
    }

    @Override
    public void Display(int depth) {
        String temp = "";
        for (int i = 0; i < depth; i++)
            temp += '-';
        System.out.println(temp + name);
    }

}