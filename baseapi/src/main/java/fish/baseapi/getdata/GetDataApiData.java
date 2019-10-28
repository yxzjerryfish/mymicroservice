package fish.baseapi.getdata;

import fish.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试通过DataApi获取数据
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/10/27 22:16
 */
@RestController
public class GetDataApiData {
    @Autowired
    TestReciveData testReciveData;

    @RequestMapping("/base/hello")
    public String getHello(){
        return testReciveData.hello();
    }

    @RequestMapping("/base/hello/{id}")
    public String getHello(@PathVariable String id){
        return testReciveData.sayhello(id);
    }

    @RequestMapping("/base/hellofish")
    public User getHelloFish(){
        return testReciveData.sayHello();
    }

}
