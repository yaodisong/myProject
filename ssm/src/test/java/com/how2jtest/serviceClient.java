package com.how2jtest;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import java.util.Properties;

public class serviceClient extends BaseTest {

    public static void main(String[] args) {
        System.out.println("开始调用接口！");
        Properties props = System.getProperties();
        props.setProperty("org.apache.cxf.stax.allowInsecureParser", "1");
        props.setProperty("UseSunHttpHandler", "true");
        //采用动态工厂方式 不需要指定服务接口
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://127.0.0.1:8888/ssm/webService/helloWebService?wsdl");
        Object[] res = new Object[0];
        try {
            res = client.invoke("helloWebService", "admin");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Echo response: helloWebService" + res[0]);
    }

}
