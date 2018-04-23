package dan.gao.controllers;

import org.springframework.beans.factory.annotation.Value;
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

	@Value("${server.port}")
	private String port;

	@RequestMapping("/hi")
	public String test(@RequestParam final String name)
	{
		return "Hi" + name + ", I start service1 at port" + port;
	}
}
