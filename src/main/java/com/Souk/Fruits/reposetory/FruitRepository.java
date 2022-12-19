package com.Souk.Fruits.reposetory;
import org.springframework.data.repository.CrudRepository;
import com.Souk.Fruits.model.*;


//repository that extends CrudRepository  
public interface FruitRepository extends CrudRepository<Fruit, Integer>  {

}  

