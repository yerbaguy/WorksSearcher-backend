package com.ebartmedia.workssearcherr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ebartmedia.workssearcherr.model.Persons;


@Repository
public interface PersonsRepository extends JpaRepository<Persons, Integer> {
	
	
	
@Query("SELECT w.password FROM Persons w WHERE w.username= :username")
	
//	@Query("SELECT w.plword FROM Words w WHERE id= :n1")
//	@Query("SELECT w.plword FROM Words w WHERE w.id= :n1")
	public String getPassword(@Param("username")String username);

}
