package org.example;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{
    /*@Autowired
    @Lazy
    private EurekaClient eurekaClient;*/

    @GetMapping("/abc")
    public void test(){
        System.out.println("Hello World");
    }
}
