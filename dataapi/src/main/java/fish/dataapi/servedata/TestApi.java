package fish.dataapi.servedata;

import fish.service.api.TestControl;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi implements TestControl {
    @Override
    public String sayHelloFish() {
        return "Hello Fish";
    }
}
