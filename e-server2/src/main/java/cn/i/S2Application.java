package cn.i;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * User: Young
 * Date: 2018/6/12 0012
 * Time: 18:11
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@EnableEurekaServer
@SpringBootApplication
public class S2Application {

    public static void main(String[] args) {
        SpringApplication.run(S2Application.class, args);
    }
}
