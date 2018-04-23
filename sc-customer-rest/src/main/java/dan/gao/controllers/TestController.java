package dan.gao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author dangao on 4/20/2018.
 * @version 1.0
 */
@RestController
public class TestController
{
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/hi")
	public String test(@RequestParam final String name)
	{
		return restTemplate.getForObject("http://service1/hi?name=" + name, String.class);
	}
}
