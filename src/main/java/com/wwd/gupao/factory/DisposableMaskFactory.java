package com.wwd.gupao.factory;

import com.wwd.gupao.simplefactory.DisposableMask;
import com.wwd.gupao.simplefactory.Mask;

public class DisposableMaskFactory implements MasksFactory {
    @Override
    public Mask create() {
        return new DisposableMask();
    }
}
