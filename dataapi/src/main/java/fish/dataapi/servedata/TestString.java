package fish.dataapi.servedata;

import fish.service.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * 测试字符串
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/10/27 22:12
 */
@RestController
public class TestString {
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
        return new User("fish",30);
    }
}
