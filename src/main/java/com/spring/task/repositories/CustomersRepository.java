package com.spring.task.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.task.models.Customers;

public interface CustomersRepository extends MongoRepository<Customers, String> {

	Customers findBy_id(ObjectId _id);
	
	
}