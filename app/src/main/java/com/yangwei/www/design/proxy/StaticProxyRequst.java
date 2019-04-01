package com.yangwei.www.design.proxy;

/**
 * @author yangwei
 * @Date 2019/4/1
 * @Description StaticProxyRequst
 */
public class StaticProxyRequst implements IRequstInterface {
    RealRequst realRequst;

    public StaticProxyRequst(RealRequst realRequst) {
        this.realRequst = realRequst;
    }

    @Override
    public String request() {
        StringBuffer sb = new StringBuffer();
        String beign = "静态代理开始，监控真正的请求\n";
        String requestIng = realRequst.request();
        String end = "静态代理结束，请求结束\n";
        sb.append(beign).append(requestIng).append(end);
        return sb.toString();
    }

    @Override
    public String response() {
        StringBuffer sb = new StringBuffer();
        String beign = "静态代理开始，监控真正的响应\n";
        String requestIng = realRequst.response();
        String end = "静态代理结束，响应结束\n";
        sb.append(beign).append(requestIng).append(end);
        return sb.toString();
    }
}
