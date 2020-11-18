package com.example.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.modal.PriyathamGalisetty;

@Repository
public interface PGRepository extends CrudRepository<PriyathamGalisetty, Long>{
	
	List<PriyathamGalisetty> findByFirstName(String firstName);
	

}
