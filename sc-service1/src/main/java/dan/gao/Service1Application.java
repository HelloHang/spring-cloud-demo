package dan.gao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author dangao on 4/20/2018.
 * @version 1.0
 */

@EnableEurekaClient
@SpringBootApplication
public class Service1Application
{
	public static void main(String[] args)
	{
		SpringApplication.run(Service1Application.class, args);
	}
}
