package com.pps.classadapterdemo;

public class AdapterPattern {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.method1();
        adapter.method2();
        System.out.println("以下是对象适配器-----------");
        Wrapper wrapper = new Wrapper(new Source());
        wrapper.method1();
        wrapper.method2();
        System.out.println("以下是接口适配器-----------");
        Port chatPort = new Chat();
        chatPort.NET();
        Port serverPort = new Server();
        serverPort.MySQL();
        serverPort.SSH();
        serverPort.Tomcat();
        serverPort.NET();
    }
}
