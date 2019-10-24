package fish.baseapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * WebBaseApi
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/10/24 21:28
 */
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class WebBaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebBaseApplication.class, args);
    }
}
