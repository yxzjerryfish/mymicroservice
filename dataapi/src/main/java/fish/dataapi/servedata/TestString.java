package fish.dataapi.servedata;

import fish.service.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * 测试字符串
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/10/27 22:12
 */
@Slf4j
@RestController
public class TestString {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String getHello(){
        return "Hello Microservice";
    }

    @RequestMapping("/sayhello")
    public String sayHello(@RequestBody String id){
        return "Hello" + id;
    }

    @RequestMapping("/hellofish")
    public User sayHelloUser(){
        return new User("fish",30,null);
    }

    @RequestMapping("/hello/get")
    public String sayHello(){
        log.info("不通过微服务，只通过spring自带的resttemplate来访问");
        return restTemplate.getForObject("http://localhost:9090/hello",String.class);
    }

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
