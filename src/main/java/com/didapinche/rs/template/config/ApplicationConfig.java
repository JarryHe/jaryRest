package com.didapinche.rs.template.config;

import com.didapinche.metrics.mvc.TracingInterceptor;
import com.didapinche.server.commons.autoconfigure.common.LogAop;
import com.didapinche.server.commons.common.ddc.DdcFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.commons.util.InetUtilsProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.inject.Inject;

/**
 * Created by yangyongxin on 2017/10/15.
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter(){
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new TracingInterceptor()).addPathPatterns("/**");
                super.addInterceptors(registry);
            }
        };
        return adapter;
    }

    @Bean
    @Inject
    public InetUtils inetUtils(InetUtilsProperties inetUtilsProperties){
        return new InetUtils(inetUtilsProperties);
    }
}
