package fish.baseapi.getdata;

import org.springframework.beans.factory.annotation.Autowired;
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
}
