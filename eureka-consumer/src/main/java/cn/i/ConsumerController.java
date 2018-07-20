package cn.i;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Young
 * Date: 2018/6/12 0012
 * Time: 17:25
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
@RequestMapping()
public class ConsumerController {

    @Autowired
    HelloRemote helloRemote;

    /*
        消费者的接口，去调用服务提供者
        问题：只能使用@RequestMapping("/consumerHello/{name}")  @PathVariable("name")方法 不知道有没有其它方式代替？
     */
    @HystrixCommand(fallbackMethod = "defaultStores")
    @RequestMapping("/consumerHello/{name}")
    public String index(@PathVariable("name") String name){
        return helloRemote.sayHello(name);
    }

    public String defaultStores(String name) {
        return "Hystrix Circuit breaker";
    }
    //有问题的
//    @RequestMapping("/consumerHello2")
//    public String index2(@RequestParam("name") String name){
//        return helloRemote.sayHello(name);
//    }
    @RequestMapping("/info")
    public String info(){
        return " Hi,I am a consumer!";
    }
}
