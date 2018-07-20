package cn.is;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * User: Young
 * Date: 2018/6/22 0022
 * Time: 14:01
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
@EnableBinding(Sink.class)
public class SpringCloudStreamBindingInputApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringCloudStreamBindingInputApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStreamBindingInputApplication.class, args);
    }

    @StreamListener(Sink.INPUT)
    public void sinkMessage(Object message) {
        logger.info("received message: " + message);
    }
}
