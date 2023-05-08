package com.example.demo.modelO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class Omodel {
	@Id
	private int id;
	private String passengername;
	private String coachname;
	private int coachnumber;
	private String arrival;
	private String depature;
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
	public String getCoachname() {
		return coachname;
	}
	public void setCoachname(String coachname) {
		this.coachname = coachname;
	}
	public int getCoachnumber() {
		return coachnumber;
	}
	public void setCoachnumber(int coachnumber) {
		this.coachnumber = coachnumber;
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
	@Override
	public String toString() {
		return "pojoclass [id=" + id + ", passengername=" + passengername + ", coachname=" + coachname
				+ ", coachnumber=" + coachnumber + ", arrival=" + arrival + ", depature=" + depature + "]";
	}
	
	

}
