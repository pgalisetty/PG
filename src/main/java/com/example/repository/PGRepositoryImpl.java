package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.modal.PriyathamGalisetty;

@Component
public abstract class PGRepositoryImpl implements PGRepository {
	
	
	@Override
	public List<PriyathamGalisetty> findByFirstName(String firstName) {
		return null;
	}

}
