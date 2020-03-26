package com.wwd.gupao.abastract;

public class AbastractFactoryTest {
    public static void main(String[] args) {
        DisposableFactory fa = new DisposableFactory();
        fa.produceMask().produce();
        fa.sellMask().Sell();

        N95Factory n95Factory = new N95Factory();
        n95Factory.produceMask().produce();;
        n95Factory.sellMask().Sell();
    }
}
