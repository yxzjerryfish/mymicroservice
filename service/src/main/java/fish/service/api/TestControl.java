package fish.service.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface TestControl {

    @GetMapping("/test/sayhello")
    public String sayHelloFish();
}
