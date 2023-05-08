package com.example.demopojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="Train ticket")
public class pojo {
	@Id
	private int id;
	private String passengername;
	private int passengerid;
	private int date;
	private String arrival;
	private String depature;
	private int trainno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassengername() {
		return passengername;
	}
	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}
	public int getPassengerid() {
		return passengerid;
	}
	public void setPassengerid(int passengerid) {
		this.passengerid = passengerid;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDepature() {
		return depature;
	}
	public void setDepature(String depature) {
		this.depature = depature;
	}
	public int getTrainno() {
		return trainno;
	}
	public void setTrainno(int trainno) {
		this.trainno = trainno;
	}

	
}

