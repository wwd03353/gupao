package com.wwd.gupao.abastract;

public class N95Factory implements MaskFactory {
    @Override
    public PMask produceMask() {
        return new N95IMask();
    }

    @Override
    public SMask sellMask() {
        return new N95SMask();
    }
}
