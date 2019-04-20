package com.ebartmedia.workssearcherr.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ebartmedia.workssearcherr.model.LoginResult;

@Repository
//@Transactional
public class LoginResultDAOImpl implements LoginResultDAO {

	
	@PersistenceContext
    private EntityManager manager;
	
	
	@Override
	public boolean updateloginresult(Boolean success, String username) {
		// TODO Auto-generated method stub
	//	return false;
		
		success = true;
		username = "bartosz";
		
		
	    try {
	    	
	    	manager.createNamedQuery("updateLoginResult", LoginResult.class)
	    	.setParameter(1, success)
	    	.setParameter(2, username)
	    	.executeUpdate();
	    	
	    	return true;
	    }
	    catch (Exception e)
	    {
	    	return false;
	    }
	}

}
