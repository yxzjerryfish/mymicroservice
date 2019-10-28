package fish.baseapi.getdata;

import fish.service.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试调用data的来接收数据
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/10/27 22:13
 */
@FeignClient(value = "database")
public interface TestReciveData {
    @RequestMapping("/hello")
    String hello();

    @RequestMapping("/sayhello")
    String sayhello(String id);

    @RequestMapping("/hellofish")
    User sayHello();
}
