package com.example.demoController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demopojo.pojo;
import com.example.demoservice.service;

public class Controller {
	@RestController
	@RequestMapping("/customer")
	public class controller {
		@Autowired
		service cusservice;
		
		@PostMapping("")
		public String create(@RequestBody pojo customer)
		{
			return cusservice.addCustomer(customer);
		}
		@GetMapping("")
		public List<pojo> read()
		{
			return cusservice.getCustomer();
		}
		@GetMapping("/{id}")
		public Optional<pojo>readById(@PathVariable int id)
		{
			return cusservice.getCustomerById(id);
		}
		@PutMapping("/put")
		public String update(@RequestBody pojo customer)
		{
			return cusservice.updateCustomer(customer);
		}
		@DeleteMapping("/delete")
		public String delete(@RequestParam("cid") int id)
		{
			cusservice.deleteByRequestParam(id);
			return "deleted";
		}
	}
}
