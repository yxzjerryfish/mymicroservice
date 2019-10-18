package fish.dataapi;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class DataBaseApplication implements ApplicationRunner {


	public static void main(String[] args) {
		SpringApplication.run(DataBaseApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
	}


}
