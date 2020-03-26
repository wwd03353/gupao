package com.wwd.gupao.simplefactory;

public class MaskFactory {

    public Mask create( Class clzz){
        try {
            if (null != clzz) {
                return (Mask) clzz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
