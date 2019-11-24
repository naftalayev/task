package com.spring.task.models;

import org.bson.types.ObjectId;

public class Couch extends Product {

	private Color color;
	private String height;
	private String depth;
	private String lenth;
	private double price;
//	private Model model;
	private String model;

	public Couch(ObjectId _id,Color color, String height, String depth, String lenth, double price, String model) {
		super(_id,color, model, price);
		this.height = height;
		this.depth = depth;
		this.lenth = lenth;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	public String getLenth() {
		return lenth;
	}

	public void setLenth(String lenth) {
		this.lenth = lenth;
	}

}
