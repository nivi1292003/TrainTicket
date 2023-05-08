package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TrainDetails {
@Id
private int id;
private String Trainname;
private String username;
private int rating;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTrainname() {
	return Trainname;
}
public void setTrainname(String trainname) {
	Trainname = trainname;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
@Override
public String toString() {
	return "TrainDetails [id=" + id + ", Trainname=" + Trainname + ", username=" + username + ", rating=" + rating
			+ "]";
}


}
