package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		main2(args);
		SpringApplication.run(DemoApplication.class, args);
	}

	public static void main2(String[] args) {
		System.out.println("sample log message");
        Map<String, String> message = new HashMap<String, String>();
		message.put("key1", "value1");
		message.put("key2", "value2");
		message.put("key3", "value3");
		System.out.println(message);
		for(String key : message.keySet()){
			System.out.println(key + " : " + message.get(key));
		}
	}

}
