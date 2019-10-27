package fish.dataapi.servedata;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
