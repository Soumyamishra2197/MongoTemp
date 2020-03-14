package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;

@Service("carService")
public class CarServiceImpl implements CarService{
	
	@Autowired
	MongoTemplate mongoTemplate;
	@Override
	public void create(Car car) {
		// TODO Auto-generated method stub
		mongoTemplate.insert(car);
	}

	@Override
	public void update(Car car) {
		
		
	}

	@Override
	public void delete(Car car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Car car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Car> showCar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car find(Car car) {
		// TODO Auto-generated method stub
		return null;
	}

}
