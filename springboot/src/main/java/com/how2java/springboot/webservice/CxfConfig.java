package com.how2java.springboot.webservice;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.xml.ws.Endpoint;

@SpringBootConfiguration
public class CxfConfig {

    @Bean
    public ServletRegistrationBean dispatcherServlet() {
        return new ServletRegistrationBean(new CXFServlet(),"/demo/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    /*
    * 业务的实现
    * */
    @Bean
    public MyService myService() {
        return new MyServiceImpl();
    }

    /*
    * 业务切面的访问路由
    * */
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), myService());
        endpoint.publish("/api");
        return endpoint;
    }

    @Bean
    public ServletRegistrationBean restServlet() {
        //注解扫描上下文
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        //项目包名
        applicationContext.scan("com.how2java.springboot.webservice");
        DispatcherServlet rest_dispatcherServlet = new DispatcherServlet(applicationContext);
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(rest_dispatcherServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/*");
        return registrationBean;
    }

}