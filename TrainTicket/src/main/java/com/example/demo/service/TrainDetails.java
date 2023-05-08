package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.TrainDetailsRepository;

import jakarta.transaction.Transactional;

@Service
public class TrainDetails {
	@Autowired
	TrainDetailsRepository repo;

	
		public List<TrainDetails> fetchFoodDetailsByUsernamePrefix(String prefix)
		  {
		  	  return repo.findByUsernameStartingWith(prefix);
		  }
		  public List<TrainDetails> fetchFoodDetailsByUsernameSuffix(String suffix)
		  {
		  	  return repo.findByUsernameEndingWith(suffix);
		  }
		  public <TrainDetails> getTrainDetailsByFoodname(String foodname)
		  {
		  	  return repo.findByFoodname(foodname);
		  	  
		  }
		  
		  @Transactional
		  public int deleteTrainDetailsByUsername(String username)
		  {
		  	return repo.deleteTrainDetailssByUsername(username);
		  	
		  }
		  @Transactional
		  public int updateFoodDetails(String foodname,String username)
		  {
		  	return repo.TrainDetails(foodname, username);
		  }
	
}

}
