package cn.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shannon
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Ch35EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch35EurekaClientApplication.class, args);
    }
}
