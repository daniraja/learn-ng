package com.example.register.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.register.Regparm;
import com.example.register.dto.Regparmdto;

import com.example.register.repo.Regrepo;



@Controller
public class HomeController {

	

	
	
	@Autowired
	Regrepo repo;
	
	@RequestMapping("/")
	public String home() {
		
		return "home";
	}
	
/*	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping("/addRegis")
	public String addRegparm(Regparm regis) {
		System.out.println(regis.toString());
		repo.save(regis);
		return "home";
	} */
	
	
	
	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping("/addRegis")
	public ResponseEntity<?> addregis(@RequestBody Regparmdto regis) {
		Regparm new_Regparm = new Regparm();
		new_Regparm.setId(regis.getId());
		new_Regparm.setFirstname(regis.getFirstName());
		new_Regparm.setLastname(regis.getLastName());
		new_Regparm.setEmail(regis.getEmail());
		new_Regparm.setPhone(regis.getPhone());
		new_Regparm.setPassword(regis.getPassword());
		new_Regparm.setDob(regis.getDob());
		System.out.println(regis.toString());
		new_Regparm = repo.save(new_Regparm);
		BeanUtils.copyProperties(new_Regparm, regis);
		return ResponseEntity.ok().build();
	}
	
	@RequestMapping("/getRegis")
	public List<Regparm>getRepo(){
		List<Object[]> objectlist = repo.getRepo();
		List<Regparm> regparm1 = new ArrayList<Regparm>();
		if (objectlist.size() > 0) {
			objectlist.forEach(objlist -> {
				Regparm regparm = new Regparm();
				regparm.setId(((Integer) objlist[0]).intValue());
				regparm.setFirstname((String) objlist[1]);
				regparm.setLastname((String) objlist[2]);
				regparm.setEmail((String) objlist[3]);
				regparm.setPhone((String) objlist[4]);
				regparm.setPassword((String) objlist[5]);
				
			});
			return regparm1;
		}
		return regparm1;
		
		
		
	}
}
	

