package com.how2java.springboot.apiInterceptor;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

@SpringBootConfiguration
public class InterceptorConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        //拦截所有的请求
        registry.addInterceptor(new ApiInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/static/**");
    }
    /*
    * 格式化Json数据
    * */
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        super.configureMessageConverters(converters);
//        /*
//            1.需要先定义一个 convert 转换消息的对象；
//            2.添加 fastjson 的配置信息，比如是否要格式化返回的 JSON 数据
//            3.在 convert 中添加配置信息
//            4.将 convert 添加到 converters 中
//        */
//        //1.定义一个 convert 转换消息对象
//        FastJsonHttpMessageConverter fastConverter=new FastJsonHttpMessageConverter();
//        //2.添加 fastjson 的配置信息，比如是否要格式化返回 JSON 数据
//        FastJsonConfig fastJsonConfig=new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//        fastConverter.setFastJsonConfig(fastJsonConfig);
//        converters.add(fastConverter);
//    }
}
