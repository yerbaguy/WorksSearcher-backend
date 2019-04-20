package com.ebartmedia.workssearcherr.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebartmedia.workssearcherr.dao.LoginResultDAO;
import com.ebartmedia.workssearcherr.model.LoginResult;
import com.ebartmedia.workssearcherr.repository.LoginResultRepository;

@Service
public class LoginResultService {
	
	
	
	@Autowired
	private LoginResultRepository loginResultRepository;
	
	
	@Autowired
	private LoginResultDAO loginResultDAO;
	
	
	public ArrayList<LoginResult> getLoginResult() {
//		  public String getLoginResult() {	  
			  
			  
			  return  loginResultRepository.getLoginResult();
			  
		  }
	
	
	  
	 // public void updloginresult(Boolean success, String username) {
	//  public void updloginresult(int id, LoginResult loginResult) { here 
	//	  public void updloginresult(LoginResult loginResult) {   
	 public void updloginresult(short success, String username) {
		  //  public void updloginresult() {	
		    	
		    //	success = false;
		    	
		 //   	loginResultRepository.updloginresult(resultt);
		  
//		  loginResultRepository.updloginresult(success, username); here
		//  loginResultDAO.updateloginresult(success, usern);
		    //	loginResultDAO.updateLoginResult(success, username);
		 // loginResultRepository.save(loginResult);
		  loginResultRepository.updloginresult(success, username);
//		  loginResultDAO.updateloginresult(success, username);
//		    	loginResultDAO.updateLoginResult(loginResult);
		  //  	loginResultRepository.updloginresult();
		    }
	  
	  
	  public void updateLoginResult(short success) {
		  
		  
		  loginResultRepository.updateloginresult(success);
		  
	  }

}
