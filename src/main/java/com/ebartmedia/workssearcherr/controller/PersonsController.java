package com.ebartmedia.workssearcherr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebartmedia.workssearcherr.model.Persons;
import com.ebartmedia.workssearcherr.model.LoginResult;
import com.ebartmedia.workssearcherr.service.LoginResultService;
import com.ebartmedia.workssearcherr.service.PersonsService;

@RestController
@RequestMapping("/api")
public class PersonsController {

	
	@Autowired
	private LoginResultService loginResultService;
	
	@Autowired
	private PersonsService personsService;
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/tologin", method = RequestMethod.POST)
	@ResponseBody
//	public String create(@RequestBody Persons persons) {
//	public String toLogin(Persons persons) {	
	public List<LoginResult> toLogin(Persons persons) {	
		
	//	Boolean success = false;
		 
		short success;
		
		LoginResult loginResult = new LoginResult();

		String username = "";
		String password = "";
		String passFromDb = "";
		
		List<LoginResult> lResult = new ArrayList<LoginResult>();
		
		
		
		
		
		username = persons.getUsername();
		password = persons.getPassword();
		
		System.out.println("loLogin" + username);
		System.out.println("toLogin" + password);
		
		
		passFromDb = personsService.getPassword(username);
		
		System.out.println("Password for the" + username + "found in db" + passFromDb);
		
		
          if (password.equals(passFromDb)) {
			
			System.out.println("Password is OK");
			
            success = 1;       
			
//			loginResult.setUsername(username);
//			loginResult.setSuccess(success);
			
			
			
			
			loginResultService.updloginresult(success, username);
            
          
		
          } else {
        	  
        	  System.out.println("Password not OK");
        	  
        	  success = 0;
  			
//  			loginResult.setUsername(username);
//  			loginResult.setSuccess(success);
  			
//  			loginResultService.updloginresult(success, username);
  			
  			
          }
		
		
		
		
		//return "Word successfully inserted with id = " + wordid;
		
	//	return username;
		return lResult;
	}
	
	
	
	
	
	
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
//	public String create(@RequestBody Persons persons) {
	public String create(Persons persons) {	
		
		 String wordid = "";
		 
		 Boolean success = true;
		 String username = "bartosz";
		
		 int id = 1;
		 
		 LoginResult loginResult = new LoginResult();
		 
		 
		 loginResult.setId(1);
//		 loginResult.setSuccess(success);
//		 loginResult.setUsername(username);
		 
	//	 loginResultService.updloginresult(id, loginResult);
		 
//		 loginResultService.updloginresult(success, username);
		 
		try {
			
			personsService.save(persons);
			
		//	wordid = String.valueOf(persons.getId());
			
		} catch(Exception ex) {
			
			return "Error while inserting the word:" + ex.toString();
		}
		
		return "Word successfully inserted with id = " + wordid;
		
		
	}
	
	
	
	@RequestMapping(value = "/getotherresult", method = RequestMethod.GET)
    public List<LoginResult> getOtherResult() {
//	public String getOtherResult() {	
		
		String username = "";
		
		List<LoginResult> lResult = new ArrayList<LoginResult>();
		
		username = "lakjsdf";
		
		
	      lResult = loginResultService.getLoginResult();
		
		
	      username = lResult.get(0).getUsername();
	      
		  
		//  System.out.println("getotherresult" + lResult);
		  
		  System.out.println("getotherresult" + lResult.get(0).getUsername());
		  
		  
		
	//	return username;
		return lResult;
	}
	
	
	@RequestMapping(value = "/tologout", method = RequestMethod.POST)
    public List<LoginResult> logouUser() {
//	public String getOtherResult() {	
	
	
		LoginResult loginResult = new LoginResult();
		
		List<LoginResult> lResult = new ArrayList<LoginResult>();
	
		short success = 0;
		String username = "";
	
		loginResult.setSuccess(success);
		
		loginResultService.updateLoginResult(success);
		
	    lResult.add(loginResult);
		
		return lResult;
	}
	
	
	@RequestMapping(value = "/fromlogout", method = RequestMethod.GET)
    public List<LoginResult> fromlogouUser() {
//	public String getOtherResult() {	
	
	
		LoginResult loginResult = new LoginResult();
		
		List<LoginResult> lResult = new ArrayList<LoginResult>();
	
		short success = 0;
		String username = "";
	
	//	loginResult.setSuccess(success);
		
	//	loginResultService.updateLoginResult(success);
		
	//    lResult.add(loginResult);
		
		lResult = loginResultService.getLoginResult();
		
		success = lResult.get(0).getSuccess();
		
		System.out.println("fromlgoutUser" + success);
		
		return lResult;
	}
	
}
