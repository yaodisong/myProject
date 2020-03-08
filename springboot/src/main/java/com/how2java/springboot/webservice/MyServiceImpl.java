package com.how2java.springboot.webservice;

import javax.jws.WebService;
import java.util.Date;

@WebService(serviceName = "MyService", // 与接口中指定的name一致
        targetNamespace = "http://webservice.springboot.how2java.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.how2java.springboot.webservice.MyService"// 接口地址
)
public class MyServiceImpl implements MyService {


    @Override
    public String helloWebService() {
        return "现在时间："+"("+new Date()+")";
    }

    @Override
    public String secondService() {
        return "这是第二个service";
    }
}
