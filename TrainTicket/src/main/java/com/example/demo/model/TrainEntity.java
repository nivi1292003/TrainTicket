package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TrainEntity {
@Id
@GeneratedValue
private int tno;
private String tname;
public int getTno() {
	return tno;
}
public void setTno(int tno) {
	this.tno = tno;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String toString() {
	return "TrainEntity [tno=" + tno + ", tname=" + tname + ", tprice=" + "]";
}
public TrainEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public int gettno() {
	return tno;
}
public void setFno(int tno) {
	this.tno = tno;
}
public String gettname() {
	return tname;
}
public void settname(String tname) {
	this.tname = tname;
}



}
