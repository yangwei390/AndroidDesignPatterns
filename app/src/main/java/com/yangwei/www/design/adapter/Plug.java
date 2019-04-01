package com.yangwei.www.design.adapter;

/**
 * @author yangwei
 * @Date 2019/3/30
 * @Description Plug
 */
public class Plug {
    private HongKongSocketInterface gbSocketInterface;

    public Plug(HongKongSocketInterface gbSocketInterface) {
        this.gbSocketInterface = gbSocketInterface;
    }

    public String getSocket() {
        return gbSocketInterface.socket();
    }
}
