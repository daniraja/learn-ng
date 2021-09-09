package com.example.register.repo;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

import com.example.register.Regparm;


@Configuration
@ComponentScan
public interface Regrepo extends CrudRepository<Regparm, Integer>

{
	List<Regparm>findByid(int id);
	
}
