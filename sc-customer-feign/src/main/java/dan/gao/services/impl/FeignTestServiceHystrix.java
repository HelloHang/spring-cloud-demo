package dan.gao.services.impl;

import dan.gao.services.FeignTestService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author dangao on 4/25/2018.
 * @version 1.0
 */
@Component
public class FeignTestServiceHystrix implements FeignTestService

{
	@Override
	public String sayHiToService1(@RequestParam(value = "name") final String name)
	{
		return "hello" +name+", this messge send failed ";
	}
}
