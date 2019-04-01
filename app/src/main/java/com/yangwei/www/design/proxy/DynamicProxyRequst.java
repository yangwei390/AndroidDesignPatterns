package com.yangwei.www.design.proxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yangwei
 * @Date 2019/4/1
 * @Description DynamicProxyRequst
 */
public class DynamicProxyRequst implements InvocationHandler {
    private Object obj;

    public DynamicProxyRequst(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Log.e("TEST", method.getName());
        if ("request".equals(method.getName())) {
            StringBuffer sb = new StringBuffer();
            String beign = "动态代理请求\n";
            String requestIng = (String) method.invoke(obj, args);
            String end = "请求代理结束\n";
            sb.append(beign).append(requestIng).append(end);
            return sb.toString();
        } else {
            StringBuffer sb = new StringBuffer();
            String beign = "动态代理响应\n";
            String requestIng = (String) method.invoke(obj, args);
            String end = "响应代理结束\n";
            sb.append(beign).append(requestIng).append(end);
            return sb.toString();
        }
    }
}
