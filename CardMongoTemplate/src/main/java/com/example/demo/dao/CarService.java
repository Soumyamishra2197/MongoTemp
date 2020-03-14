package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Car;

public interface CarService {
	
	public void create(Car car);
	
	public void update(Car car);
	
	public void delete(Car car);
	
	public void deleteAll(Car car);
	
	public List<Car> showCar();
	
	public Car find(Car car);

}
