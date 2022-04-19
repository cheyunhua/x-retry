package com.example.config;

import com.example.ExampleClientHttpRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

/**
 * @author: www.byteblogs.com
 * @date : 2022-03-09 14:19
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate(ClientHttpRequestFactory factory){
        RestTemplate restTemplate = new RestTemplate(factory);
        restTemplate.setInterceptors(Collections.singletonList(new ExampleClientHttpRequestInterceptor()));
        return restTemplate;
    }

    @Bean
    public ClientHttpRequestFactory okHttp3ClientHttpRequestFactory(){
        OkHttp3ClientHttpRequestFactory factory = new OkHttp3ClientHttpRequestFactory();
        factory.setReadTimeout(5000);
        factory.setConnectTimeout(5000);
        factory.setConnectTimeout(3000);
        factory.setWriteTimeout(5000);
        return factory;
    }


}
