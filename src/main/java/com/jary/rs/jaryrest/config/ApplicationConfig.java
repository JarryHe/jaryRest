package com.jary.rs.jaryrest.config;

import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.commons.util.InetUtilsProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by yangyongxin on 2017/10/15.
 */
@Configuration
public class ApplicationConfig {

    @Bean
//    @Inject
    public InetUtils inetUtils(InetUtilsProperties inetUtilsProperties){
        return new InetUtils(inetUtilsProperties);
    }
}
