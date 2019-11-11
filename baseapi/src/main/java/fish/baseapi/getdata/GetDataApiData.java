package fish.baseapi.getdata;

import fish.service.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 测试通过DataApi获取数据
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/10/27 22:16
 */
@RestController
@Api(value = "测试接口",tags = {"测试feign传送过来的值"})
public class GetDataApiData {
    @Autowired
    TestReciveData testReciveData;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/base/hello")
    @ApiOperation(value = "通过feign获取hello")
    public String getHello(){
        return testReciveData.hello();
    }

    @ApiOperation(value = "通过feign sayHello")
    @RequestMapping("/base/hello/{id}")
    public String getHello(@PathVariable String id){
        return testReciveData.sayhello(id);
    }

    @ApiOperation(value = "通过feign调用无参hello")
    @RequestMapping("/base/hellofish")
    public User getHelloFish(){
        return testReciveData.sayHello();
    }

    @ApiOperation(value = "没有用feign来尝试调用微服务")
    @RequestMapping("/nofeign/hello")
    public String getnofeignHello(){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://DATABASE/hello",String.class);
        return responseEntity.getBody();
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
