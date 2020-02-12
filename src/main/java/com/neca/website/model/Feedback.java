package com.neca.website.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {

	@Id
	private int id;
	private String name;
	private String email;
	private String message;
	private int rating;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Feedback [name=" + name + ", email=" + email + ", message=" + message + ", rating=" + rating + "]";
	}
	
}
