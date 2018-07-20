package cn.io;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User: Young
 * Date: 2018/6/22 0022
 * Time: 14:05
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
@EnableBinding(Source.class)
public class SpringCloudStreamBindingSourceApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringCloudStreamBindingSourceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStreamBindingSourceApplication.class, args);
    }

    @InboundChannelAdapter(value = Source.OUTPUT)
    public String timerMessageSource() {
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        logger.info("publish message :" + format);
        return format;
    }
}