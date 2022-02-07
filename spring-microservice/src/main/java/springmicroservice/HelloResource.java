package springmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloResource {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello...";
	}
	
	@GetMapping("/hello-client")
	public String helloClient() {
		String res = restTemplate.getForObject("http://SPRING-MICROSERVICE-CLIENT/hello", String.class);
		return res;
	}

}
