package com.wwd.gupao.simplefactory;

public class DisposableMask implements Mask {
    @Override
    public void produce() {
        System.out.println("生产一次性口罩");
    }
}
