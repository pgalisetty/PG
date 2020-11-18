package com.example.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.modal.PriyathamGalisetty;

@Service
public interface PriyathamGalisettyDAO {
	List<PriyathamGalisetty> findByFirstName(String firstName);

	List<PriyathamGalisetty> getAllData();

	int deletefromPG(String firstName);

	Boolean insertintoPG();

	int updatePG();
}
