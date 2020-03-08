package com.how2java.springboot.webservice;

import javax.jws.WebService;

@WebService(name = "MyService", // 暴露服务名称
        targetNamespace = "http://webservice.springboot.how2java.com"// 命名空间,一般是接口的包名倒序
)
public interface MyService {

    public String helloWebService();

    public String secondService();

}
