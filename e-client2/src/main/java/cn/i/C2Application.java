package cn.i;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * User: Young
 * Date: 2018/6/12 0012
 * Time: 16:30
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class C2Application {

    public static void main(String[] args) {
        SpringApplication.run(C2Application.class, args);
    }
}
