package com.example.demo;



import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.WriteResultChecking;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.demo.dao.CarDao;
import com.mongodb.MongoClient;
import com.mongodb.WriteConcern;

@Configuration
@EntityScan("com.example.demo.model")
@EnableMongoRepositories(basePackageClasses = CarDao.class)
public class MongoConfig{
	
	@Bean
	MongoTemplate mongoTemplate(MongoDbFactory dbFactory,MongoConverter converter) {
		
		MongoTemplate mongoTemplate=new MongoTemplate(dbFactory,converter);
		
		mongoTemplate.setWriteConcern(WriteConcern.MAJORITY);
		mongoTemplate.setWriteResultChecking(WriteResultChecking.EXCEPTION);
		
		return mongoTemplate;
	}

	

}
