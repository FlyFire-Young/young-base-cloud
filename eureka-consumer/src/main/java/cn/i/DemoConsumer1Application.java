package cn.i;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * User: Young
 * Date: 2018/6/12 0012
 * Time: 17:23
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@EnableCircuitBreaker
public class DemoConsumer1Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoConsumer1Application.class, args);
    }

}
