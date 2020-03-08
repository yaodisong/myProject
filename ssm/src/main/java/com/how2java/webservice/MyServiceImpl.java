package com.how2java.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Date;

@WebService
public class MyServiceImpl implements MyService {

    @WebMethod
    @Override
    public String helloWebService() {
        return "现在时间："+"("+new Date()+")";
    }
}
