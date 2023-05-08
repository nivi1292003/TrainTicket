package com.example.demorepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demopojo.pojo;
@Repository
public interface repo extends JpaRepository<pojo,Integer> {

}

