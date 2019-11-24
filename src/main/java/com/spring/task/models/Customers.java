package com.spring.task.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Customers {

	@Id
	public ObjectId _id;

	public String firstName;
	public String lastName;
	public String companyName;
	public String email;
	public String phone;

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customers(ObjectId _id, String firstName, String lastName, String companyName, String email, String phone) {
		super();
		this._id = _id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.email = email;
		this.phone = phone;
	}

	// ObjectId needs to be converted to string
	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
