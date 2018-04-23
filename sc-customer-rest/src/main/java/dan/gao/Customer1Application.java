package dan.gao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * @author dangao on 4/20/2018.
 * @version 1.0
 */

@SpringBootApplication
@EnableDiscoveryClient
public class Customer1Application
{
	public static void main(String[] args)
	{
		SpringApplication.run(Customer1Application.class, args);
	}

	@Bean
	@LoadBalanced //增加负载均衡
	RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}
