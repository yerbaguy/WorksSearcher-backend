package com.ebartmedia.workssearcher.service;

import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;

//import com.ebartmedia.practiceexercise.dao.WordDAO;
import com.ebartmedia.workssearcher.model.Persons;
import com.ebartmedia.workssearcher.repository.PersonsRepository;
import java.util.List;


@Service
public class PersonsService {
	
	
	@Autowired
	private PersonsRepository personsRepository;

	
	
	
	public Persons save(Persons persons) {
		
		return personsRepository.save(persons);
	}
	
	
}
