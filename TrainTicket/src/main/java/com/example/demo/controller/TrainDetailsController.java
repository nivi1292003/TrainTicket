package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TrainDetails;

@RestController
public class TrainDetailsController {
	@Autowired 
	TrainDetails food;
	
	@GetMapping("/Prefix/{prefix}")
	  public List<TrainDetails>fetchFoodDetailsByUsernamePrefix(@PathVariable String prefix)
	  {
	  	return food.fetchTrainDetailsByUsernamePrefix(prefix);
	  }
	  @GetMapping("/Suffix/{suffix}")
	  public List<TrainDetails>fetchStudentsByUsernameSuffix(@PathVariable String suffix)
	  {
	  	return food.fetchFoodDetailsByUsernameSuffix(suffix);
	  }
	  @GetMapping("/get/{foodname}")
	  public List<TrainDetails>fetchStudentsByDepartment(@PathVariable String foodname)
	  {
	  	return food.getFoodDetailsByFoodname(foodname);
	  }
	  
	  
	  
	  @DeleteMapping("/deleteby/{username}")
	  public String deleteStudentByUsername(@PathVariable("username") String username)
	  {
	  	int result=food.deleteTrainDetailsByUsername(username);
	  	if(result>0)
	  		return " Food record deleted";
	  	else
	  		return " couldn't deleted ";
	  }
	  
	  
	  @PutMapping("/update/{foodname}/{username}")
	  public String UpdateFoodDetails(@PathVariable ("foodname")String foodname,@PathVariable ("username")String username)
	  {
	  	int result= food.updateTrainDetails(foodname,username);
	  	if(result>0)
	  		return "Food record updated";
	  	else
	  		return "couldn't updated";
	  	
	  	
	  }

}

}
