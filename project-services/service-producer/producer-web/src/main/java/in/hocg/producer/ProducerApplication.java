package in.hocg.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by hocgin on 2019/3/21.
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
@SpringBootApplication
public class ProducerApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }
}