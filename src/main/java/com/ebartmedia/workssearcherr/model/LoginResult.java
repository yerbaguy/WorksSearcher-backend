package com.ebartmedia.workssearcherr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoginResult {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="success")
//	private Boolean success;
	private short success;
	
	@Column(name="username")
	private String username;

	
	
	public LoginResult() {
		
		
	}
	
	
	public LoginResult(int id, short success, String username) {
		
		this.id = id;
		this.success = success;
		this.username = username;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public short getSuccess() {
		return success;
	}


	public void setSuccess(short success) {
		this.success = success;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	
}
