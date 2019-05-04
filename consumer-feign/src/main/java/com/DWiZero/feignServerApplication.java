package com.DWiZero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableZuulProxy
@EnableHystrix
@SpringBootApplication
@EnableFeignClients
public class feignServerApplication
{

    public static void main(String[] args) {
        SpringApplication.run(feignServerApplication.class, args);
    }
}
