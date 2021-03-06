package dan.gao.services;

import dan.gao.services.impl.FeignTestServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author dangao on 4/20/2018.
 * @version 1.0
 */

@FeignClient(value = "service1", fallback = FeignTestServiceHystrix.class)
public interface FeignTestService
{
	@RequestMapping(value = "/hi")
	String sayHiToService1(@RequestParam(value = "name") final String name);
}
