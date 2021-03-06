package com.DWiZero.feignClient;

//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-demo",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi
{
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
