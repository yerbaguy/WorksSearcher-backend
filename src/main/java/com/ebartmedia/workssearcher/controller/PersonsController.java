package com.ebartmedia.workssearcher.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebartmedia.workssearcher.model.Persons;
import com.ebartmedia.workssearcher.repository.PersonsRepository;
import com.ebartmedia.workssearcher.service.PersonsService;

@CrossOrigin(origins = {"http://localhost:4200"})

@RestController
@RequestMapping("/api")
public class PersonsController {
	
	
	@Autowired
	private PersonsService personsService;
	
	
	@Autowired
	private PersonsRepository personsRepository;

	
	
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public String create(@RequestBody Persons persons) {
		
		 String wordid = "";
		
		try {
			
			personsService.save(persons);
			
		//	wordid = String.valueOf(persons.getId());
			
		} catch(Exception ex) {
			
			return "Error while inserting the word:" + ex.toString();
		}
		
		return "Word successfully inserted with id = " + wordid;
		
		
	}
	
	
	@RequestMapping(value = "/toLogin", method = RequestMethod.POST)
	@ResponseBody
	public List<Persons> toLogin(@RequestBody Persons persons) {
		
		
		String usern = "";
		String em = "";
		String pass = "";
		
		usern = persons.getUsername();
		em = persons.getEmail();
		pass = persons.getPassword();
		
		System.out.println("persons" + persons);
		
		System.out.println("toLogin - username" + usern);
		System.out.println("toLogin - email" + em);
		System.out.println("toLogin - password" + pass);
		
		persons.setUsername(usern);
		persons.setEmail(em);
		persons.setPassword(pass);
		
		
		List<Persons> p = new ArrayList<Persons>();
		
		
		p.add(new Persons(usern, em, pass));
		
		return p;
	   
		
	}
	
	
	
	
}
