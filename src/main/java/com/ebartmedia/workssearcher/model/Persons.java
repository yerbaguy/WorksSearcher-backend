package com.ebartmedia.workssearcher.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Persons {
	
	
	
      private @Id
      @GeneratedValue
      int id;
      
      private String username;
      
      private String email;
      
      private String password;
      
      
      
      public Persons() {
    	  
    	  
      }
      
      public Persons(String username, String email, String password) {
    	  
    	  this.username = username;
    	  this.email = email;
    	  this.password = password;
    	  
      }
      
      public void setUsername(String username) {
    	  
    	  this.username = username;
      }
      
      public String getUsername() {
    	  
    	  return this.username;
      }
      
      public void setEmail(String email) {
    	  
    	  this.email = email;
      }
      
      public String getEmail() {
    	  
    	  return this.email;
      }
      
      public void setPassword(String password) {
    	  
    	  this.password = password;
      }
      
      public String getPassword() {
    	  
    	  return this.password;
      }

}
