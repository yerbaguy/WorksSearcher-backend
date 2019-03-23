package com.ebartmedia.workssearcher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ebartmedia.workssearcher.model.Persons;


@Repository
public interface PersonsRepository extends JpaRepository<Persons, Integer> {
	
	

}
