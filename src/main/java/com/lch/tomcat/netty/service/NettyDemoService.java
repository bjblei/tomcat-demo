package com.lch.tomcat.netty.service;

import com.lch.tomcat.netty.http.NettyRequest;
import com.lch.tomcat.netty.http.NettyResponse;
import com.lch.tomcat.netty.http.NettyServlet;

/**
 * @author: liuchenhui
 * @create: 2019-10-29 23:55
 **/
public class NettyDemoService extends NettyServlet {

    @Override
    protected void doPost(NettyRequest request, NettyResponse response) {
        response.write("Netty HelloWorld");
    }

    @Override
    protected void doGet(NettyRequest request, NettyResponse response) {
        doPost(request, response);
    }
}
