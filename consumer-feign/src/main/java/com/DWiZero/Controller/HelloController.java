package com.DWiZero.Controller;

import com.DWiZero.feignClient.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping("/hi")
    public String home(@RequestParam String name)
    {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
