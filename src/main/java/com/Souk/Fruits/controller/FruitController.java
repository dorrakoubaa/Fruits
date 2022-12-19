package com.Souk.Fruits.controller;


import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Souk.Fruits.model.Fruit;
import com.Souk.Fruits.service.*;


//mark class as Controller  


@RestController 
@CrossOrigin(origins = "*")
//@RequestMapping("/api")
public class FruitController {

	//autowire the BooksService class  
	@Autowired  
	FruitService fS;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/fruits")

	private List<Fruit> getAllFruits()   
	{  
		return fS.getAllFruits();  
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/fruits/{Fruitid}")  
	private Fruit getFruit(@PathVariable("Fruitid") int Fruitid)   
	{  
		return fS.getFruitsById(Fruitid);  
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/fruits/{Fruitid}")  
	private void deleteFruit(@PathVariable("Fruitid") int Fruitid)   
	{  
		fS.delete(Fruitid);  
	} 

	@PostMapping("/fruits")  
	private int saveFruit(@RequestBody Fruit Fruit)   
	{  
		fS.saveOrUpdate(Fruit);  
		return Fruit.getId();  
	} 

}  


