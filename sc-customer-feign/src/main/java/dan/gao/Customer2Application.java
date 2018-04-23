package dan.gao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * @author dangao on 4/20/2018.
 * @version 1.0
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Customer2Application
{
	public static void main(String[] args)
	{
		SpringApplication.run(Customer2Application.class, args);
	}
}
