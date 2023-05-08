package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.TrainEntity;
import com.example.demo.service.TrainService;

public class TrainControler {
	@Autowired
 TrainService fserv;
	
	@PostMapping("/postdetails")
	public TrainEntity add(@RequestBody TrainEntity sobj1 )
	{
		return fserv.addfood(sobj1);
	}
	@GetMapping("/getdetails")
	public List <TrainEntity> get()
	{
		return fserv.getfood();
		
	}

}

}
