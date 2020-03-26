package com.wwd.gupao.factory;

import com.wwd.gupao.simplefactory.Mask;

public class FactoryTest {
    public static void main(String[] args) {
        MasksFactory factory = new DisposableMaskFactory();
        Mask mask = factory.create();
        mask.produce();

        factory = new N95MaskFactory();
        Mask masks = factory.create();
        masks.produce();
    }
}
