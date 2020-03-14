package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.demo.dao.CarService;
import com.example.demo.model.Car;
@Import(MongoConfig.class)
@SpringBootApplication
public class CardMongoTemplateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(CardMongoTemplateApplication.class, args);		
		
		CarService carService=(CarService) context.getBean("carService");
		
		Car wagon=new Car("wagon","suzuki");
		carService.create(wagon);
		
		Car centro=new Car("centro","hyundai");
		carService.create(centro);
		
		Car swift=new Car("swift","honda");
		carService.create(swift);
		
		System.out.println("Findone...."+carService.find(swift));
		
		
			
		context.close();
		
	}

}
