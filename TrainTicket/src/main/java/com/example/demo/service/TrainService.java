package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TrainEntity;
import com.example.demo.repository.TrainRepository;

@Service
public class TrainService {
	@Autowired
	TrainRepository frep;
	public TrainEntity addfood(TrainEntity sobj1) {
		
		return  frep.save(sobj1);
	}

	public List<TrainEntity> getfood() {
		return frep.findAll();
	}

}
}
