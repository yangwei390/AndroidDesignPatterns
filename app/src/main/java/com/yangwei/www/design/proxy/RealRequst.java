package com.yangwei.www.design.proxy;

/**
 * @author yangwei
 * @Date 2019/4/1
 * @Description RealRequst
 */
public class RealRequst implements IRequstInterface {
    @Override
    public String request() {
        return "这里是真正的请求\n";
    }

    @Override
    public String response() {
        return "这里是数据响应\n";
    }
}
