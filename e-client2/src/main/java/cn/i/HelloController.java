package cn.i;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Young
 * Date: 2018/6/12 0012
 * Time: 17:09
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
@RequestMapping()
public class HelloController {

    @RequestMapping("/info")
    public String Hello(){
        return "hello xxx，this is demo-client1 messge";
    }
    /*
        服务提供者
     */
    @RequestMapping("/producerHello")
    public String Hello(@RequestParam("name") String name){
        return "hello " + name + "，this is demo-client2 aaa messge";
    }
}
