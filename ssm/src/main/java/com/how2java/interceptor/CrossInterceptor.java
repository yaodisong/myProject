package com.how2java.interceptor;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: 跨域支持（在拦截器阶段抛出异常，cross注解不能支持拦截器阶段的跨域，所以在登录拦截器之前先处理跨域支持）
 */
public class CrossInterceptor extends HandlerInterceptorAdapter implements InitializingBean {
    private String accessControlAllowOrigin;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String curOrigin = request.getHeader("Origin");
//        if (StringUtils.isNotBlank(curOrigin)) {
//            String[] allowUrls = accessControlAllowOrigin.split(",");
//            for (String origin : allowUrls) {
//                if (origin.equals(curOrigin)) {
//                    response.addHeader("Access-Control-Allow-Origin", origin);
//                }
//            }
//        }
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Connection, User-Agent, Cookie, Authorization");
        return super.preHandle(request, response, handler);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (StringUtils.isBlank(accessControlAllowOrigin)) {
            throw new RuntimeException("请配置CrossInterceptor跨域支持的host");
        }
    }

    public void setAccessControlAllowOrigin(String accessControlAllowOrigin) {
        this.accessControlAllowOrigin = accessControlAllowOrigin;
    }
}

