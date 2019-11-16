package fish.dataapi.servedata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("fish.dataapi")
public class DataBaseConfig {
}
