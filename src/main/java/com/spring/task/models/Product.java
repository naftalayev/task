package com.spring.task.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public abstract class Product {
	
	@Id
	public ObjectId _id;
	
	private Color color;
	private String model;
	private double price;
	
	
	public Product(ObjectId _id, Color color, String model, double price) {
		this._id=_id;
		this.color = color;
		this.model = model;
		this.price=price;
		
	}


	// ObjectId needs to be converted to string
	public String get_id() {
		return _id.toHexString();
	}
	
	public void set_id(ObjectId _id) {
		this._id = _id;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	

}
