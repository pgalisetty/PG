package com.example.service.impl;

import java.util.List;
import java.lang.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.PriyathamGalisettyDAO;
import com.example.modal.PriyathamGalisetty;
import com.example.service.PGService;

@Component
public class PGServiceImpl implements PGService{
	
	@Autowired
	PriyathamGalisettyDAO pgdao;
	
	@Override
	public List<PriyathamGalisetty> getPG(String firstName) {
		return pgdao.findByFirstName(firstName);
	}

	@Override
	public List<PriyathamGalisetty> getAllData() {
		return pgdao.getAllData();
	}

	@Override
	public int deletefromPG(String firstName) {
		
		return pgdao.deletefromPG(firstName);
	}

	@Override
	public Boolean insertintoPG() {
		// TODO Auto-generated method stub
		return pgdao.insertintoPG();
	}

	@Override
	public int updatePG() {
		// TODO Auto-generated method stub
		return  pgdao.updatePG();
	}

}
