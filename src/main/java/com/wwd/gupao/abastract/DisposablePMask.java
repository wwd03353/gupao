package com.wwd.gupao.abastract;


public class DisposablePMask implements PMask {
    @Override
    public void produce() {
        System.out.println("生产一次性口罩");
    }
}
