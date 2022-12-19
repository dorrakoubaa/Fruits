package com.Souk.Fruits.service;

import java.util.ArrayList;  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Souk.Fruits.model.*;
import com.Souk.Fruits.reposetory.*;

//defining the business logic  
@Service 

public class FruitService {

	@Autowired  
	FruitRepository fR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Fruit> getAllFruits()   
	{  
		List<Fruit> Fruits = new ArrayList<Fruit>();  
		fR.findAll().forEach(Fruit -> Fruits.add(Fruit));  
		return Fruits;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Fruit getFruitsById(int id)   
	{  
		return fR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Fruit P)   
	{  
		fR.save(P);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		fR.deleteById(id);  
	} 
	
	public void update(Fruit f,int id) {
		fR.save(f);
	}

}


