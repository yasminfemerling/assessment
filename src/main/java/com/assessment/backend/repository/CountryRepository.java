package com.assessment.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessment.backend.model.Countries;

@Repository
public interface CountryRepository extends JpaRepository<Countries,Integer> {
	
	List<Countries> findAll();
	

}
