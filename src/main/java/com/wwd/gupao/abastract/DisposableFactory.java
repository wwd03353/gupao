package com.wwd.gupao.abastract;

public class DisposableFactory implements MaskFactory {
    @Override
    public PMask produceMask() {
        return  new DisposablePMask();
    }

    @Override
    public SMask sellMask() {
        return new DisposableSMask();
    }
}
