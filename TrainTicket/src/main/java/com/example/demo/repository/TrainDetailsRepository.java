package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TrainDetails;

@Repository
public interface TrainDetailsRepository extends JpaRepository<TrainDetails, Integer> {
	
	List <TrainDetails>findByUsernameStartingWith(String prefix);
	   
	List <TrainDetails>findByFoodname(String foodname);

}
