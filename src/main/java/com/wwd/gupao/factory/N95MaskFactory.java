package com.wwd.gupao.factory;

import com.wwd.gupao.simplefactory.Mask;
import com.wwd.gupao.simplefactory.N95Mask;

public class N95MaskFactory implements MasksFactory {
    @Override
    public Mask create() {
        return new N95Mask();
    }
}
