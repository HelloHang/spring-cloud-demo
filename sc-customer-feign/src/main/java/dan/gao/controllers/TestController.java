package dan.gao.controllers;

import dan.gao.services.FeignTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author dangao on 4/20/2018.
 * @version 1.0
 */
@RestController
public class TestController
{
	@Autowired
	private FeignTestService feignTestService;

	@RequestMapping("/hi")
	public String test(@RequestParam final String name)
	{
		return feignTestService.sayHiToService1(name);
	}
}
