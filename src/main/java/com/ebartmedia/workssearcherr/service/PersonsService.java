package com.ebartmedia.workssearcherr.service;

import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;

//import com.ebartmedia.practiceexercise.dao.WordDAO;
import com.ebartmedia.workssearcherr.model.Persons;
import com.ebartmedia.workssearcherr.repository.PersonsRepository;
import java.util.List;


@Service
public class PersonsService {
	
	
	@Autowired
	private PersonsRepository personsRepository;

	
	
	
	public Persons save(Persons persons) {
		
		return personsRepository.save(persons);
	}
	
	
	
	public String getPassword(String username) {
		//public int getWord(int randplword) {	
			
		//  int n1 = 1;
			
			String getword = "";
//			int getword = 1;
			
			System.out.println(getword = personsRepository.getPassword(username));
//			System.out.println(getword = wordsRepository.getWord(getword));
			
			return getword;
			
//			return getword = wordsRepository.findWord(n1);

			
//			return getword;
			
		}
	
	
	
}
