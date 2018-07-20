package cn.i;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/6/12 0012.
 */
@Service
@FeignClient(name = "service-hi")
public interface HelloRemote {
    //需要匹配服务提供者接口名称
    @RequestMapping(value = "/producerHello")
    public String sayHello(@RequestParam(value = "name") String name);
}


