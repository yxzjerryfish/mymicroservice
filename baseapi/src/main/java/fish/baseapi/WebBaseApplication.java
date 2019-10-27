package fish.baseapi;

import fish.service.api.ServiceSayHello;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

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
@EnableFeignClients
public class WebBaseApplication implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(WebBaseApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        new ServiceSayHello().say(Thread.currentThread().getName());
    }
}
