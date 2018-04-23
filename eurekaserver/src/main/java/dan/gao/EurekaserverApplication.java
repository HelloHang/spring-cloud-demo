package dan.gao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @author dangao on 4/20/2018.
 * @version 1.0
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaserverApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(EurekaserverApplication.class, args);
	}
}
