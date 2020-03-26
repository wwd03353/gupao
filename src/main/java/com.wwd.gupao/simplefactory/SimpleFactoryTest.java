package com.wwd.gupao.simplefactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
//        Mask mask = new DisposableMask();
//        mask.produce();
        MaskFactory mas = new MaskFactory();
        Mask mask = mas.create(DisposableMask.class);
        mask.produce();

        Mask mask1 = mas.create(N95Mask.class);
        mask1.produce();
    }
}
