package fish.baseapi.getdata;

import fish.service.api.TestControl;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "database")
public interface BaseTestControl extends TestControl {
}
