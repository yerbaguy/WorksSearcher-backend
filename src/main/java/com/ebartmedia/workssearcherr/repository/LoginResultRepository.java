package com.ebartmedia.workssearcherr.repository;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ebartmedia.workssearcherr.model.LoginResult;


@Repository
//public interface LoginResultRespository extends JpaRepository<LoginResult, Integer> {
public interface LoginResultRepository extends CrudRepository<LoginResult, Integer> {	
	
	
	@Transactional
	@Modifying
//	@Query("UPDATE LoginResult r SET r.success= :success, r.username= :username WHERE r.id=1")
//	void updloginresult(@Param("success")boolean success, @Param("username") String username);
	@Query("UPDATE LoginResult r SET r.success= :success, r.username= :username WHERE r.id=1")
	void updloginresult(@Param("success")short success, @Param("username") String username);
	
	@Transactional
	@Modifying
	@Query("UPDATE LoginResult r SET r.success= :success WHERE r.id=1")
	void updateloginresult(@Param("success")short success);
	
	
//	@Query("SELECT l.id, l.success, l.username FROM LoginResult l WHERE l.id = 1")
	@Query("SELECT l FROM LoginResult l")
//	LoginResult getLoginResult();
	ArrayList<LoginResult> getLoginResult();
	
	
	

}
