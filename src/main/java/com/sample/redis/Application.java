package com.sample.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sample.redis.service.IRedisService;

/**
 * @author szl
 *
 */
@SpringBootApplication
public class Application implements CommandLineRunner{
	@Autowired
	private IRedisService service;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args).close();
	}

	@Override
	public void run(String... args) throws Exception {
		boolean hasName = service.hasKey("name");
		System.out.println("=======================================");
		System.out.println("Is redis has a 'neme' key? -> "+hasName);
		service.saveObject("name", "Hello redis cluster");
		hasName = service.hasKey("name");
		System.out.println("After add key 'name', Is redis has a 'neme' key? -> "+hasName);
		if(hasName){
			String val = service.get("name", String.class);
			System.out.println("The value of key 'neme' is "+val);
		}
		service.remove("name");
		hasName = service.hasKey("name");
		System.out.println("After remove the 'name' key , is redis has a 'neme' key? -> "+hasName);
		System.out.println("=======================================");
	}
}
