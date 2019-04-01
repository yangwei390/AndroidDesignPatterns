package com.yangwei.www.design.adapter;

/**
 * @author yangwei
 * @Date 2019/3/29
 * @Description SocketAdapter
 */
public class SocketAdapter implements HongKongSocketInterface {
    GbSocket socket;

    public SocketAdapter(GbSocket socket) {
        this.socket = socket;
    }

    @Override
    public String socket() {
        return socket.socket();
    }
}
