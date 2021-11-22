package com.example.register.repo;


import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.register.Regparm;


@Configuration
@ComponentScan
public interface Regrepo extends JpaRepository<Regparm, Integer>

{
	@Query("SELECT " + " id, firstname, lastname, email, dob, phone, pic_id, pic_name, pic_data, pic_type" +" FROM Regparm " )
	List<Object[]> getRepo();
}
