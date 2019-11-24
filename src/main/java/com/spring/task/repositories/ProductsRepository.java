package com.spring.task.repositories;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.task.models.Product;




public interface ProductsRepository extends MongoRepository<Product, String> {

	Product findBy_id(ObjectId _id);
	
	
}

