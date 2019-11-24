
package com.spring.task.restApi;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.task.models.Couch;
import com.spring.task.models.Product;
import com.spring.task.repositories.ProductsRepository;

@RestController
@RequestMapping("/products")
public class ProductsController {

	/*
	 * @Autowired annotation creates an instance of CustomersRepository
	 */

	@Autowired
	private ProductsRepository repository;

	//add new product to prodrcts  should be checked once again 
	//via postman 
	//	http://localhost:8080/products
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Product> getAllCustomers() {
		return repository.findAll();
		
	}
	
	
	  @RequestMapping(value = "/couch", method = RequestMethod.POST)
	  public Couch createCouch(@Valid @RequestBody Couch couch ) {
	    couch.set_id(ObjectId.get());
	    repository.save(couch);
	    return couch;
	  }
	
	
}
